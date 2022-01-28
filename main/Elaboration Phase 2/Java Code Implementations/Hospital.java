// Hospital.java
// category Hospital

// Hosptal: class used to store Hospital category
class Hospital extends Category {
	
	// Every Hospital has a ID, name, address, lat, long, and code
	private int hospitalID;
	private String hospitalName;
	private String hospitalAddress;
	private float hospitalLat;
	private float hospitalLong;
	private String hospitalCode;

	// default constructor
	Hospital() 
	{
		this.hospitalID = 0;
		this.hospitalName = "";
		this.hospitalAddress = "";
		this.hospitalLat = 0;
		this.hospitalLong = 0;
		this.hospitalCode = "";
	}
	
	// overloaded constructor
	Hospital(int hospitalID, String hospitalName, String hospitalAddress, float hospitalLat, float hospitalLong, String hospitalCode)
	{
		this.hospitalID = hospitalID;
		this.hospitalName = hospitalName;
		this.hospitalAddress = hospitalAddress;
		this.hospitalLat = hospitalLat;
		this.hospitalLong = hospitalLong;
		this.hospitalCode = hospitalCode;
	}
	
	// getters and setters
	
	public int getHospitalID()
	{
		return hospitalID;
	}
	
	public void setHospitalID(int hospitalID)
	{
		this.hospitalID = hospitalID;
	}
	
	public String getHospitalName()
	{
		return hospitalName;
	}
	
	public void setHospitalName(String hospitalName)
	{
		this.hospitalName = hospitalName;
	}
	
	public String getHospitalAddress()
	{
		return hospitalAddress;
	}
	
	public void setHospitalAddress(String hospitalAddress)
	{
		this.hospitalAddress = hospitalAddress;
	}
	
	public float getHospitalLat()
	{
		return hospitalLat;
	}
	
	public void setHospitalLat(float hospitalLat)
	{
		this.hospitalLat = hospitalLat;
	}
	
	public float getHospitalLong()
	{
		return hospitalLong;
	}
	
	public void setHospitalLong(float hospitalLong)
	{
		this.hospitalLong = hospitalLong;

	}
	
	public String getHospitalCode()
	{
		return hospitalCode;
	}
	
	public void setHospitalCode(String hospitalCode)
	{
		this.hospitalCode = hospitalCode;
	}
	
	// return all info
	public String toString()
	{
		return (hospitalID + " " +hospitalName+ " " +hospitalAddress + " " +hospitalLat + " " +hospitalLong + " " +hospitalCode);
	}
	
	// sort in ascending order
	public void sortAsc()
	{
		// implement in next phase
	}
	
	// sort in descending order
	public void sortDesc()
	{
		
	}
	
	// find Trending Hospitals
	public void findTrending()
	{
		// implement in next phase
	}
	
	// find Most Popular
	public void findMostPopular()
	{
		// implement in next phase
	}
	
	// print all information
	public void printAll()
	{
		System.out.println(hospitalID + "  " +hospitalName + "  " +hospitalAddress + "  " +hospitalCode + "  " +hospitalLat + "  " +hospitalLong );
	}
	
}