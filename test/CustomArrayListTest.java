import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	
	@Test
	void should_add_one_item_to_customArrayList() {
		CustomList<Integer> customList = new CustomArrayList<>();
		
		customList.add(11);
		customList.add(22);
		customList.add(33);
		customList.add(44);
		customList.add(11);
		customList.add(22);
		customList.add(33);
		customList.add(44);
		customList.add(11);
		customList.add(22);
		
		System.out.println("Size before instertion: " + customList.getSize());
				
		customList.add(1, 999);
		
		assertEquals(999, customList.get(1));
		assertEquals(11, customList.getSize());
		
		System.out.println("Size after instertion of 999 in index 1: " + customList.getSize());
		
		for(int i = 0; i < customList.getSize(); i++) {
			System.out.println(i + " -> " + customList.get(i));
		}	
			
		customList.remove(1);
		assertEquals(22, customList.get(1));
		assertEquals(10, customList.getSize());
		
		System.out.println("Size after removal of element in index 1: " + customList.getSize());
		
		for(int i = 0; i < customList.getSize(); i++) {
			System.out.println(i + " -> " + customList.get(i));
		}	
				
	}

}
