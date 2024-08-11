package org.example.ontap.baitapvenha.day11.collectionmap.bai3;

import java.time.LocalDateTime;

public class PageView {
    private int userId;
    private String pageUrl;
    private LocalDateTime timestamp;

    public PageView() {
    }

    public PageView(int userId, String pageUrl, LocalDateTime timestamp) {
        this.userId = userId;
        this.pageUrl = pageUrl;
        this.timestamp = timestamp;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "PageView{" +
                "userId=" + userId +
                ", pageUrl='" + pageUrl + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
