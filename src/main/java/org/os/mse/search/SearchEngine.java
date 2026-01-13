package org.os.mse.search;

import org.os.mse.indexing.Indexer;
import org.os.mse.indexing.TextCleaner;
import org.os.mse.indexing.Tokenizer;
import org.os.mse.model.SearchResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchEngine {
    private Map<String, Map<String, Integer>> invertedIndex ;

    public SearchEngine(Indexer indexer){
        this.invertedIndex = indexer.getInvertedIndex();
    }

    public List<SearchResult> search(String query){
        String clean = TextCleaner.clean(query);
        List<String> queryList = Tokenizer.tokenize(clean);

        Map<String, Integer> docsScore = new HashMap<>();

        for (String word : queryList){
            if (invertedIndex.containsKey(word)){
                Map<String, Integer> docs = invertedIndex.get(word);
                for (Map.Entry<String, Integer> entry : docs.entrySet()){
                    docsScore.put(entry.getKey(), docsScore.getOrDefault(entry.getKey(), 0) + entry.getValue());
                }
            }
        }

        List<SearchResult> results = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : docsScore.entrySet()){
            results.add(new SearchResult(entry.getKey(), entry.getValue()));
        }

        return results;
    }
}
