package day5;

import org.testng.annotations.Test;

public class TestNgPriority {
	
	@Test (priority = 1)
	public void TestA() {
		System.out.println("This is Test A");
	}
	
	@Test
	public void TestZ() {
		System.out.println("This is Test Z");
	}
	@Test (priority=4)
	public void TestC() {
		System.out.println("This is Test C");
}
	@Test (priority=2)
	public void TestS() {
		System.out.println("This is Test S");
	}

}
