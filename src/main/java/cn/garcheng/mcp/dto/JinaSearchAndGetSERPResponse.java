package cn.garcheng.mcp.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JinaSearchAndGetSERPResponse {

    private int code;
    private int status;
    private List<Data> data;
    private Meta meta;

    @lombok.Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Data {
        private String url;
        private String title;
        private String description;

    }

    @lombok.Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Meta {
        private Usage usage;

    }

    @lombok.Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Usage {
        private int tokens;

    }
}
