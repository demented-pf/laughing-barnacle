package Arrays;

import java.util.ArrayList;
import java.util.List;

public class GenerateString {
    public String generateTheString(int n) {
        String s = "";
        int middle = n / 2;
        boolean a = true;
        if (n == 2) return "ab";
        for (int i = 0; i < n; i++) {
            if (i > middle) {
                a = false;
                s += "b";
            }
            else s += "a";
        }
        return s;
    }
}
