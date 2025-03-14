package cn.garcheng;

import cn.garcheng.mcp.McpServerJinaApp;
import cn.garcheng.mcp.dto.JinaReadAndFetchContentResponse;
import cn.garcheng.mcp.dto.JinaSearchAndGetSERPResponse;
import cn.garcheng.mcp.service.IJinaReaderApi;
import com.alibaba.fastjson2.JSON;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * @ClassDescription:
 * @Author: GARCHENG
 * @Created: 2025/3/12 17:42
 */


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = McpServerJinaApp.class)
public class JinaApiTest {


    @Resource
    private IJinaReaderApi jinaSearchApi;

    @Test
    public void test_readAndFetchCo() throws IOException {
        Call<JinaReadAndFetchContentResponse> call = jinaSearchApi.readAndFetchContent("https://modelcontextprotocol.io/quickstart/server");
        Response<JinaReadAndFetchContentResponse> response = call.execute();
        log.info("测试结果：response:{}", response.isSuccessful() ? JSON.toJSONString(response.body()) : "execute fail!");
    }

    @Test
    public void test_searchAndGetSERP() throws IOException {
        Call<JinaSearchAndGetSERPResponse> call = jinaSearchApi.searchAndGetSERP("mcp", 10, 1);
        Response<JinaSearchAndGetSERPResponse> response = call.execute();
        log.info("测试结果：response:{}", response.isSuccessful() ? JSON.toJSONString(response.body()) : "execute fail!");
    }

}
