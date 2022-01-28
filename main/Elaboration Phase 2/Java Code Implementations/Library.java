// Library.java
// category Library

// Library: class for the Library category
class Library extends Category {
	
	// Every Library has a id, name, address, url, lat, and long
	private int libraryID;
	private String libraryName;
	private String libraryAddress;
	private String libraryURL;
	private float libraryLat;
	private float libraryLong;

	// default constructor
	Library() 
	{
		this.libraryID = 0;
		this.libraryName = "";
		this.libraryAddress = "";
		this.libraryURL = "";
		this.libraryLat = 0;
		this.libraryLong = 0;
	}
	
	// overloaded constructor
	Library(int libraryID, String libraryName, String libraryAddress, String libraryURL, float libraryLat, float libraryLong)
	{
		this.libraryID = libraryID;
		this.libraryName = libraryName;
		this.libraryAddress = libraryAddress;
		this.libraryURL = libraryURL;
		this.libraryLat = libraryLat;
		this.libraryLong = libraryLong;
	}
	
	// getters and setters
	
	public int getLibraryID()
	{
		return libraryID;
	}
	
	public void setLibraryID(int libraryID)
	{
		this.libraryID = libraryID;
	}
	
	public String getLibraryName()
	{
		return libraryName;
	}
	
	public void setLibraryName(String libraryName)
	{
		this.libraryName = libraryName;
	}
	
	public String getLibraryAddress()
	{
		return libraryAddress;
	}
	
	public void setLibraryAddress(String libraryAddress)
	{
		this.libraryAddress = libraryAddress;
	}
	
	public String getLibraryURL()
	{
		return libraryURL;
	}
	
	public void setLibraryURL(String libraryURL)
	{
		this.libraryURL = libraryURL;
	}
	
	public float getLibraryLat()
	{
		return libraryLat;
	}
	
	public void setLibraryLat(float libraryLat)
	{
		this.libraryLat = libraryLat;
	}
	
	public float getLibraryLong()
	{
		return libraryLong;
	}
	
	public void setLibraryLong(float libraryLong)
	{
		this.libraryLong = libraryLong;

	}
	
	// return all info
	public String toString()
	{
		return (libraryID +" " +libraryName + " " +libraryAddress + " " +libraryURL + " " +libraryLat + " " +libraryLong );
	}
	
	// sort in ascending order
	public void sortAsc()
	{
		// implement in next phase
	}
	
	// sort in descending order
	public void sortDesc()
	{
		// implement in next phase
	}
	
	// find trending Libraries
	public void findTrending()
	{
		// implement in next phase
	}
	
	// find most popular libraries
	public void findMostPopular()
	{
		// implement in next phase
	}
	
	// print all information
	public void printAll()
	{
		System.out.println(libraryID + "  " +libraryName + "  " +libraryAddress + "  " +libraryURL + "  " +libraryLat + "  " +libraryLong );
	}
	
}