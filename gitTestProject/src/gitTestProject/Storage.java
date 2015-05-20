package gitTestProject;

public class Storage
{
	private Product product;
	private String measure;
	private Double quantity;

	public Storage(Product aProduct, String aMeasure, Double aQuantity)
	{
		super();
		product = aProduct;
		measure = aMeasure;
		quantity = aQuantity;
	}

	public Product getProduct()
	{
		return product;
	}

	public String getMeasure()
	{
		return measure;
	}

	public Double getQuantity()
	{
		return quantity;
	}
}
