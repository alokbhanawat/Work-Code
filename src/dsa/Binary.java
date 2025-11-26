package dsa;

 class Binary {
	 public static int search(int arrayofElements[],int elementtobeSearched) {
		 int low =0;
		 int high = arrayofElements.length-1;
		 int mid;
		 
		 while(low<=high) {
			 mid =low+high/2;
			 
			 if (arrayofElements[mid]==elementtobeSearched)
				 return mid;
			 
			 if (arrayofElements[mid] < elementtobeSearched)
					low = mid + 1;
			 
				else
					high = mid - 1;
			 
		 }
		 return -1;
		 
	 }
 
 
 
	public static void main(String[] args) {
		int[] arrayofElements = { 10, 15, 23, 25, 32, 39, 45, 47, 49, 50 };
		int elementtobeSearched = 50;
		
		int index = search(arrayofElements, elementtobeSearched);
		if (index == -1)
			System.out.println("Element is not present in the array!");
		else
			System.out.println("Element is found at index position " + index+"!");
		
	}

	}

 
