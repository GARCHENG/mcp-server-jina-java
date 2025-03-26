package cn.garcheng.mcp;

import cn.garcheng.mcp.service.JinaService;
import cn.garcheng.mcp.service.SamplingTestService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * starter
 */

@SpringBootApplication
@Configuration
public class McpServerJinaApp {

    public static void main(String[] args) {
        SpringApplication.run(McpServerJinaApp.class, args);
    }

    @Bean
    public ToolCallbackProvider mcpTools(JinaService jinaService, SamplingTestService samplingTestService) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(jinaService, samplingTestService)
                .build();
    }
}
