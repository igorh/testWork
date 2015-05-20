package gitTestProject;

import java.util.ArrayList;
import java.util.List;

public class MyMain
{
	private static List<Product> listProduct = new ArrayList<Product>();
	private static List<Storage> listStorage = new ArrayList<Storage>();

	public static void main(String[] args)
	{
		getListProduct();
		writeProducts();

		getListStorage();
		writeStorage();
	}

	private static void getListProduct()
	{
		Product p = new Product(Integer.valueOf(1), "nail", "short iron nail");
		listProduct.add(p);
		p = new Product(Integer.valueOf(2), "Big brick", "brick 35x30x90");
		listProduct.add(p);
		p = new Product(Integer.valueOf(3), "Small brick", "brick 22x15x40");
		listProduct.add(p);
		p = new Product(Integer.valueOf(3), "Hammer", "heavy hammer");
		listProduct.add(p);
	}

	private static void getListStorage()
	{
		if (listProduct == null)
		{
			return;
		}
		for(int i = 0; i < listProduct.size(); i++)
		{
			Product p = listProduct.get(i);
			Double d = new Double(p.getProductNumber().intValue() * 3);
			listStorage.add(new Storage(p, "pcs", d));
		}
	}

	private static void writeProducts()
	{
		System.out.println("PRODUCTS");
		for(Product p : listProduct)
		{
			System.out.println(p.getProductNumber() + ": " + p.getShortName());
		}
	}

	private static void writeStorage()
	{
		System.out.println();
		System.out.println("STORAGE");
		for(Storage s : listStorage)
		{
			System.out.println(s.getProduct().getProductNumber() + ": " + s.getQuantity() + " " + s.getMeasure());
		}
	}
}
