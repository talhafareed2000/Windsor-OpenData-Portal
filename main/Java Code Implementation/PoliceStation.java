// PoliceStation.java
// category PoliceStation

// PoliceStation: class PoliceStation category
class PoliceStation extends Category {
	
	// Every Police Station has a id, name, address, lat, and long
	private int policeID;
	private String policeName;
	private String policeAddress;
	private float policeLat;
	private float policeLong;

	// default constructor
	PoliceStation() 
	{
		this.policeID = 0;
		this.policeName = "";
		this.policeAddress = "";
		this.policeLat = 0;
		this.policeLong = 0;
	}
	
	// overloaded constructor
	PoliceStation(int policeID, String policeName, String policeAddress, float policeLat, float policeLong)
	{
		this.policeID = policeID;
		this.policeName = policeName;
		this.policeAddress = policeAddress;
		this.policeLat = policeLat;
		this.policeLong = policeLong;
	}
	
	// getters and setters
	
	public int getPoliceID()
	{
		return policeID;
	}
	
	public void setPoliceID(int policeID)
	{
		this.policeID = policeID;
	}
	
	public String getPoliceName()
	{
		return policeName;
	}
	
	public void setPoliceName(String policeName)
	{
		this.policeName = policeName;
	}
	
	public String getPoliceAddress()
	{
		return policeAddress;
	}
	
	public void setPoliceAddress(String policeAddress)
	{
		this.policeAddress = policeAddress;
	}
	
	public float getPoliceLat()
	{
		return policeLat;
	}
	
	public void setPoliceLat(float policeLat)
	{
		this.policeLat = policeLat;
	}
	
	public float getPoliceLong()
	{
		return policeLong;
	}
	
	public void setPoliceLong(float policeLong)
	{
		this.policeLong = policeLong;

	}
	
	// return all info
	public String toString()
	{
		return (policeID + " " +policeName + " " +policeAddress+ " " +policeLat+ " " +policeLong);
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
	
	// find trening Police Stations
	public void findTrending()
	{
		// implement in next phase
	}
	
	// find most popular Police Stations
	public void findMostPopular()
	{
		// implement in next phase
	}
	
	// print all info
	public void printAll()
	{
		System.out.println(policeID + "  " +policeName + "  " +policeAddress + "  " +policeLat + "  " +policeLong );
	}
	
}