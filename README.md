# MCP Server（Jina Reader API）

A Model Context Protocol server that provides web content searching and fetching capabilities(through jina reader api <a>https://jina.ai/reader/). 



### Available Tools

- ```
  readAndFetchContent
  ```

  \- read a URL and fetch its content.

  - `url` (string, required): URL to fetch

- ```
  searchAndGetSERP
  ```

  \- search the web and get SERP.

  - `keyword` (string, required): The keyword to search on the web




## Configuration

```json
"mcpServers": {
   "mcp-server-jina-java": {
      "command": "java",
      "args": [
        "-Dspring.ai.mcp.server.stdio=true",
        "-jar",
        "/the path of the jar/mcp-server-jina-java-1.0-SNAPSHOT.jar",
        "jina.api.api-key= Your jina key"
      ]
    }
}
```



## License

This MCP server is licensed under the MIT License. This means you are free to use, modify, and distribute the software, subject to the terms and conditions of the MIT License. For more details, please see the LICENSE file in the project repository.
