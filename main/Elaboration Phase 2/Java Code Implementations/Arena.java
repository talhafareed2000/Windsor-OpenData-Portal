// Arena.java
// Arena category

// Arena: class used to store Arena category
class Arena extends Category {
	
	// Every arena has a ID, name, address, lat, and long
	private int arenaID;
	private String arenaName;
	private String arenaAddress;
	private float arenaLat;
	private float arenaLong;

	// default constructor
	Arena() 
	{
		this.arenaID = 0;
		this.arenaName = "";
		this.arenaAddress = "";
		this.arenaLat = 0;
		this.arenaLong = 0;
	}
	
	// overloaded constructor
	Arena(int arenaID, String arenaName, String arenaAddress, float arenaLat, float arenaLong)
	{
		this.arenaID = arenaID;
		this.arenaName = arenaName;
		this.arenaAddress = arenaAddress;
		this.arenaLat = arenaLat;
		this.arenaLong = arenaLong;
	}
	
	// getters and setters
	
	public int getArenaID()
	{
		return arenaID;
	}
	
	public void setArenaID(int arenaID)
	{
		this.arenaID = arenaID;
	}
	
	public String getArenaName()
	{
		return arenaName;
	}
	
	public void setArenaName(String arenaName)
	{
		this.arenaName = arenaName;
	}
	
	public String getArenaAddress()
	{
		return arenaAddress;
	}
	
	public void setArenaAddress(String arenaAddress)
	{
		this.arenaAddress = arenaAddress;
	}
	
	public float getArenaLat()
	{
		return arenaLat;
	}
	
	public void setArenaLat(float arenaLat)
	{
		this.arenaLat = arenaLat;
	}
	
	public float getArenaLong()
	{
		return arenaLong;
	}
	
	public void setArenaLong(float arenaLong)
	{
		this.arenaLong = arenaLong;

	}
	
	// to String to return information
	public String toString()
	{
		return (arenaID + " " +arenaName + " " +arenaAddress + " " +arenaLat + " " +arenaLong);
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
	
	// find the Trending Arenas
	public void findTrending()
	{
		// implement in next phase
	}
	
	// find the most popular Arena
	public void findMostPopular()
	{
		// implement in next phase
	}
	
	// print all the information
	public void printAll()
	{
		System.out.println(arenaID + "  " +arenaName + "  " +arenaAddress + "  " +arenaLat + "  " +arenaLong );
	}
	
}