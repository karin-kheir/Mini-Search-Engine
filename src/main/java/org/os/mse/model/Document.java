package org.os.mse.model;

public class Document {
    String path;
    String content;

    public Document(String path, String content){
        this.path = path;
        this.content = content;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Document{" +
                "path='" + path + '\'' +
                ", contentLength=" + content.length() +
                '}';
    }
}
