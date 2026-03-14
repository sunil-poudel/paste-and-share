package com.sunilpoudel.pasteandshare.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pastes")
public class Pastes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String code;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    private Long views = 0L;

    private LocalDateTime createdAt = LocalDateTime.now();

    public Pastes() {
    }

    public Pastes(String code, String content) {
        this.code = code;
        this.content = content;
        this.views = 0L;
        this.createdAt = LocalDateTime.now();
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

    public void setCode(String code) {
        this.code = code;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setViews(Long views) {
        this.views = views;
    }
}