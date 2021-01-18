import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateFromArrayTest {

    @Test
    void removeDuplicates() {
        RemoveDuplicateFromArray r = new RemoveDuplicateFromArray();
        int h = r.removeDuplicates(new int[] {0,0,1,2,3,4,4});
        assertEquals(5, h);
        h = r.removeDuplicates(new int[] {0,1,2,3,4});
        assertEquals(5, h);
    }
}