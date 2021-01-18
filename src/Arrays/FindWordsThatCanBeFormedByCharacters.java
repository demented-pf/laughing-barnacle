package Arrays;

import java.util.Arrays;

public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        char[] Characters = chars.toCharArray();
        Arrays.sort(Characters);
        int totalCounter = 0;

        for (int i = 0; i < words.length; i++) {
            char[] SplitWord = words[i].toCharArray();
            Arrays.sort(SplitWord);
            int wordCounter = 0;
            for (int j = 0; j < Characters.length; j++) {
                if (Characters[j] == SplitWord[wordCounter]){
                    wordCounter ++;
                }
                if (wordCounter == SplitWord.length){
                    break;
                }
            }
            if (wordCounter == SplitWord.length){
                totalCounter += wordCounter;
            }
        }
        return totalCounter;
    }
}
