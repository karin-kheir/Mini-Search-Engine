package org.os.mse.indexing;

import org.os.mse.model.Document;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Indexer {
    private Map<String, Map<String, Integer>> invertedIndex = new HashMap<>();

    public void indexDocuments(List<Document> documents){
        for (Document document : documents){
            indexSingleDocument(document);
        }
    }

    public void indexSingleDocument(Document document){
        String cleaned = TextCleaner.clean(document.getContent());
        List<String> words = Tokenizer.tokenize(cleaned);

        for (String word : words) {
            invertedIndex.putIfAbsent(word, new HashMap<>());
            Map<String, Integer> docName = invertedIndex.get(word);
            docName.put(document.getName(), docName.getOrDefault(document.getName(), 0) + 1);

        }
    }

    public Map<String, Map<String, Integer>> getInvertedIndex() {
        return invertedIndex;
    }
}
