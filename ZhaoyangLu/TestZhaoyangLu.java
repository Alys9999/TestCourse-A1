

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestZhaoyangLu {

	@Test
	public void testGetFullName() {
		String result = new ZhaoyangLu().getFullName();
		assertEquals("Zhaoyang Lu", result);
	}
	
	@Test
	public void testGetFirstName() {
		String result = new ZhaoyangLu().getFirstName();
		assertEquals("Zhaoyang", result);
	}
	
	@Test
	public void testGetLastName() {
		String result = new ZhaoyangLu().getLastName();
		assertEquals("Lu", result);
	}
	
	@Test
	public void testGetUCInetID() {
		String result = new ZhaoyangLu().getUCInetID();
		assertEquals("zhaoyal5", result);
	}
	
	@Test
	public void testGetStudentNumber() {
		int result = new ZhaoyangLu().getStudentNumber();
		assertEquals(30735594, result);
	}
	
	@Test
	public void testGetRotatedFullName1() {
		String result = new ZhaoyangLu().getRotatedFullName(5);
		assertEquals("ang LuZhaoy", result);
	}
	
	@Test
	public void testGetRotatedFullName2() {
		String result = new ZhaoyangLu().getRotatedFullName(-5);
		assertEquals("ng LuZhaoya", result);
	}
	


}
