package Number;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class testnumber {

	public Number obj;
	
	@Before
	
	public void init() {
		obj = new Number();
	}

	@Test
	public void tc01() {
		assertEquals(3,obj.countLetterA("saassA"));
	}

	@Test
	public void tc02() {
		assertEquals(0,obj.countLetterA("Soon"));
	}

}
