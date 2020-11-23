class QuickSort implements Strategy {
	
	int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap numbers[i] and numbers[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap numbers[i+1] and numbers[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    }
	
	

    public void sort(int[] numbers, int low, int high) {
    	
    	if (low < high) 
        { 
            /* pi is partitioning index, numbers[pi] is  
              now at right place */
            int pi = partition(numbers, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(numbers, low, pi-1); 
            sort(numbers, pi+1, high); 
        }
    	if(low==high){
        System.out.println("sorting array using quick sort strategy");
        for(int i=0;i<numbers.length;i++){
        	System.out.println(numbers[i]);
        }
    	}

    }

}
