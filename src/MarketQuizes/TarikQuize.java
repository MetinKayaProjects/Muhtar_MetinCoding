package MarketQuizes;

import java.awt.RenderingHints.Key;
import java.io.PipedInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TarikQuize {
	public static void main(String[] args) {

/* You have a product list
   and also price list associated with these products
   
   there is also a soldProductList and one more list with the prices of the sold products
   But sometimes the prices may be wrong, so this is a bug.
   You are asked to calculate how many bugs you have
 */

//	products[] size n = 4; 
	List<String> products = Arrays.asList("rice", "sugar", "wheat", "cheese");
//	pruductPrices[] size n=4;
	List<Double> productPrices = Arrays.asList(16.89, 56.92, 20.89, 345.99);
	
//	pruductSold[] size m=2;
	
	List<String> productSold = Arrays.asList("rice", "cheese", "rice");
//	pruductSold=['rice','cheese']
//	soldPrice[] size m=2;  
	
	List<Double> soldPrice = Arrays.asList(18.89,445.99, 18.89);
//	soldPrice=[18.99,345.99]----->return int 1;
//	since rice's price is not correct

	
	System.out.println(priceCheck(products, productPrices, productSold,
			soldPrice));
	
	
}

	
	public static int priceCheck(List<String> products, List<Double> productPrices, List<String> productSold,
			List<Double> soldPrice) {
//		write your code here

//		HashMap<String, Float> myProducts = new 

		int index = 0;
		for (int i = 0; i < productSold.size(); i++) {

			int indexOfSoldProduct = productSold.indexOf(productSold.get(i)); // satilanurunun indexi
			String soldProduct = productSold.get(indexOfSoldProduct); // satilan urunun adi
			double priceOfSoldProduct = soldPrice.get(indexOfSoldProduct); // satilan urunun fiyati

			for (int j = 0; j < products.size(); j++) {
				if (products.get(j).equalsIgnoreCase(soldProduct)) {

					int soldProductInTheList = products.indexOf(products.get(j));
					double soldProductPriceInTheList = productPrices.get(soldProductInTheList);
					if (!(soldProductPriceInTheList == priceOfSoldProduct)) {
						index ++;
					}
				}

			}

		}

		return index;
	}
	
//	public static int priceCheckWithMap(List<String> products, List<Double> productPrices, List<String> productSold,
//			List<Double> soldPrice) {
//		int index = 0;
//		
//		Map<String, Double> hm = new HashMap<String, Double>();
//		Set<Map.Entry<String, Double>> shm = hm.entrySet();
//		
//		for (int i = 0; i < products.size(); i++) {
//			hm.put(products.get(i), productPrices.get(i));
//		}
//		for (Map.Entry<String, Double> entry : shm) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
//		
//		
//		
//		Map<String, Double> hmSold = new HashMap<String, Double>();
//		for (int i = 0; i < productSold.size(); i++) {
//			hmSold.put(productSold.get(i), soldPrice.get(i));
//			
//		}
//		
//		for (int j = 0; j < hm.size(); j++) {
//			if (hm.get(hm).equals(hmSold.get(hmSold))) {
//				if (hm.get) {
//					
//				}
//				
//			}
//		}
//		
//		
//		
//		return index;
//	}

}
