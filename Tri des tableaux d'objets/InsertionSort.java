import java.util.ArrayList;

class InsertionSort implements Strategy {

    public void sort(ArrayList<Produit> prods, int a,int b) {
    	int n = prods.size(); 
        for (int i = 1; i < n; ++i) { 
        	Produit key = prods.get(i); 
            int j = i - 1; 
  
            /* Move elements of numbers[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && prods.get(j).compareTo(key)==-1 ) { 
            	prods.set(j + 1, prods.get(j)); 
                j = j - 1; 
            } 
            prods.set(j + 1, key); 
        }
        System.out.println("sorting array using insertion sort strategy");
        for(int i=0;i<n;i++){
        	System.out.println("Product "+(i+1)+": "+prods.get(i).name+" "+prods.get(i).price);
        }
    }
}
