

import java.util.HashMap;
import java.util.Scanner;

public class touristTranslation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> byteLand = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            byteLand.put((char) ((char) i+97), i);
        }

        int tests = input.nextInt();
        String allEnglish = input.next();

        for (int i = 0; i < tests; i++) {
            String word = input.next();
            String lowWord = word.toLowerCase();
            String wordNew = "";

            for (int j = 0; j < word.length(); j++) {
                if (byteLand.containsKey(lowWord.charAt(j))){
                    char w = allEnglish.charAt(byteLand.get(lowWord.charAt(j)));
                    if ((int) word.charAt(j) < 91 && (int) word.charAt(j) > 64){
                        wordNew += (char) ((int) w - 32);
                    }
                    else {
                        wordNew += w;
                    }
                }
                else if (lowWord.charAt(j) == '_'){
                    wordNew += " ";
                }
                else {
                    wordNew += lowWord.charAt(j);
                }
            }
            System.out.println(wordNew);
        }
    }
}
