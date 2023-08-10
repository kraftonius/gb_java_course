package homework5;

import java.util.*;


public class Homework {

    static void printStats(String text) {
        // 1. Split текста, приведение его к нижнему регистру, удаление запятых и точек.
        // 2. Сбор структуры со статистикой.
        // Map<Integer, List<String>> stats; // Структура, в которой ключ - длина слова, значение - список таких слов.

        String lText = text.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < lText.length(); i++) {
            if (Character.isLetter(lText.charAt(i)) || lText.charAt(i) == ' ' || lText.charAt(i) == '-') {
                stringBuilder.append(lText.charAt(i));
            }
        }
        String cleanText = stringBuilder.toString();
        List<String> stringList = List.of(cleanText.split(" "));

        Map<Integer, List<String>> stats = new TreeMap<>();

        for (int i = 0; i < stringList.size(); i++) {
            List<String> tempLS = new ArrayList<>();
            if (stats.containsKey(stringList.get(i).length())) {
                tempLS = stats.get(stringList.get(i).length());
            }
            tempLS.add(stringList.get(i));
            stats.put(stringList.get(i).length(), tempLS);
        }
        for (Map.Entry<Integer, List<String>> entry : stats.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String text = "Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того, чтобы выполнить тестовое задание GB. " +
                "Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.";
        printStats(text);
    }
}