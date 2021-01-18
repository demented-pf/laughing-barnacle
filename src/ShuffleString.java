public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        String[] h = s.split("");
        String[] u = new String[s.length()];
        for (int i = 0; i < h.length; i++) {
            u[indices[i]] = h[i];
        }
        s = "";
        for (int i = 0; i < u.length; i++) {
            s += u[i];
        }
        return s;
//        String result = "";
//        String[] h = s.split("");
//        for (int i = 0; i < s.length(); i++) {
//            int g = indices[indices[i]];
//            String l = h[indices[i]];
//            indices[indices[i]] = indices[i];
//            h[indices[i]] = h[i];
//            indices[i] = g;
//            h[i] = l;
//
//        }
//        for (int i = 0; i < h.length; i++) {
//            result += h[i];
//        }
//        return result;
    }
}
