package cn.garcheng.mcp.service;

import cn.garcheng.mcp.dto.JinaReadAndFetchContentResponse;
import cn.garcheng.mcp.dto.JinaSearchAndGetSERPResponse;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * @ClassDescription:
 * @Author: GARCHENG
 * @Created: 2025/3/12 16:38
 */
public interface IJinaSearchApi {

    /**
     * e.g. curl <a href="https://r.jina.ai/https://example.com">...</a> \
     * -H "Accept: application/json" \
     * -H "Authorization: Bearer jina_7c2096090ce14586ab4193e376588eeat9lPKEeomlMin_lONzpwnPsUHf7d"
     *
     * @param url   url
     * @param token token
     * @return result
     */
    @Headers({
            "Content-Type: application/json",
            "Authorization: Bearer YOUR_TOKEN"
    })
    @GET("https://r.jina.ai/{url}")
    Call<JinaReadAndFetchContentResponse> readAndFetchContent(@Path("url") String url, @Header("Authorization") String token);

    /**
     * e.g. curl <a href="https://s.jina.ai/?q=Jina+AI&num=10&page=1">...</a> \
     * -H "Accept: application/json" \
     * -H "Authorization: Bearer jina_7c2096090ce14586ab4193e376588eeat9lPKEeomlMin_lONzpwnPsUHf7d" \
     * -H "X-Respond-With: no-content"
     *
     * @param question q
     * @param num      num
     * @param page     page
     * @return
     */
    @Headers({
            "Content-Type: application/json",
            "Authorization: Bearer YOUR_TOKEN",
            "X-Respond-With: no-content"
    })
    @GET("https://s.jina.ai")
    Call<JinaSearchAndGetSERPResponse> searchAndGetSERP(@Query("q") String question,
                                                       @Query("num") Integer num,
                                                       @Query("page") Integer page,
                                                       @Header("Authorization") String token);

}
