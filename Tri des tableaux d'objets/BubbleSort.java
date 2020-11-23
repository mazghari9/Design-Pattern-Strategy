import java.util.ArrayList;

class BubbleSort implements Strategy {
    public void sort(ArrayList<Produit> prods,int a,int b) {
    	int n = prods.size(); 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++){
                if (prods.get(j).compareTo(prods.get(j+1))==-1) 
                { 
                    // swap numbers[j+1] and numbers[j] 
                    Produit temp = prods.get(j); 
                    prods.set(j, prods.get(j+1)); 
                    prods.set(j+1, temp); 
                }
            }
        System.out.println("sorting array using bubble sort strategy");
        for(int i=0;i<n;i++){
        	System.out.println("Product "+(i+1)+": "+prods.get(i).name+" "+prods.get(i).price);
        }
    }
}
