

public class Base7 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(56));
    }
    public static String convertToBase7(int num) {
        boolean neg = false;
        if (num < 0){
            neg = true;
            num *= (-1);
        }
        if (num == 0){
            return "0";
        }
        int counter = 1;
        int nNum = num;
        boolean h = true;
        boolean q = false;

        while (nNum > 1) {
            if (nNum % 7 == 0) {
                counter *= 10;
                nNum /= 7;
                q = true;
            }
            else {
                h = false;
                nNum = num;
                q = false;
                break;
            }

        }

        if (q){
            if (neg){
                counter *= (-1);
            }
            return Integer.toString(counter);
        }

        int k = 1;
        int oldK = 1;

        boolean o = true;
        boolean seven = false;
        nNum = num;
        if (!h && nNum%7 == 0){
            counter = 1;
            while (nNum > 6 && nNum%7 == 0) {
                if (nNum % 7 == 0) {
                    counter *= 10;
                    nNum /= 7;
                    seven = true;
                }
            }
            int x = 0;
            if (nNum% 7 != 0 && seven){
                for (int i = 2; i <= nNum; i++) {
                    if (nNum % i == 0){
                        x = i;
                    }
                }
                nNum /= x;
                if (x < 7){
                    counter *= x;
                }

            }
        }
        else {
            counter = 0;
            o = false;
        }

        if (!o) {
            counter = 0;
            while (k <= num) {
                k *= 7;
                if (k == num) {
                    break;
                }
                if (k > num) {
                    k = oldK;
                    break;
                }
                oldK = k;
            }
            while (num > 0) {

                counter += num / k;
                num -= (num / k) * k;
                if (k != 1) {
                    counter *= 10;
                }
                k /= 7;
            }
        }
        if (neg == true){
            counter *= (-1);
        }
        return Integer.toString(counter);
    }
}
