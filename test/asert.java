

import helpers.calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class asert {
    calculadora c;
    @Before
        public void crearInstancias(){
        c = new calculadora();
    }
    public asert(){
        
    }
  @Test
   public void test(){
        calculadora b = null;
        calculadora d = c;
        
        
        assertEquals (10, c.suma (5, 5));
        assertTrue(true);
        assertFalse("no es falso",false);
        assertNull("no es nulo",b);
        assertNotNull(c);
        assertSame(c,d);
        assertNotSame(b,c);
   }
        @Test
            public void multiplicaChars(){
            assertEquals (9506, c.multiplicacion('a', 'b'));
   }
        
        @Test
            public void divisionCero(){
            
   }
                
       
   
}
