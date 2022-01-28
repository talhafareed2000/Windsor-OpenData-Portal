// School.java
// category School

// School: class School category
class School extends Category {
	
	// Every School has a id, name, address, school board, lat, and long
	private int schoolID;
	private String schoolName;
	private String schoolAddress;
	private String schoolBoard;
	private float schoolLat;
	private float schoolLong;

	// default constructor
	School() 
	{
		this.schoolID = 0;
		this.schoolName = "";
		this.schoolAddress = "";
		this.schoolBoard = "";
		this.schoolLat = 0;
		this.schoolLong = 0;
	}
	
	// overloaded constructor
	School(int schoolID, String schoolName, String schoolAddress, String schoolBoard, float schoolLat, float schoolLong)
	{
		this.schoolID = schoolID;
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
		this.schoolBoard = schoolBoard;
		this.schoolLat = schoolLat;
		this.schoolLong = schoolLong;
	}
	
	// getters and setters
	
	public int getSchoolID()
	{
		return schoolID;
	}
	
	public void setSchoolID(int schoolID)
	{
		this.schoolID = schoolID;
	}
	
	public String getSchoolName()
	{
		return schoolName;
	}
	
	public void setSchoolName(String schoolName)
	{
		this.schoolName = schoolName;
	}
	
	public String getSchoolAddress()
	{
		return schoolAddress;
	}
	
	public void setSchoolAddress(String schoolAddress)
	{
		this.schoolAddress = schoolAddress;
	}
	
	public String getSchoolBoard()
	{
		return schoolBoard;
	}
	
	public void setSchoolBoard(String schoolBoard)
	{
		this.schoolBoard = schoolBoard;
	}
	
	public float getSchoolLat()
	{
		return schoolLat;
	}
	
	public void setSchoolLat(float schoolLat)
	{
		this.schoolLat = schoolLat;
	}
	
	public float getSchoolLong()
	{
		return schoolLong;
	}
	
	public void setSchoolLong(float schoolLong)
	{
		this.schoolLong = schoolLong;

	}
	
	// return all info
	public String toString()
	{
		return (schoolID+ " " +schoolName + " " +schoolAddress + " " +schoolBoard + " " +schoolLat + " " +schoolLong);
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
	
	// find the trending Schools
	public void findTrending()
	{
		// implement in next phase
	}
	
	// find the Most Popular Schools
	public void findMostPopular()
	{
		// implement in next phase
	}
	
	// print all info
	public void printAll()
	{
		System.out.println(schoolID + "  " +schoolName + "  " +schoolAddress + "  " +schoolBoard + "  " +schoolLat + "  " +schoolLat  );
	}
	
}