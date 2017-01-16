import static org.junit.Assert.*;

import org.junit.Test;


public class TestCase {

	private static final double DELTA = 1e-15;
	Calculator calculator = new Calculator(3,9);
	
	@Test
	public void testadd(){
		assertEquals(12, calculator.add(),DELTA);		
	}
	@Test
	public void testsub(){
		assertEquals(-6, calculator.sub(),DELTA);		
	}
	@Test
	public void testtime(){
		assertEquals(27, calculator.times(),DELTA);		
	}
	@Test
	public void testover(){
		double expectResult = 1/3;
		assertEquals( expectResult, calculator.over(),DELTA);		
	}
	
	

}
