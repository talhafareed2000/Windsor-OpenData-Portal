// CommunityCentre.java
// category CommunityCentre

// CommunityCentre: class used to store Community Centre category
class CommunityCentre extends Category {
	
	// Every Community Centre has a id, name, address, lat, and long
	private int ccentreID;
	private String ccentreName;
	private String ccentreAddress;
	private float ccentreLat;
	private float ccentreLong;

	// default constructor
	CommunityCentre() 
	{
		this.ccentreID = 0;
		this.ccentreName = "";
		this.ccentreAddress = "";
		this.ccentreLat = 0;
		this.ccentreLong = 0;
	}
	
	// overlaoded constructor
	CommunityCentre(int ccentreID, String ccentreName, String ccentreAddress, float ccentreLat, float ccentreLong)
	{
		this.ccentreID = ccentreID;
		this.ccentreName = ccentreName;
		this.ccentreAddress = ccentreAddress;
		this.ccentreLat = ccentreLat;
		this.ccentreLong = ccentreLong;
	}
	
	// getters and setters
	
	public int getCcentreID()
	{
		return ccentreID;
	}
	
	public void setCcentreID(int ccentreID)
	{
		this.ccentreID = ccentreID;
	}
	
	public String getCcentreName()
	{
		return ccentreName;
	}
	
	public void setCcentreName(String ccentreName)
	{
		this.ccentreName = ccentreName;
	}
	
	public String getCcentreAddress()
	{
		return ccentreAddress;
	}
	
	public void setCcentreAddress(String ccentreAddress)
	{
		this.ccentreAddress = ccentreAddress;
	}
	
	public float getCcentreLat()
	{
		return ccentreLat;
	}
	
	public void setCcentreLat(float ccentreLat)
	{
		this.ccentreLat = ccentreLat;
	}
	
	public float getCcentreLong()
	{
		return ccentreLong;
	}
	
	public void setCcentreLong(float ccentreLong)
	{
		this.ccentreLong = ccentreLong;

	}
	
	public String toString()
	{
		return (ccentreID + " " +ccentreName + " " +ccentreAddress + " " +ccentreLat + " "  +ccentreLong);
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
	
	// find the trending Community Centres
	public void findTrending()
	{
		// implement in next phase
	}
	
	// find the most popular Community Centres
	public void findMostPopular()
	{
		// implement in next phase
	}
	
	// print all info
	public void printAll()
	{
		System.out.println(ccentreID + "  " +ccentreName + "  " +ccentreAddress + "  " +ccentreLat + "  " +ccentreLong );
	}
	
}