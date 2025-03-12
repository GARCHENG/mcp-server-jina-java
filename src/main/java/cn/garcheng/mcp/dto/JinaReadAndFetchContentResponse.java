package cn.garcheng.mcp.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JinaReadAndFetchContentResponse {

    private int code;
    private int status;
    private Data data;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Data {

        private String title;
        private String description;
        private String url;
        private String content;
        private String warning;
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
