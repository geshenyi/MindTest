package com.ccorp.poc.mindtest.model.domain;

import com.ccorp.poc.mindtest.service.WebSocketService;

/**
 * Created by ssge on 2015/11/11.
 */
public class ScriptExecutionContext {
    private WebSocketService webSocketService;
    private String path;
    private String uuid;

    public ScriptExecutionContext(WebSocketService webSocketService, String path, String uuid) {
        this.webSocketService = webSocketService;
        this.path = path;
        this.uuid = uuid;
    }

    public WebSocketService getWebSocketService() {
        return webSocketService;
    }

    public void setWebSocketService(WebSocketService webSocketService) {
        this.webSocketService = webSocketService;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
