package AdventOfCode.day4;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] h = new String[]{"ecl:amb", "pid:690616023", "byr:1994", "iyr:2014", "hgt:172cm", "hcl:#c0946f", "eyr:2022"};
        Arrays.sort(h);
        System.out.println(Arrays.toString(h));
    }
}
