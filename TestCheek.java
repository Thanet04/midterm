package check;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCheek {

		public checkTwoLetter obj;
		
		@Before
		
		public void init() {
			obj = new checkTwoLetter();
		}
		
		@Test
		public void tc01() {
			assertEquals(true,obj.checkTwoLetter("Moon"));
		}
		
		@Test
		public void tc02() {
			assertEquals(false,obj.checkTwoLetter("M"));
		}
}

