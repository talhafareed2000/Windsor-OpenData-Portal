// FileManipulation.java
// eventually transition readFile() into this class

// FileManipulation: class to read the csv files for categories
class FileManipulation
{
	// FileManipulation has a fileCategory
	private String fileCategory;
	
	// default constructor
	FileManipulation()
	{
		this.fileCategory = "";
	}
	
	// overloaded constructor
	FileManipulation(String fileCategory)
	{
		this.fileCategory = fileCategory;
	}
	
	// getters and setters
	
	public String getFileCategory()
	{
		this.fileCategory = fileCategory;
	}
	
	public void setFileCategory(String fileCategory)
	{
		this.fileCategory = fileCategory;
	}
	
	// eventually transition to here
	public void readFile()
	{
		// implement in next phase
	}
}