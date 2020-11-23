class BubbleSort implements Strategy {
    public void sort(int[] numbers,int a,int b) {
    	int n = numbers.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++){
                if (numbers[j] > numbers[j+1]) 
                { 
                    // swap numbers[j+1] and numbers[j] 
                    int temp = numbers[j]; 
                    numbers[j] = numbers[j+1]; 
                    numbers[j+1] = temp; 
                }
            }
        System.out.println("sorting array using bubble sort strategy");
        for(int i=0;i<n;i++){
        	System.out.println(numbers[i]);
        }
    }
}
