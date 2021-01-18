import java.util.*;

public class FindCommonCharacters {
    public static void main(String[] args) {
        FindCommonCharacters h = new FindCommonCharacters();
        System.out.println(h.commonChars(new String[]{"cool", "lock", "cook"}));
    }
    public List<String> commonChars(String[] A) {
        List<String> ans = new ArrayList<>();
        int[] count = new int[26];
        Arrays.fill(count, Integer.MAX_VALUE);
        for (String str : A) {
            int[] cnt = new int[26];
            for(char c: str.toCharArray()){
                ++cnt[c - 'a'];
            }

            for (int i = 0; i < 26; ++i) {
                count[i] = Math.min(cnt[i], count[i]);
            } // update minimum frequency.
            System.out.println(Arrays.toString(count));
        }
        for (char c = 'a'; c <= 'z'; ++c) {
            while (count[c - 'a']-- > 0) {
                ans.add("" + c);
            }
        }
        return ans;
    }
}
