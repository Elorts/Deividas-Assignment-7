
public class CALTest {

	public static void main(String[] args) {
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}
		
		System.out.println("Lets print the new CustomArrayList:");
		    	// Print elements from CustomArrayList
		for (int j = 0; j < sut.getSize(); j++) {
			System.out.println(sut.get(j));
		}
		
		sut.remove(7);
		
		System.out.println("Lets print the CustomArrayList:");
    	// Print elements from CustomArrayList
		for (int j = 0; j < sut.getSize(); j++) {
			System.out.println(sut.get(j));
	
		}
	}

}
