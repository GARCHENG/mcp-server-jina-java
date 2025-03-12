package cn.garcheng.mcp.config;

import cn.garcheng.mcp.service.IJinaSearchApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @ClassDescription:
 * @Author: GARCHENG
 * @Created: 2025/3/12 16:41
 */

@Configuration
public class Retrofit2Config {

    @Bean
    public IJinaSearchApi jinaSearchApi() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://r.jina.ai")
                .addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit.create(IJinaSearchApi.class);

    }


}
