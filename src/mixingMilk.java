
import java.io.*;
import java.util.StringTokenizer;

public class mixingMilk {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("mixmilk.in"));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int capA = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());
        int capB = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());
        int capC = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        for (int i = 0; i < 33; i++) {
            if (a+b>capB){
                a = (a+b) - capB;
                b = capB;
            }
            else {
                b += a;
                a = 0;
            }
            if (b+c>capC){
                b = (b+c) - capC;
                c = capC;
            }
            else {
                c += b;
                b = 0;
            }
            if (c+a>capA){
                c = (c+a) - capA;
                a = capA;
            }
            else {
                a += c;
                c = 0;
            }
        }

        if (a+b>capB){
            a = (a+b) - capB;
            b = capB;
        }
        else {
            b += a;
            a = 0;
        }
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));
        out.println(a+"\n"+b+"\n"+c);
        out.close();
        System.exit(0);
    }
}
