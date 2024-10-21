package com.list;

public class News {
    private String title;
    private String subtitle;
    private int imageResourceId;
    private String content;

    public News(String title, String subtitle, int imageResourceId, String content) {
        this.title = title;
        this.subtitle = subtitle;
        this.imageResourceId = imageResourceId;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}


