package gitTestProject;

public class Product
{
	private Integer productNumber;
	private String shortName;
	private String description;
	
	public Product(Integer aProductNumber, String aShortName, String aDescription)
    {
	    super();
	    productNumber = aProductNumber;
	    shortName = aShortName;
	    description = aDescription;
    }

	public Integer getProductNumber()
	{
		return productNumber;
	}
	
	public String getShortName()
	{
		return shortName;
	}
	
	public String getDescription()
	{
		return description;
	}
}
