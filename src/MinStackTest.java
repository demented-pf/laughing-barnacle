import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

    @Test
    void push() {
        MinStack m = new MinStack();
        m.push(10);
        assertEquals(10,m.top());
        m.push(20);
        m.push(30);
        m.push(40);
        assertEquals(40,m.top());
        m.pop();
        assertEquals(30,m.top());
        assertEquals(10,m.getMin());

    }

    @Test
    void pop() {
    }

    @Test
    void top() {
    }

    @Test
    void getMin() {
    }
}