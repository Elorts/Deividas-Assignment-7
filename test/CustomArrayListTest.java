import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	
	@Test
	public void testRemoveNinthElement() {
		
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}
		
		sut.remove(9);
		assertEquals(null, sut.get(9));
		
		sut.remove(7);
		assertEquals(8, sut.get(7));
		
		sut.add(1000);
		assertEquals(1000, sut.get(8));
		
		sut.add(7, 1001);
		assertEquals(1001, sut.get(7));
		
		sut.add(7, 1002);
		assertEquals(1002, sut.get(7));
		
		sut.add(7, 89);
		assertEquals(89, sut.get(7));
		
		sut.remove(7);
		assertEquals(1002, sut.get(7));
		
		sut.add(2000);
		assertEquals(2000, sut.get(11));
		
		sut.add(3000);
		assertEquals(3000, sut.get(12));
	}
}
