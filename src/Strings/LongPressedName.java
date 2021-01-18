package Strings;

public class LongPressedName {
    public static void main(String[] args) {
        LongPressedName h = new LongPressedName();
        System.out.println(h.isLongPressedName("alex", "aaleexa"));
    }

    public boolean isLongPressedName(String name, String typed) {
        int h = 0;
        int g = 0;
        while (g < typed.length()) {
            if ((h < name.length()) && (name.charAt(h) == typed.charAt(g))) {
                h++;
                g++;
            }
            else if ((g > 0) && (typed.charAt(g) == typed.charAt(g - 1)))
                g++;
            else
                return false;
        }
        return (h == name.length());
    }
}
