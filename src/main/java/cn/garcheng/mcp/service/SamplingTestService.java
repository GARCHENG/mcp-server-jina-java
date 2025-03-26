package cn.garcheng.mcp.service;

import com.alibaba.fastjson2.JSON;
import io.modelcontextprotocol.server.McpSyncServer;
import io.modelcontextprotocol.server.McpSyncServerExchange;
import io.modelcontextprotocol.spec.McpSchema;
import jakarta.annotation.Resource;
import org.springframework.ai.chat.model.ToolContext;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassDescription:
 * @Author: GARCHENG
 * @Created: 2025/3/18 15:20
 */

@Service
public class SamplingTestService {

    @Resource
    @Lazy
    private McpSyncServer mcpSyncServer;


    @Tool(name = "Samples from an LLM using MCP's sampling feature")
    public String sampleLLM(@ToolParam(description = "prompt") String prompt, ToolContext toolContext) {


        McpSyncServerExchange exchange = (McpSyncServerExchange) toolContext.getContext().get("exchange");
        var messageRequestBuilder = McpSchema.CreateMessageRequest.builder()
                .systemPrompt("You are a poet!")
                .messages(List.of(new McpSchema.SamplingMessage(McpSchema.Role.USER,
                        new McpSchema.TextContent(
                                "Please write a poem about thius weather forecast (temperature is in Celsious). Use markdown format :\n "
                        ))));

        var opeAiLlmMessageRequest = messageRequestBuilder
                .modelPreferences(McpSchema.ModelPreferences.builder().addHint("openai").build())
                .build();


        McpSchema.CreateMessageResult samplingResult = exchange.createMessage(opeAiLlmMessageRequest);
        return JSON.toJSONString(samplingResult);
    }


}
