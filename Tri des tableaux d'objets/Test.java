import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	private static ArrayList<Produit> prods=new ArrayList<Produit>();;
	static Scanner sc = new Scanner(System.in);
	public static void fillArray(){
		String name;
		int price;
		int n;
		System.out.println("How much product:");
		n=sc.nextInt();
		System.out.println("Enter you products:");
		for(int i=0;i<n;i++){
			System.out.println("Product name:");
			name=sc.next();
			System.out.println("Product price:");
			price=sc.nextInt();
			prods.add(new Produit(name,price));
			System.out.println("--------------");
		}	
	}
	
	public static int chooseSort(){
		int choice;
		System.out.println("*** Choose The Sort Type ***");
		System.out.println("1 - BubbleSort");
		System.out.println("2 - InsertionSort");
		System.out.println("3 - QuickSort");
		System.out.println("4 - MergeSort");
		System.out.println("Enter the number of your choice:");
		choice=sc.nextInt();
		return choice;
	}

    public static void main(String args[]) throws InterruptedException {
        
        // we can provide any strategy to do the sorting 
    	int choice;
    	int a=1;
    	
    	while(a==1){
    		prods.clear();
    		
	        fillArray();
	        choice=chooseSort();
    	    
	        if(choice==1){
	        	Context ctx = new Context(new BubbleSort());
	        	ctx.arrange(prods,0,prods.size()-1);
	        }
	        if(choice==2){
	        	Context ctx = new Context(new InsertionSort());
	        	ctx.arrange(prods,0,prods.size()-1);
	        }
	        if(choice==3){
	        	Context ctx = new Context(new QuickSort());
	            ctx.arrange(prods,0,prods.size()-1);
	        }
	        if(choice==4){
	        	Context ctx = new Context(new MergeSort());
	            ctx.arrange(prods,0,prods.size()-1);
	        }
        
        	System.out.println("Other session? [Yes=1/No=0]: ");
        	a=sc.nextInt();
        
    	}
    }
}
