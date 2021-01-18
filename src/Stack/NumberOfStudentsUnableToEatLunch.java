package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NumberOfStudentsUnableToEatLunch {
    public static void main(String[] args) {
        NumberOfStudentsUnableToEatLunch h = new NumberOfStudentsUnableToEatLunch();
        System.out.println(h.countStudents(new int[]{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1}));
    }
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> h = new Stack<>();
        int studentCounter = 0;
        int whetherAllDoNotWant = 0;
        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < students.length; i++) {
            s.add(students[i]);
        }

        for (int i = sandwiches.length - 1; i >= 0; i--) {
            h.push(sandwiches[i]);
        }
        System.out.println(h.toString() + " \n");
        System.out.println(s.toString());
        while (h.size() != 1){
            if (studentCounter >= s.size()) studentCounter = 0;
            if (whetherAllDoNotWant == s.size()) return s.size();

            if (s.get(studentCounter) == h.peek()){
                System.out.println(s.get(studentCounter) + " " + h.peek());
                System.out.println(studentCounter + " " + s.toString() + " " + h.toString());
                s.remove(studentCounter);
                h.pop();
                whetherAllDoNotWant = 0;
            }
            else {
                int r = s.get(studentCounter);
                s.remove(studentCounter);
                s.add(r);
                studentCounter = 0;
                whetherAllDoNotWant ++;
            }
            studentCounter ++;
        }
        if (s.size() == 1){
            if (s.get(0) == h.peek()){
                return 0;
            }
            else {
                return 1;
            }
        }
        return 0;
    }
}
