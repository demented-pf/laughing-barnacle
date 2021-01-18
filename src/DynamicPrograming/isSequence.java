package DynamicPrograming;

public class isSequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0){
            return true;
        }
        if (t.length() == 0){
            return false;
        }
        return checking(s, t, 0, 0);
    }
    public boolean checking(String s, String t, int sCounter, int tCounter){
        if (s.charAt(sCounter) == t.charAt(tCounter)){
            tCounter++;
            sCounter++;
        }
        else {
            tCounter ++;
        }

        if (tCounter == t.length() && sCounter != s.length()) return false;
        if (tCounter == t.length() && sCounter == s.length()) return true;

        return checking(s, t, sCounter, tCounter);
    }
}
