package org.os.mse.indexing;

public class TextCleaner {

    public static String clean(String content){
        content = content.toLowerCase();
        content = content.replaceAll("[^a-zA-Z0-9 ]", "");
        content = content.replaceAll("\\s+", " ").trim();
        return content;
    }
}
