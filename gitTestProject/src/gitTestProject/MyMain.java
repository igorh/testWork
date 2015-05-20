package gitTestProject;

import java.util.ArrayList;
import java.util.List;

public class MyMain
{
	private static List<Product> listProduct = new ArrayList<Product>();

	public static void main(String[] args)
	{
		getListProduct();
		writeProducts();
	}

	private static void getListProduct()
	{
		Product p = new Product(Integer.valueOf(1), "nail", "short iron nail");
		listProduct.add(p);
		p = new Product(Integer.valueOf(2), "brick1", "brick 40x30x90");
		listProduct.add(p);
		p = new Product(Integer.valueOf(3), "brick2", "brick 25x15x40");
		listProduct.add(p);
	}

	private static void writeProducts()
	{
		for(Product p : listProduct)
		{
			System.out.println(p.getProductNumber() + ": " + p.getShortName());
		}
	}
}
