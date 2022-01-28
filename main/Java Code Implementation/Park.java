// Park.java
// category Park

// Park: class for Park category
class Park extends Category {
	
	// Every Park has a id, name, address, lat, and long
	private int parkID;
	private String parkName;
	private String parkAddress;
	private float parkLat;
	private float parkLong;

	// default constructor
	Park() 
	{
		this.parkID = 0;
		this.parkName = "";
		this.parkAddress = "";
		this.parkLat = 0;
		this.parkLong = 0;
	}
	
	// overloaded constructor
	Park(int parkID, String parkName, String parkAddress, float parkLat, float parkLong)
	{
		this.parkID = parkID;
		this.parkName = parkName;
		this.parkAddress = parkAddress;
		this.parkLat = parkLat;
		this.parkLong = parkLong;
	}
	
	// getters and setters
	
	public int getParkID()
	{
		return parkID;
	}
	
	public void setParkID(int parkID)
	{
		this.parkID = parkID;
	}
	
	public String getParkName()
	{
		return parkName;
	}
	
	public void setParkName(String parkName)
	{
		this.parkName = parkName;
	}
	
	public String getParkAddress()
	{
		return parkAddress;
	}
	
	public void setParkAddress(String parkAddress)
	{
		this.parkAddress = parkAddress;
	}
	
	public float getParkLat()
	{
		return parkLat;
	}
	
	public void setParkLat(float parkLat)
	{
		this.parkLat = parkLat;
	}
	
	public float getParkLong()
	{
		return parkLong;
	}
	
	public void setParkLong(float parkLong)
	{
		this.parkLong = parkLong;

	}
	
	// return all info
	public String toString()
	{
		return (parkID +" " +parkName +" " +parkAddress +" " +parkLat + " " +parkLong);
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
	
	// find the trending Parks
	public void findTrending()
	{
		// implement in next phase
	}
	
	// find the most popular Parks
	public void findMostPopular()
	{
		// implement in next phase
	}
	
	// print all info
	public void printAll()
	{
		System.out.println(parkID + "  " +parkName + "  " +parkAddress + "  " +parkLat + "  " +parkLong );
	}
	
}