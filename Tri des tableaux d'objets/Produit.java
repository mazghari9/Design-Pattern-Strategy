
public  class Produit implements Comparable {
	String name;
	int price;
	
	Produit(String name, int price){
		this.name=name;
		this.price=price;
	}

	public int compareTo(Produit prod) {
		// TODO Auto-generated method stub
		if((this.name+this.price).compareTo(prod.name+prod.price)>0)
			return -1;
		else if((this.name+this.price).compareTo(prod.name+prod.price)<0)
			return 1;
		else
			return 0;
	}

	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	

	

}
