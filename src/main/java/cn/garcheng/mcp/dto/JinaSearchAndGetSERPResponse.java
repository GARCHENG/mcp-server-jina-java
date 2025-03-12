package cn.garcheng.mcp.dto;


import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JinaSearchAndGetSERPResponse {

    private int code;
    private int status;
    private List<Data> data;
    private Meta meta;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Data {
        private String url;
        private String title;
        private String description;

    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Meta {
        private Usage usage;

    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Usage {
        private int tokens;

    }
}
