package kakaoIntern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
	public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
		Map<String, Float> productMap = new HashMap<String, Float>();
		for(int i = 0; i < products.size(); i++) {
			productMap.put(products.get(i), productPrices.get(i));
		}
		
		int cnt = 0;
		for(int i = 0; i < productSold.size(); i++) {
			if(productMap.containsKey(productSold.get(i))) {
				float first = productMap.get(productSold.get(i));
				float second = soldPrice.get(i);
				
				if(first != second) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}

	public static void main(String[] args) {
		List<String> products = new ArrayList<String>();
		products.add("eggs");
		products.add("milk");
		products.add("cheese");
		
		List<Float> productPrices = new ArrayList<Float>();
		productPrices.add((float)2.89);
		productPrices.add((float)3.29);
		productPrices.add((float)5.79);
		
		List<String> productSold = new ArrayList<String>();
		productSold.add("eggs");
		productSold.add("eggs");
		productSold.add("cheese");
		productSold.add("milk");
		
		List<Float> soldPrice = new ArrayList<Float>();
		soldPrice.add((float)2.89);
		soldPrice.add((float)2.99);
		soldPrice.add((float)5.97);
		soldPrice.add((float)3.29);
		
		int result = priceCheck(products, productPrices, productSold, soldPrice);
		System.out.println(result);
	}
}


































