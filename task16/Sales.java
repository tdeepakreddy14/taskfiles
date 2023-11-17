import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class sale{
	
	String Product;
	double amount;
	LocalDate date;
	sale(String Product,double amount,LocalDate date){
		this.Product=Product;
		this.amount=amount;
		this.date=date;
	}
	public String getProduct() {
		return Product;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public String toString() {
		return "product : "+getProduct()+", amount : "+getAmount()+", date : "+getDate();
	}
}

public class Sales{
	public static void main(String[] args) {
		
		List<sale> salesList = Arrays.asList(
				new sale("laptop",60000,LocalDate.of(2023,1,2)),
				new sale("tv",30000,LocalDate.of(2022,2,14)),
				new sale("tv",70000,LocalDate.of(2023,2,14)),
				new sale("laptop",60000,LocalDate.of(2023,1,4)),
				new sale("phone",30000,LocalDate.of(2023,1,2)),
				new sale("phone",30000,LocalDate.of(2023,4,12)),
				new sale("phone",30000,LocalDate.of(2023,3,22)), 
				new sale("headset",3000,LocalDate.of(2023,1,2))
		);
		
		// Filter out sales that occurred before January 1, 2023
		LocalDate cutoffDate = LocalDate.of(2023,1,1);
		List<sale> filteredSales = salesList.stream()
				.filter(sale -> sale.getDate().isAfter(cutoffDate))
				.collect(Collectors.toList());
		System.out.println("Filtered Sales: " +filteredSales + "\n");
		
		
		 // Group the remaining sales by product
		
		Map<String,List<sale>> salesByProducts = filteredSales.stream()
				.collect(Collectors.groupingBy(sale::getProduct));

		System.out.println("Sales by Product: " +salesByProducts+"\n");
		
		//Calculate the total amount of sales for each product
		Map<String,Double> totAmount = salesByProducts.entrySet().stream()
				.collect(Collectors.toMap(entry -> entry.getKey(),
						entry -> entry.getValue().stream()
						.mapToDouble(sale::getAmount)
						.sum()));
		System.out.println("Total amount by Product: " +totAmount+"\n");
		
		//Sort the products based on their total sales in descending order
		List<String> SortedAmount = totAmount.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println("Sorted Products: "+SortedAmount+"\n");

		//Display the top three products with the highest total sales
		List<String> topThreeProducts = SortedAmount.stream()
                .limit(3)
                .collect(Collectors.toList());
		System.out.println("Top three products : "+topThreeProducts+"\n");
		
		
	}
}