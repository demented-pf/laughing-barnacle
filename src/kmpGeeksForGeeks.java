


import java.util.Arrays;

class kmpGeeksForGeeks {
    void KMPSearch(String pat, String txt) {
        int needleLength = pat.length();
        int haystackLength = txt.length();

        // create posArr[] that will hold the longest
        // prefix suffix values for pattern
        int posArr[] = new int[needleLength];
        int j = 0; // index for pat[]

        // Preprocess the pattern (calculate posArr[]
        // array)
        computeLPSArray(pat, needleLength, posArr);

        int i = 0; // index for txt[]
        while (i < haystackLength) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == needleLength) {
                System.out.println("Found pattern "
                        + "at index " + (i - j));
                j = posArr[j - 1]; // this is for getting how many of the end letter exist such as in a pattern "aba"
                // posArr[j - 1] would be 1. "abc" posArr[j - 1] -> 0
            }

            // mismatch after j matches
            else if (i < haystackLength && pat.charAt(j) != txt.charAt(i)) {
                // Do not match posArr[0..posArr[j-1]] characters,
                // they will match anyway
                if (j != 0)
                    j = posArr[j - 1];
                else
                    i = i + 1;
            }
        }
    }

    void computeLPSArray(String pat, int lengthOfPattern, int pos[])
    {
        int counter = 1;
        int j = 0;

        pos[0] = 0;

        while (counter < lengthOfPattern){

            if (pat.charAt(counter) == pat.charAt(j)){
                j += 1;
                pos[counter] = j;
                counter += 1;
            }
            else {

                if (j == 0){
                    pos[counter] = j;
                    counter++;
                }
                else {
                    j = pos[j - 1];
                }
            }
        }
    }

    public static void main(String args[])
    {
        String txt = "abcdabc";
        String pat = "bcd";
        new kmpGeeksForGeeks().KMPSearch(pat, txt);
    }
}