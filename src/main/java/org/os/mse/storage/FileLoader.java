package org.os.mse.storage;

import org.os.mse.model.Document;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileLoader {
    public static List<Document> loadDocuments(String folderPath) throws IOException {
        List<Document> documents = new ArrayList<>();
        File folder = new File(folderPath);
        if (!folder.isDirectory() || !folder.exists()){
            throw new IOException("Invalid folder path" + folderPath);
        }

        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null){
            throw new IOException("There is no files");
        }
        for(File file : files){
            String content = Files.readString(file.toPath());
            documents.add(new Document(file.getName(), content));
        }

        return documents;
    }
}
