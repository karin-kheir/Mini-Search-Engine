package org.os.mse.search;

import org.os.mse.model.SearchResult;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ranker {
    public static void rank(List<SearchResult> results){
        Collections.sort(results, Comparator.comparingInt(SearchResult::getScore).reversed());
    }
}
