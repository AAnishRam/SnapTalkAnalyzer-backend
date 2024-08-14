package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private boolean writingCompleted;
    private boolean speakingCompleted;
    private boolean snapTalkCompleted;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isWritingCompleted() {
        return writingCompleted;
    }

    public void setWritingCompleted(boolean writingCompleted) {
        this.writingCompleted = writingCompleted;
    }

    public boolean isSpeakingCompleted() {
        return speakingCompleted;
    }

    public void setSpeakingCompleted(boolean speakingCompleted) {
        this.speakingCompleted = speakingCompleted;
    }

    public boolean isSnapTalkCompleted() {
        return snapTalkCompleted;
    }

    public void setSnapTalkCompleted(boolean snapTalkCompleted) {
        this.snapTalkCompleted = snapTalkCompleted;
    }
}
