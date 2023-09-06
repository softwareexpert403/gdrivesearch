package com.searchengine.repository;

import com.searchengine.model.StoreFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class IndexRepository {
    HashMap<String, ArrayList<Integer>> wordFileIdListMap;

    public IndexRepository(){
        
    }

    public HashMap<String, ArrayList<Integer>> buildIndex(List<StoreFile> storeFileList){
        wordFileIdListMap = new HashMap<>();
        for(StoreFile storeFile : storeFileList){
            try {
                Set<String> wordSet = extractWordsFromFile(storeFile.getLocalStoreLink());
                for(String word : wordSet){
                    wordFileIdListMap.putIfAbsent(word, new ArrayList<>());
                    wordFileIdListMap.get(word).add(storeFile.getFileId());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return wordFileIdListMap;
    }

    public static Set<String> extractWordsFromFile(String filePath) throws IOException {
        Set<String> wordSet = new HashSet<String>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line, " \t\n\r\f.,;:?!\"'()[]{}+-*/=<>|\\");
            while (tokenizer.hasMoreTokens()) {
                String word = tokenizer.nextToken().toLowerCase(); // Convert to lowercase if needed
                wordSet.add(word);
            }
        }
        return wordSet;
    }
}
