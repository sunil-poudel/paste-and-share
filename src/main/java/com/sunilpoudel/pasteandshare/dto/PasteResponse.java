package com.sunilpoudel.pasteandshare.dto;

import java.time.LocalDateTime;

public class PasteResponse {

    private Long id;
    private String code;
    private String content;
    private Long views;
    private LocalDateTime createdAt;

    public PasteResponse() {
    }

    public PasteResponse(Long id, String code, String content, Long views, LocalDateTime createdAt) {
        this.id = id;
        this.code = code;
        this.content = content;
        this.views = views;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getContent() {
        return content;
    }

    public Long getViews() {
        return views;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}