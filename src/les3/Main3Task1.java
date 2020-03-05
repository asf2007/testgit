package les3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main3Task1 {
    private static final String[] INPUT_DATA = {
            "h",
            "n", "n", "n",
            "z",
            "p",
            "x", "x",
            "m",

    };


    public static void main(String[] args) {
        Map<String, Integer> frequencyByWord = new LinkedHashMap<>();
        for (String word : INPUT_DATA) {

            frequencyByWord.merge(word, 1, Integer::sum);
        }



        frequencyByWord.forEach((word, frequency) -> {
            System.out.println(word + ": " + frequency);
        });
    }
}

