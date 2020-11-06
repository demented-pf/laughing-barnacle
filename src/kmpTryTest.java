

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class kmpTryTest {
    @Test
    public void KMPTest() {


        // assert statements
        assertEquals(1, kmpTry.KMP("mississipi", "iss"));
        assertEquals(-1, kmpTry.KMP("mississipi", "aba"));
        assertEquals(7, kmpTry.KMP("mississipi", "ipi"));
        assertEquals(-1, kmpTry.KMP("mississipi", "misi"));
        assertEquals(-1, kmpTry.KMP("mississipi", "mississp"));
        assertEquals(2, kmpTry.KMP("mississipi", "ssiss"));
    }
}