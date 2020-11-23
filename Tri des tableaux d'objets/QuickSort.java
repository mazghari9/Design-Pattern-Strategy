import java.util.ArrayList;

class QuickSort implements Strategy {
	
	int partition(ArrayList<Produit> prods, int low, int high) 
    { 
        Produit pivot = prods.get(high);  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (prods.get(j).compareTo(pivot)==1) 
            { 
                i++; 
  
                // swap numbers[i] and numbers[j] 
                Produit temp = prods.get(i); 
                prods.set(i, prods.get(j)); 
                prods.set(j,temp); 
            } 
        } 
  
        // swap numbers[i+1] and numbers[high] (or pivot) 
        Produit temp = prods.get(i+1); 
        prods.set(i+1, prods.get(high)); 
        prods.set(high, temp); 
  
        return i+1; 
    }
	
	

    public void sort(ArrayList<Produit> prods, int low, int high) {
    	
    	if (low < high) 
        { 
            /* pi is partitioning index, numbers[pi] is  
              now at right place */
            int pi = partition(prods, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(prods, low, pi-1); 
            sort(prods, pi+1, high); 
        }
    	if(low==high){
        System.out.println("sorting array using quick sort strategy");
        for(int i=0;i<prods.size();i++){
        	System.out.println("Product "+(i+1)+": "+prods.get(i).name+" "+prods.get(i).price);
        }
    	}

    }

}
