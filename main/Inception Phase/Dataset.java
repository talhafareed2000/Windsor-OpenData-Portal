// Potential Class Dataset for how each seperate dataset will be stored
// This is used with Database
class Dataset
{
	// variables needed for a Dataset
	// A dataset has a data number, title, description, publisher, date, image, file, and contact information
	int dataNumber;
	String dataTitle;
	String dataDescription;
	String dataPublisher;
	String dataDate;
	String dataImage;
	String dataFile;
	String dataContact;
	
	// The default constructor
	Dataset()
	{
		this.dataNumber = 0;
		this.dataTitle = "";
		this.dataDescription = "";
		this.dataPublisher = "";
		this.dataDate = "";
		this.dataImage = "";
		this.dataFile = "";
		this.dataContact = "";
	}
	
	// The parameters constructor
	Dataset( int dataNumber, String dataTitle, String dataDescription, String dataPublisher, String dataDate, String dataImage, String dataFile, String dataContact)
	{
		this.dataNumber = dataNumber;
		this.dataTitle = dataTitle;
		this.dataDescription = dataDescription;
		this.dataPublisher = dataPublisher;
		this.dataDate = dataDate;
		this.dataImage = dataImage;
		this.dataFile = dataFile;
		this.dataContact = dataContact;
	}
	
	// All the getters and setters to get the various values
	public int getDataNumber()
	{
		return dataNumber;
	}
	
	public void setDataNumber( int dataNumber )
	{
		this.dataNumber = dataNumber;
	}
	
	public String getDataTitle()
	{
		return dataTitle;
	}
	
	public void setDataTitle(String dataTitle)
	{
		this.dataTitle = dataTitle;
	}
	
	public String getDataDescription()
	{
		return dataDescription;
	}
		
	public void setDataDescription(String dataDescription)
	{
		this.dataDescription = dataDescription;
	}	
	
	public String getDataPublisher()
	{
		return dataPublisher;
	}
		
	public void setDataPublisher(String dataPublisher)
	{
		this.dataPublisher = dataPublisher;
	}	

	public String getDataDate()
	{
		return dataDate;
	}
		
	public void setDataDate(String dataDate)
	{
		this.dataDate = dataDate;
	}	
	
	public String getDataImage()
	{
		return dataImage;
	}
		
	public void setDataImage(String dataImage)
	{
		this.dataImage = dataImage;
	}	

	public String getDataFile()
	{
		return dataFile;
	}
		
	public void setDataFile(String dataFile)
	{
		this.dataFile = dataFile;
	}
	
	public String getDataContact()
	{
		return dataContact;
	}
		
	public void setDataContact(String dataContact)
	{
		this.dataContact = dataContact;
	}	
	
	// Print all values
	public String printAllInfo()
	{
		return (dataNumber + "\n" + dataTitle + "\n" + dataDescription + "\n" +dataPublisher + "\n" +dataDate + "\n" +dataImage + "\n" +dataFile +"\n" +dataContact);
	}
}