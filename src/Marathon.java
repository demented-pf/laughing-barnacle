
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Marathon {
    static class Points {
        int x;
        int y;

        public Points(int x, int y) {
            this.x = x;
            this.y = y;
        }

    };
    public static void main(String[] args) throws IOException {
        final String probName = new Throwable().getStackTrace()[0].getClassName();
        BufferedReader in = new BufferedReader(new FileReader("marathon.in"));

        StringTokenizer st = new StringTokenizer(in.readLine());

        Scanner input = new Scanner(System.in);

        int numberOfQu = Integer.parseInt(st.nextToken());

        Points[] points = new Points[numberOfQu];

        for (int i = 0; i < numberOfQu; i++) {

            st = new StringTokenizer(in.readLine());
            points[i] = new Points(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }

        int totalDist = 0;
        for (int i = 1; i < numberOfQu; i++) {
            totalDist += Math.abs(points[i].x - points[i-1].x) + Math.abs(points[i].y - points[i-1].y);
        }

        int longest = 0;
        for (int i = 1; i < numberOfQu - 1; i++) {

            int noSkip = Math.abs(points[i].x - points[i-1].x) + Math.abs(points[i].y - points[i-1].y) +
                    Math.abs(points[i].x - points[i+1].x) + Math.abs(points[i].y - points[i+1].y);

            int skippedValue = Math.abs(points[i-1].x - points[i+1].x) + Math.abs(points[i-1].y - points[i+1].y);
            longest = Math.max(longest, noSkip - skippedValue);
        }

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("marathon.out")));
        out.println(totalDist - longest);
        out.close();
        System.exit(0);
    }
}
