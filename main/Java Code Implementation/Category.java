// Category.java
// abstract class Category

// Category: abstract class for all the categories
abstract class Category
{
	// Categories have a id and name
	private int categoryID;
	private String categoryName;
	
	// default constructor
	Category()
	{
		this.categoryID = 0;
		this.categoryName = "";
	}
	
	// overloaded constructor
	Category(int categoryID, String categoryName)
	{
		this.categoryID = categoryID;
		this.categoryName = categoryName;
	}
	
	// getters and setters
	
	public int getCategoryID()
	{
		return categoryID;
	}
	
	public void setCategoryID(int categoryID)
	{
		this.categoryID = categoryID;
	}
	
	public String getCategoryName()
	{
		return categoryName;
	}
	
	public void setCategoryName(String categoryName)
	{
		this.categoryName = categoryName;
	}
	
	public String toString()
	{
		return (categoryID + " " +categoryName);
	}
	
	// abstract methods
	
	public abstract void sortAsc();
	
	public abstract void sortDesc();
	
	public abstract void findTrending();
	
	public abstract void findMostPopular();
	
	public abstract void printAll();
}