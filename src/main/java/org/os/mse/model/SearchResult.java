package org.os.mse.model;

public class SearchResult {
    private String documentName;
    private int score;

    public SearchResult(){}

    public SearchResult(String documentName, int score){
        this.documentName = documentName;
        this.score = score;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
