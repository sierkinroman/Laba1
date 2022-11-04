package dev.profitsoft.intern.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {
        List<String> rows = new ArrayList<>();
        rows.add("#one#one#two this is #three");
        rows.add("#one#three is #three for #four");
        rows.add("This is #four#four#one #one #two#three");
        rows.add("For#one#two #five#six#two is #one #two#three");
        rows.add("seven six#six#seven #one#two #five");

        int howManyTop = 5;

        System.out.println(getTopHashtags(rows, howManyTop));
    }

    public static Map<String, Integer> getTopHashtags(List<String> rows, int howMany) {
        if (howMany <= 0) {
            throw new IllegalArgumentException("howMany must be greater than 0");
        }
        Map<String, Integer> hashtagsFrequency = new HashMap<>();
        for (String row : rows) {
            for (String hashtag : getHashtags(row)) {
                if (hashtagsFrequency.containsKey(hashtag)) {
                    hashtagsFrequency.put(hashtag, hashtagsFrequency.get(hashtag) + 1);
                } else {
                    hashtagsFrequency.put(hashtag, 1);
                }
            }
        }

        return hashtagsFrequency.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(howMany)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    private static Set<String> getHashtags(String row) {
        Set<String> hashtags = new HashSet<>();
        row = row.replaceAll("#", " #");
        for (String word : row.split(" ")) {
            if (word.startsWith("#")) {
                StringTokenizer tokenizer = new StringTokenizer(word, "#");
                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    hashtags.add("#" + token.toLowerCase());
                }
            }
        }

        return hashtags;
    }
}
