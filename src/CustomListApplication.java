public class CustomListApplication {

	public static void main(String[] args) {
		
		CustomList<String> myCustomList = new CustomArrayList<>();
		
    	System.out.println("CustomArrayList size before addition of elements: " + myCustomList.getSize());
		
		// Add elements
		for (int i = 0; i < 10; i++) {
			myCustomList.add("element " + (i+ 1));
		}
		
		System.out.println("CustomArrayList size after addition of elements: " + myCustomList.getSize());
		
		System.out.println("Now lets add element 888 at index 1");
		myCustomList.add(1, "888");
		
		System.out.println("Lets print the new CustomArrayList:");
		
    	// Print elements from CustomArrayList
		for (int j = 0; j < myCustomList.getSize(); j++) {
			System.out.println(myCustomList.get(j));
		}
		
		System.out.println("Now lets remove element at index 2 and print the new CustomArrayList:");
		myCustomList.remove(2);
		
		// Print elements from CustomArrayList
				for (int j = 0; j < myCustomList.getSize(); j++) {
					System.out.println(myCustomList.get(j));
				}

	}

}
