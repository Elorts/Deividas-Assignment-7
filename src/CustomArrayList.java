public class CustomArrayList<T> implements CustomList<T> {
	Integer arrayListSize = 10;
	Integer itemIndex = 0; 
	Object[] items = new Object[arrayListSize];

	@Override
	public boolean add(T item) {
		
		try {
			
			if (itemIndex == arrayListSize) {
				doubleArraySize();
			}
			
			items[itemIndex] = item;
			
			itemIndex++;
			return true;
		} catch (Exception e) {
			System.out.println("Error!");
			return false;
		}
	}

	private void doubleArraySize() {
		arrayListSize *= 2; 
		
		Object[] tempArray = new Object[arrayListSize]; 
		
		for (int i = 0; i < items.length; i++) {
			tempArray[i] =  items[i];
		}
		
		items = tempArray;
	}


	@Override
	public int getSize() {
		return itemIndex;
	}

	@Override
	public T get(int index) {
		return (T) items[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		
		if (itemIndex == arrayListSize) {
			doubleArraySize();
		}
		
		for (int i = itemIndex - 1; i >= index; i--) {
			items[i + 1] = items[i];
		}
		
		items[index] = item;
		itemIndex++;
		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		
		for(int i = index; i < itemIndex; i++) {
			if (i == itemIndex - 1) {
				items[i] = null;
			} else {
				items[i] = items[i + 1];
			}
			
		}
		itemIndex--;
		return null;
	}
	
}
