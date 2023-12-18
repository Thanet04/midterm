package midterm;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Testsquare {

	public SquareArea obj;
	
	@Before
	
	public void init() {
		obj = new SquareArea();
	}

	@Test
	public void tc01() {
		assertEquals(4,obj.square(2));
	}
}
