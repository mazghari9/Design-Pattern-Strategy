import java.util.ArrayList;

class MergeSort implements Strategy {

	void merge(ArrayList<Produit> prods, int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        Produit L[] = new Produit[n1];
        Produit R[] = new Produit[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = prods.get(l + i);
        for (int j = 0; j < n2; ++j)
            R[j] = prods.get(m + 1 + j);
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j])==1 || L[i].compareTo(R[j])==0) {
                prods.set(k, L[i]);
                i++;
            }
            else {
                prods.set(k, R[j]);
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
        	prods.set(k, L[i]);
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
        	prods.set(k, R[j]);
            j++;
            k++;
        }
    }

    public void sort(ArrayList<Produit> prods, int l, int r) {
    	if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;
 
            // Sort first and second halves
            sort(prods, l, m);
            sort(prods, m + 1, r);
 
            // Merge the sorted halves
            merge(prods, l, m, r);
        }
    	if(r==prods.size()-1 && l==0){
        System.out.println("sorting array using merge sort strategy");
        for(int i=0;i<prods.size();i++){
        	System.out.println("Product "+(i+1)+": "+prods.get(i).name+" "+prods.get(i).price);
        }
    	}

    }

}
