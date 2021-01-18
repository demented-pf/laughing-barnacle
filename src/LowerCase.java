public class LowerCase {
    public String toLowerCase(String str) {
        char[] h = str.toCharArray();
        String s = "";
        for (int i = 0; i < h.length; i++) {
            if ((int) h[i] <= 90 && (int) h[i] >= 65){
                h[i] += 32;
            }
        }
        for (int i = 0; i < h.length; i++) {
            s += h[i];
        }
        return s;
    }
}
