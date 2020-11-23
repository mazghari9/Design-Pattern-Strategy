class InsertionSort implements Strategy {

    public void sort(int[] numbers, int a,int b) {
    	int n = numbers.length; 
        for (int i = 1; i < n; ++i) { 
            int key = numbers[i]; 
            int j = i - 1; 
  
            /* Move elements of numbers[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && numbers[j] > key) { 
            	numbers[j + 1] = numbers[j]; 
                j = j - 1; 
            } 
            numbers[j + 1] = key; 
        }
        System.out.println("sorting array using insertion sort strategy");
        for(int i=0;i<n;i++){
        	System.out.println(numbers[i]);
        }
    }
}
