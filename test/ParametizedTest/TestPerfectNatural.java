
package ParametizedTest;

import helpers.PrimeNumbers;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith (Parameterized.class)
public class TestPerfectNatural {
  private Integer num;
  private Boolean expected;
  private PrimeNumbers clase;
  
  @Before
  public void before(){
      clase= new PrimeNumbers();
  }

    public TestPerfectNatural(Integer num, Boolean expected) {
        this.num = num;
        this.expected = expected;
    }
  @Parameterized.Parameters
  public static Collection primeNumbers2Test(){
      return Arrays.asList(new Object[][]{
          {6, true},
          {28, true},
          {496, true},
          {8128, true},
          {4, false},
      });
  }
  @Test
    public void testPrimeNumbers(){
        System.out.println("" + num);
        assertEquals(""+ num,expected, clase.isPerfectNatural(num));
    }
}
