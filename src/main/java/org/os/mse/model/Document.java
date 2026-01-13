package org.os.mse.model;

public class Document {
    String name;
    String content;

    public Document(String name, String content){
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "name='" + name + '\'' +
                ", contentLength=" + content.length() +
                '}';
    }
}
