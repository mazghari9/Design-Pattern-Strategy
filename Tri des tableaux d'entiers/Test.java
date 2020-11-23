import java.util.Scanner;

public class Test {
	private static int array[];
	static Scanner sc = new Scanner(System.in);
	public static void fillArray(){
		int n;
		
		System.out.println("How much element:");
		n=sc.nextInt();
		array=new int[n];
		System.out.println("Enter you elements:");
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
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
    		
	        fillArray();
	        choice=chooseSort();
	        
	        if(choice==1){
	        	Context ctx = new Context(new BubbleSort());
	        	ctx.arrange(array,0,array.length-1);
	        }
	        if(choice==2){
	        	Context ctx = new Context(new InsertionSort());
	        	ctx.arrange(array,0,array.length-1);
	        }
	        if(choice==3){
	        	Context ctx = new Context(new QuickSort());
	            ctx.arrange(array,0,array.length-1);
	        }
	        if(choice==4){
	        	Context ctx = new Context(new MergeSort());
	            ctx.arrange(array,0,array.length-1);
	        }
        
        	System.out.println("Other session? [Yes=1/No=0]: ");
        	a=sc.nextInt();
        
    	}
    }
}
