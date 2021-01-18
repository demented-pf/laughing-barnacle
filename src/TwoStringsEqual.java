public class TwoStringsEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        for (String i : word1){
            w1.append(i);
        }
        for (String i : word2){
            w2.append(i);
        }
        return w1.toString().equals(w2.toString());
    }
}
