import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SquarePastures {

	public static void main(String[] args) throws IOException {
		final String probName = new Throwable().getStackTrace()[0].getClassName();
		BufferedReader in = new BufferedReader(new FileReader("square.in"));

        StringTokenizer st = new StringTokenizer(in.readLine());

        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(in.readLine());

        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken());
        int y4 = Integer.parseInt(st.nextToken());

        int g = Math.max(Math.max(x1, x4) - Math.min(x1, x4), Math.max(x2, x3) - Math.min(x2, x3));
        int l = Math.max(g, Math.max(y1, y4) - Math.min(y1, y4));
        int k = Math.max(l, Math.max(y2, y3) - Math.min(y2, y3));
        int z = Math.max(x1-x2, x4-x3);
        int f = Math.max(y1-y2, y4-y3);
        int regular = Math.max(f, z);
        int result = Math.max(k, regular);


        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));
        out.println((int) Math.pow(result, 2));
		out.close();
		System.exit(0);
	}
}