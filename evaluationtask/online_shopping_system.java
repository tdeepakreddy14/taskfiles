package evaluationtask;
class product{
	private String name;
	private double price;
	private int quantity;
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
}

class shoppingcart {
	private product[] cart;
	private int itemcount=0;
	shoppingcart(int caparsity){
		cart = new product[caparsity];
	}
	public void addproduct(product Product) {
		cart[itemcount]=Product;
		itemcount++;
	}
	public void removeproduct(String product) {
		for(int i=0;i<itemcount;i++) {
			if(cart[i]!=null && cart[i].getName().equals(product)) {
				for(int j=i;j<itemcount-1;j++) {
					cart[j]=cart[j+1];
				}
				cart[itemcount-1]=null;
				itemcount--;
				System.out.println(product+"removed from the cart");	
				return;
			}
		}
		System.out.println("product not found");
		}
	public double totcartvalue(){
		double totalcost = 0.0;
		for(int i=0;i<itemcount;i++) {
			totalcost += cart[i].getPrice()*cart[i].getQuantity();
		}
		return totalcost;
	}
}

public class online_shopping_system {

	public static void main(String[] args) {
		shoppingcart sc = new shoppingcart(3);
		product p1 = new product();
		p1.setName("mobile");
		p1.setPrice(25000);
		p1.setQuantity(1);
		sc.addproduct(p1);
		
		product p2 = new product();
		p2.setName("screen gaurd");
		p2.setPrice(800);
		p2.setQuantity(1);
		sc.addproduct(p2);

		product p3 = new product();
		p3.setName("mobile case");
		p3.setPrice(1200);
		p3.setQuantity(1);
		sc.addproduct(p3);
		
		sc.removeproduct("mobile case");
		System.out.println("total cart value : "+ sc.totcartvalue());
	}
}
