package cn.garcheng;

import cn.garcheng.mcp.McpServerJinaApp;
import cn.garcheng.mcp.dto.JinaReadAndFetchContentResponse;
import cn.garcheng.mcp.dto.JinaSearchAndGetSERPResponse;
import cn.garcheng.mcp.service.IJinaSearchApi;
import com.alibaba.fastjson2.JSON;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import retrofit2.Call;

/**
 * @ClassDescription:
 * @Author: GARCHENG
 * @Created: 2025/3/12 17:42
 */


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = McpServerJinaApp.class)
public class JinaApiTest {

    public static final String JINA_TOKEN = "Bearer jina_7c2096090ce14586ab4193e376588eeat9lPKEeomlMin_lONzpwnPsUHf7d";

    @Resource
    private IJinaSearchApi jinaSearchApi;

    @Test
    public void test_readAndFetchContent() {
        Call<JinaReadAndFetchContentResponse> response = jinaSearchApi.readAndFetchContent("https://modelcontextprotocol.io/quickstart/server", JINA_TOKEN);
        log.info("测试结果：response:{}", JSON.toJSONString(response));
    }

    @Test
    public void test_searchAndGetSERP() {
        Call<JinaSearchAndGetSERPResponse> response = jinaSearchApi.searchAndGetSERP("mcp", 10, 1, JINA_TOKEN);
        log.info("测试结果：response:{}", JSON.toJSONString(response));
    }

}
