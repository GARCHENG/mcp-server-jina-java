package cn.garcheng.mcp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @ClassDescription:
 * @Author: GARCHENG
 * @Created: 2025/3/12 16:37
 */

@Service
public class JinaService {

    @Value("${jina.api.api-key}")
    private String jinaApiKey;



}
