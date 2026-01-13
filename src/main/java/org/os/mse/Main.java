package org.os.mse;

import org.os.mse.indexing.Indexer;
import org.os.mse.model.Document;
import org.os.mse.model.SearchResult;
import org.os.mse.search.Ranker;
import org.os.mse.search.SearchEngine;
import org.os.mse.storage.FileLoader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            List<Document> documents = FileLoader.loadDocuments("files");
            Indexer indexer = new Indexer();
            indexer.indexDocuments(documents);
            SearchEngine searchEngine = new SearchEngine(indexer);
            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.println("Enter your query(or type 'exit' to quit): ");
                String query = input.nextLine();
                if (query.equalsIgnoreCase("exit")) break;

                List<SearchResult> results = searchEngine.search(query);
                if (results.isEmpty()){
                    System.out.println("No results found.");
                }
                else {
                    Ranker.rank(results);
                    for (SearchResult result : results) {
                        System.out.println("Document name: " + result.getDocumentName() + ", Score: " + result.getScore());
                    }
                }
            }
            input.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}