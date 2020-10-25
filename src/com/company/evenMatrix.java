package com.company;

import java.util.Scanner;

public class evenMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        for (int m = 0; m < test; m++) {
            int n = input.nextInt();

            if (n % 2 == 1) {
                int counter = 1;
                for (int i = 0; i < n; i++) {
                    String line = "";
                    for (int j = 0; j < n; j++) {
                        line += counter + " ";
                        counter++;
                    }
                    System.out.println(line);
                }
            } else {
                int o = 0;
                int counter = (-1 * n) + 1;
                for (int i = 0; i < n / 2; i++) {
                    String line = "";
                    if (o == 0) {
                        counter += n;
                        for (int j = 0; j < n; j++) {
                            line += counter + " ";
                            counter++;
                        }
                        System.out.println(line);
                        o = 1;
                    }
                    int ncounter = counter + n - 1;
                    line = "";
                    if (o == 1) {
                        for (int j = 0; j < n; j++) {
                            line += ncounter + " ";
                            ncounter -= 1;
                        }
                        System.out.println(line);
                        o = 0;
                    }
                }
            }
        }
    }
}
