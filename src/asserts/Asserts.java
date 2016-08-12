package asserts;

import org.junit.Test;
import helpers.calculadora;
import static org.junit.Assert.*;
public class Asserts {
    @Test
    void test(){
        calculadora b = null;
        calculadora c = new calculadora();
        calculadora d = c;
        
        
        assertEquals (10, c.suma (5, 5));
        assertTrue(true);
        assertFalse(false);
        assertNull(b);
        assertNotNull(c);
        assertSame(c,d);
        assertNotSame(b,c);
    }
}
