import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	
	@Test
	public void testCorrectNumberOfValues() {

		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}
		
		assertEquals(9, sut.get(9));
		
	}

	@Test
	public void testRemoveElement() {
		
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}
		
		Integer removedElement = sut.remove(1);
		assertEquals(1, removedElement);
	}
	
	
//	@Test
//	void should_add_one_item_to_customArrayList() {
//		CustomList<Integer> customList = new CustomArrayList<>();
//		
//		customList.add(0);
//		customList.add(1);
//		customList.add(2);
//		customList.add(3);
//		customList.add(4);
//		customList.add(5);
//		customList.add(6);
//		customList.add(7);
//		customList.add(8);
//		customList.add(9);
//		
//		
//		
//		System.out.println("Size before instertion: " + customList.getSize());
//		
//		customList.remove(9);
//				
//		customList.add(1, 999);
//		
//		assertEquals(999, customList.get(1));
//		assertEquals(11, customList.getSize());
//		
//		System.out.println("Size after instertion of 999 in index 1: " + customList.getSize());
//		
//		for(int i = 0; i < customList.getSize(); i++) {
//			System.out.println(i + " -> " + customList.get(i));
//		}	
//			
//		customList.remove(1);
//		assertEquals(22, customList.get(1));
//		assertEquals(10, customList.getSize());
//		
//		System.out.println("Size after removal of element in index 1: " + customList.getSize());
//		
//		for(int i = 0; i < customList.getSize(); i++) {
//			System.out.println(i + " -> " + customList.get(i));
//		}	
//				
//	}

}
