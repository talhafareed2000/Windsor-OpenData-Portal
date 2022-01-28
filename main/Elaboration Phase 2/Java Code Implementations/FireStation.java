// FireStation.java
// Category Fire Station

// FireStation: class used to store FireStation category
class FireStation extends Category {
	
	// Every fire station has a id, address, hall number, lat, and long
	private int fireSID;
	private String fireSAddress;
	private String fireHallNum;
	private float fireSLat;
	private float fireSLong;

	// default constructor
	FireStation() 
	{
		this.fireSID = 0;
		this.fireSAddress = "";
		this.fireHallNum = "";
		this.fireSLat = 0;
		this.fireSLong = 0;
	}
	
	// overloaded constructor
	FireStation(int fireSID, String fireSAddress, String fireHallNum, float fireSLat, float fireSLong)
	{
		this.fireSID = fireSID;
		this.fireSAddress = fireSAddress;
		this.fireHallNum = fireHallNum;
		this.fireSLat = fireSLat;
		this.fireSLong = fireSLong;
	}
	
	// getters and setters
	
	public int getFireSID()
	{
		return fireSID;
	}
	
	public void setFireSID(int fireSID)
	{
		this.fireSID = fireSID;
	}
	
	public String getFireSAddress()
	{
		return fireSAddress;
	}
	
	public void setFireSAddress(String fireSAddress)
	{
		this.fireSAddress = fireSAddress;
	}
	
	public String getFireHallNum()
	{
		return fireHallNum;
	}
	
	public void setFireHallNum(String fireHallNum)
	{
		this.fireHallNum = fireHallNum;
	}
	
	public float getFireSLat()
	{
		return fireSLat;
	}
	
	public void setFireSLat(float fireSLat)
	{
		this.fireSLat = fireSLat;
	}
	
	public float getFireSLong()
	{
		return fireSLong;
	}
	
	public void setFireSLong(float fireSLong)
	{
		this.fireSLong = fireSLong;

	}
	
	// return all info
	public String toString()
	{
		return (fireSID +" " +fireSAddress + " " +fireHallNum + " " +fireSLat + " " +fireSLong);
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
	
	// find Trending Fire Stations
	public void findTrending()
	{
		// implement in next phase
	}
	
	// find Most Popular Fire Stations
	public void findMostPopular()
	{
		// implement in next phase
	}
	
	// print all info
	public void printAll()
	{
		System.out.println(fireSID + "  " +fireSAddress + "  " +fireHallNum + "  " +fireSLat + "  " +fireSLong );
	}
	
}