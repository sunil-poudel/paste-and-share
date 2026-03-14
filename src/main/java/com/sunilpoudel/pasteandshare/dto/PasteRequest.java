package com.sunilpoudel.pasteandshare.dto;


public class PasteRequest {

    private String code;
    private String content;

    public PasteRequest() {
    }

    public PasteRequest(String code, String content) {
        this.code = code;
        this.content = content;
    }

    public String getCode() {
        return code;
    }

    public String getContent() {
        return content;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setContent(String content) {
        this.content = content;
    }
}