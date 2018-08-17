
import org.junit.*;
import static org.junit.Assert.*;

public class PrimeTest {

	

	    @Test
	    public void enter() {
	        int expected = 3;
	        int actual = Prime.answer(2);
	        assertEquals(expected, actual);
	    }
	    
	     @Test
	    public void enter1() {
	        int expected = 5;
	        int actual = Prime.answer(3);
	        assertEquals(expected, actual);
	    }
	    
	     @Test
	    public void enter2() {
	        int expected = 11;
	        int actual = Prime.answer(5);
	        assertEquals(expected, actual);
	    }
	    
	    @Test
	    public void enter3() {
	        int expected = 17;
	        int actual = Prime.answer(7);
	        assertEquals(expected, actual);
	    }
	    
	     @Test
	    public void enter4() {
	        int expected = 31;
	        int actual = Prime.answer(11);
	        assertEquals(expected, actual);
	    }
	}
}
