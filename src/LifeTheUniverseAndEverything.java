

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LifeTheUniverseAndEverything
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        while (true){
            int g = input.nextInt();
            if (g == 42){
                return;
            }
            else {
                System.out.println(g);
            }
        }
    }
}
