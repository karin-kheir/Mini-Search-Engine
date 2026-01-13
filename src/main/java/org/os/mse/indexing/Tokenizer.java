package org.os.mse.indexing;

import java.util.Arrays;
import java.util.List;

public class Tokenizer {
    public static List<String> tokenize(String content) {

        String[] newContent = content.split("\\s+");
        return Arrays.stream(newContent)
                .filter(token -> !token.isBlank())
                .toList();
    }
}
