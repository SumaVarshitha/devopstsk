import static org.junit.Assert.*;

import org.junit.Test;


public class taskTest {

	@Test
	public void test() {
		task t=new task();
		String d=t.palindrome(151);
		assertEquals("true",d);
	}

}
