package Stack;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}

public class EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        int sum = 0;
        Stack<Integer> h = new Stack<>();

        for (Employee e : employees){
            if (e.id == id){
                for (int i = 0; i < e.subordinates.size(); i++) {
                    h.push(e.subordinates.get(i));
                }
                sum += e.importance;
            }
        }
        while (!h.isEmpty()){
            int g = h.pop();
            for (Employee e : employees){
                if (e.id == g){
                    for (int i = 0; i < e.subordinates.size(); i++) {
                        h.push(e.subordinates.get(i));
                    }
                    sum += e.importance;
                }
            }
        }
        return sum;
    }
}
