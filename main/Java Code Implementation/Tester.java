// Tester.java
// Start the program, load the data, and get options from user

// libraries used
import java.io.*;
import java.util.*;
import java.net.*;

// Tester: class to begin the program, load the data, and get options from user based on the menu
class Tester
{
	// used for each category, numbers can change
	public static Arena[] a = new Arena[4];
	public static CommunityCentre[] c = new CommunityCentre[16];
	public static FireStation[] f = new FireStation[7];
	public static Hospital[] h = new Hospital[3];
	public static Library[] l = new Library[11];
	public static Park[] p = new Park[204];
	public static PoliceStation[] ps = new PoliceStation[7];
	public static School[] sh = new School[83];
	
	public static void main(String[] args)
	{
		// load the data from all the csv files
		readFile("ARENAS");
		readFile("COMMUNITY CENTRES");
		readFile("FIRE STATIONS");
		readFile("HOSPITALS");
		readFile("LIBRARIES");
		readFile("PARKS");
		readFile("POLICE STATIONS");
		readFile("SCHOOLS");
		
		int getOption = 0; // used to get menu option
		
		// output start
		System.out.print("*****************************************************************************************************\n"
				       + "*			                                                                            *\n"
				       + "*		                                                                                    *\n"
				       + "*		                                                                                    *\n"
				       + "*          HELLO! WELCOME TO THE CITY OF WINDSOR OPEN DATA PORTAL (COMMAND LINE VERSION)	    *\n"
				       + "*			                                                                            *\n"
				       + "*		                                                                                    *\n"
				       + "*		                                                                                    *\n");				       
		System.out.print("*****************************************************************************************************\n");
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			// menu
			System.out.println("\nMAIN MENU");
			System.out.println("(1)\tCATEGORY LIST");
			System.out.println("(2)\tSEARCH FOR A CATEGORY");
			System.out.println("(3)\tUPLOAD DATA");
			System.out.println("(4)\tMANAGE DATA");
			System.out.println("(5)\tEXIT");
			System.out.print("Select an Option (by number): ");
			getOption = sc.nextInt();
			
			// display category menu
			if(getOption == 1) {
				// used to get sub-menu option
				int getCategory;
				String categoryName = "";
				
				do {
					System.out.println("\nCATEGORY LIST");
					System.out.println("(1)\tARENAS");
					System.out.println("(2)\tCOMMUNITY CENTRES");
					System.out.println("(3)\tFIRE STATIONS");
					System.out.println("(4)\tHOSPITALS");
					System.out.println("(5)\tLIBRARIES");
					System.out.println("(6)\tPARKS");
					System.out.println("(7)\tPOLICE STATIONS");
					System.out.println("(8)\tSCHOOLS");
					System.out.println("(9)\tBACK");
					System.out.print("Select an Option (by number): ");				
					getCategory = sc.nextInt();
					
					// output header based on category and then loop to call the category class method to output
					if(getCategory == 1) {
						System.out.println("ARENA ID  ARENA NAME  ARENA ADDRESS  ARENA LATITIUDE  ARENA LONGITUDE");
						for(int i = 0; i < 4; ++i) {
							a[i].printAll();
						}
					}else if(getCategory == 2) {
						System.out.println("COMMUNITY CENTRE ID  COMMUNITY CENTRE NAME  COMMUNITY CENTRE ADDRESS  COMMUNITY CENTRE LATITIUDE  COMMUNITY CENTRE LONGITUDE");
						for(int i = 0; i < 16; ++i) {
							c[i].printAll();
						}					
					}else if(getCategory == 3) {
						System.out.println("FIRE STATION ID  FIRE STATION ADDRESS  FIRE STATION HALL NUMBER  FIRE STATION LATITIUDE  FIRE STATION LONGITUDE");
						for(int i = 0; i < 7; ++i) {
							f[i].printAll();
						}					
					}else if(getCategory == 4) {
						System.out.println("HOSPITAL ID  HOSPITAL NAME  HOSPITAL ADDRESS  HOSPITAL CODE  HOSPITAL LATITIUDE  HOSPITAL LONGITUDE");
						for(int i = 0; i < 3; ++i) {
							h[i].printAll();
						}					
					}else if(getCategory == 5) {
						System.out.println("LIBRARY ID  LIBRARY NAME  LIBRARY ADDRESS  LIBRARY URL  LIBRARY LATITIUDE  LIBRARY LONGITUDE");
						for(int i = 0; i < 11; ++i) {
							l[i].printAll();
						}					
					}else if(getCategory == 6) {
						System.out.println("PARK ID  PARK NAME  PARK ADDRESS  PARK LATITIUDE  PARK LONGITUDE");
						for(int i = 0; i < 204; ++i) {
							p[i].printAll();
						}					
					}else if(getCategory == 7) {
						System.out.println("POLICE STATION ID  POLICE STATION NAME  POLICE STATION ADDRESS  POLICE STATION LATITIUDE  POLICE STATION LONGITUDE");
						for(int i = 0; i < 7; ++i) {
							ps[i].printAll();
						}					
					}else if(getCategory == 8) {
						System.out.println("SCHOOL ID  SCHOOL NAME  SCHOOL ADDRESS  SCHOOL BOARD  SCHOOL LATITIUDE  SCHOOL LONGITUDE");
						for(int i = 0; i < 83; ++i) {
							sh[i].printAll();
						}					
					}else if(getCategory == 9) {
					}else {
						System.out.println("INVALID INPUT");
					}
				}while(getCategory != 9);
			// allow user to search for a category
			}else if(getOption == 2) {
				// get category name
				System.out.println("ENTER CATEGORY NAME: ");
				String getSearch = sc.next();
				
				// output header based on category and then loop to call the category class method to output
				if(getSearch.equalsIgnoreCase("ARENAS")) {
					System.out.println("ARENA ID  ARENA NAME  ARENA ADDRESS  ARENA LATITIUDE  ARENA LONGITUDE");
					for(int i = 0; i < 4; ++i) {
						a[i].printAll();
					}					
				}else if(getSearch.equalsIgnoreCase("COMMUNITY CENTRES")) {
					System.out.println("COMMUNITY CENTRE ID  COMMUNITY CENTRE NAME  COMMUNITY CENTRE ADDRESS  COMMUNITY CENTRE LATITIUDE  COMMUNITY CENTRE LONGITUDE");
					for(int i = 0; i < 16; ++i) {
						c[i].printAll();
					}						
				}else if(getSearch.equalsIgnoreCase("FIRE STATIONS")) {
					System.out.println("FIRE STATION ID  FIRE STATION ADDRESS  FIRE STATION HALL NUMBER  FIRE STATION LATITIUDE  FIRE STATION LONGITUDE");
					for(int i = 0; i < 7; ++i) {
						f[i].printAll();
					}						
				}else if(getSearch.equalsIgnoreCase("HOSPITALS")) {
					System.out.println("HOSPITAL ID  HOSPITAL NAME  HOSPITAL ADDRESS  HOSPITAL CODE  HOSPITAL LATITIUDE  HOSPITAL LONGITUDE");
					for(int i = 0; i < 3; ++i) {
						h[i].printAll();
					}						
				}else if(getSearch.equalsIgnoreCase("LIBRARIES")) {
					System.out.println("LIBRARY ID  LIBRARY NAME  LIBRARY ADDRESS  LIBRARY URL  LIBRARY LATITIUDE  LIBRARY LONGITUDE");
					for(int i = 0; i < 11; ++i) {
						l[i].printAll();
					}					
				}else if(getSearch.equalsIgnoreCase("PARKS")) {
					System.out.println("PARK ID  PARK NAME  PARK ADDRESS  PARK LATITIUDE  PARK LONGITUDE");
					for(int i = 0; i < 204; ++i) {
						p[i].printAll();
					}						
				}else if(getSearch.equalsIgnoreCase("POLICE STATIONS")) {
					System.out.println("POLICE STATION ID  POLICE STATION NAME  POLICE STATION ADDRESS  POLICE STATION LATITIUDE  POLICE STATION LONGITUDE");
					for(int i = 0; i < 7; ++i) {
						ps[i].printAll();
					}							
				}else if(getSearch.equalsIgnoreCase("SCHOOLS")) {
					System.out.println("SCHOOL ID  SCHOOL NAME  SCHOOL ADDRESS  SCHOOL BOARD  SCHOOL LATITIUDE  SCHOOL LONGITUDE");
					for(int i = 0; i < 83; ++i) {
						sh[i].printAll();
					}						
				}else {
					System.out.println("CATEGORY NOT FOUND");
				}
			}else if(getOption == 3) {
				// CONNECT IN NEXT PHASE
			}else if(getOption == 4) {
				// CONNECT IN NEXT PHASE
			}else if( getOption == 5){
				System.out.println("EXITING...");
			}else {
				System.out.println("INVALID INPUT");
			}
			
		}while(getOption != 5);
	}
	
	// readFile: reach each csv file based on category
	// Input: the category name
	// Output: store values in each category array
	public static void readFile(String category)
	{
		int n = 0; // counter
		
		// if Arenas
		if(category.equals("ARENAS")) {
			// file, line, split, and br for reading
	        String csvFile = "Arenas.csv";
	        String line = "";
	        String split = ",";
	        BufferedReader br = null;
	        
	        // table values
	        int id = 0;
	        String name = "";
	        String address = "";
	        float lat = 0;
	        float longi = 0;
	        
	        // read into an array then set to values and store in category array
	        int skip = 0;
	        try {
	        	br = new BufferedReader(new FileReader(csvFile));
	        	while((line=br.readLine()) != null) {
	        		if(skip == 0) {
	        			++skip;
	        			continue;
	        		}else {
	        			String[] data = line.split(split);
	        			id = Integer.parseInt(data[0]);
	        			name = data[1];
	        			address = data[2];
	        			lat = Float.parseFloat(data[3]);
	        			longi = Float.parseFloat(data[4]);
	        			
	        			a[n] = new Arena(n,name,address,lat,longi);
	        			++n;
	        		}
	        	}
	        }catch(IOException e) {
	        	e.printStackTrace();
	        }
	    // if Community Centre
		}else if(category.equals("COMMUNITY CENTRES")) {
			// file, line, split, and br for reading
	        String csvFile = "Community_Centres.csv";
	        String line = "";
	        String split = ",";
	        BufferedReader br = null;
	        
	        // table values
	        int id = 0;
	        String name = "";
	        String address = "";
	        float lat = 0;
	        float longi = 0;
	        
	     // read into an array then set to values and store in category array
	        int skip = 0;
	        try {
	        	br = new BufferedReader(new FileReader(csvFile));
	        	while((line=br.readLine()) != null) {
	        		if(skip == 0) {
	        			++skip;
	        			continue;
	        		}else {
	        			String[] data = line.split(split);
	        			id = Integer.parseInt(data[0]);
	        			address = data[1];
	        			name = data[2];
	        			lat = Float.parseFloat(data[3]);
	        			longi = Float.parseFloat(data[4]);
	        			
	        			c[n] = new CommunityCentre(n,name,address,lat,longi);
	        			++n;
	        		}
	        	}
	        }catch(IOException e) {
	        	e.printStackTrace();
	        }			
	    // if Fire Station
		}else if(category.equals("FIRE STATIONS")) {
			// file, line, split, and br for reading
	        String csvFile = "Fire_Stations.csv";
	        String line = "";
	        String split = ",";
	        BufferedReader br = null;
	        
	        // table values
	        int id = 0;
	        String address = "";
	        String fireHallNum = "";
	        float lat = 0;
	        float longi = 0;
	        
	        // read into an array then set to values and store in category array
	        int skip = 0;
	        try {
	        	br = new BufferedReader(new FileReader(csvFile));
	        	while((line=br.readLine()) != null) {
	        		if(skip == 0) {
	        			++skip;
	        			continue;
	        		}else {
	        			String[] data = line.split(split);
	        			id = Integer.parseInt(data[0]);
	        			address = data[1];
	        			fireHallNum = data[2];
	        			lat = Float.parseFloat(data[3]);
	        			longi = Float.parseFloat(data[4]);
	        			
	        			f[n] = new FireStation(n,address,fireHallNum,lat,longi);
	        			++n;
	        		}
	        	}
	        }catch(IOException e) {
	        	e.printStackTrace();
	        }	
	    // if Hospital
		}else if(category.equals("HOSPITALS")) {
			// file, line, split, and br for reading
	        String csvFile = "Hospitals.csv";
	        String line = "";
	        String split = ",";
	        BufferedReader br = null;
	        
	        // table values
	        int id = 0;
	        String name = "";
	        String address = "";
	        float lat = 0;
	        float longi = 0;
	        String hCode = "";
	        
	        // read into an array then set to values and store in category array
	        int skip = 0;
	        try {
	        	br = new BufferedReader(new FileReader(csvFile));
	        	while((line=br.readLine()) != null) {
	        		if(skip == 0) {
	        			++skip;
	        			continue;
	        		}else {
	        			String[] data = line.split(split);
	        			lat = Float.parseFloat(data[0]);
	        			longi = Float.parseFloat(data[1]);	        			
	        			id = Integer.parseInt(data[2]);
	        			name = data[3];
	        			address = data[4];
	        			hCode = data[5];
	        			
	        			h[n] = new Hospital(n,name,address,lat,longi,hCode);
	        			++n;
	        		}
	        	}
	        }catch(IOException e) {
	        	e.printStackTrace();
	        }	
	    // if Library
		}else if(category.equals("LIBRARIES")) {
			// file, line, split, and br for reading
	        String csvFile = "Libraries.csv";
	        String line = "";
	        String split = ",";
	        BufferedReader br = null;
	        
	        // table values
	        int id = 0;
	        String name = "";
	        String address = "";
	        String url = "";
	        float lat = 0;
	        float longi = 0;
	        
	        // read into an array then set to values and store in category array
	        int skip = 0;
	        try {
	        	br = new BufferedReader(new FileReader(csvFile));
	        	while((line=br.readLine()) != null) {
	        		if(skip == 0) {
	        			++skip;
	        			continue;
	        		}else {
	        			String[] data = line.split(split);
	        			lat = Float.parseFloat(data[0]);
	        			longi = Float.parseFloat(data[1]);	        			
	        			id = Integer.parseInt(data[2]);
	        			name = data[3];
	        			address = data[4];
	        			url = data[5];
	        			
	        			l[n] = new Library(n,name,address,url,lat,longi);
	        			++n;
	        		}
	        	}
	        }catch(IOException e) {
	        	e.printStackTrace();
	        }	
	    // if Park
		}else if(category.equals("PARKS")) {
			// file, line, split, and br for reading
	        String csvFile = "Park.csv";
	        String line = "";
	        String split = ",";
	        BufferedReader br = null;
	        
	        // table values
	        int id = 0;
	        String name = "";
	        String address = "";
	        float lat = 0;
	        float longi = 0;
	        
	         // read into an array then set to values and store in category array
	        int skip = 0;
	        try {
	        	br = new BufferedReader(new FileReader(csvFile));
	        	while((line=br.readLine()) != null) {
	        		if(skip == 0) {
	        			++skip;
	        			continue;
	        		}else {
	        			String[] data = line.split(split);
	        			lat = Float.parseFloat(data[0]);
	        			longi = Float.parseFloat(data[1]);	        			
	        			id = Integer.parseInt(data[2]);
	        			name = data[3];
	        			address = data[4];
	        			
	        			p[n] = new Park(n,name,address,lat,longi);
	        			++n;
	        		}
	        	}
	        }catch(IOException e) {
	        	e.printStackTrace();
	        }	
	    // if Police Station
		}else if(category.equals("POLICE STATIONS")) {
			// file, line, split, and br for reading
	        String csvFile = "Police.csv";
	        String line = "";
	        String split = ",";
	        BufferedReader br = null;
	        
	        // table values
	        int id = 0;
	        String name = "";
	        String address = "";
	        float lat = 0;
	        float longi = 0;
	        
	        // read into an array then set to values and store in category array
	        int skip = 0;
	        try {
	        	br = new BufferedReader(new FileReader(csvFile));
	        	while((line=br.readLine()) != null) {
	        		if(skip == 0) {
	        			++skip;
	        			continue;
	        		}else {
	        			String[] data = line.split(split);
	        			name = data[0];
	        			address = data[1];
	        			lat = Float.parseFloat(data[2]);
	        			longi = Float.parseFloat(data[3]);
	        			
	        			ps[n] = new PoliceStation(n,name,address,lat,longi);
	        			++n;
	        		}
	        	}
	        }catch(IOException e) {
	        	e.printStackTrace();
	        }	
	    // if School
		}else if(category.equals("SCHOOLS")) {
			// file, line, split, and br for reading
	        String csvFile = "Schools.csv";
	        String line = "";
	        String split = ",";
	        BufferedReader br = null;
	        
	        // table values
	        int id = 0;
	        String name = "";
	        String address = "";
	        String board = "";
	        float lat = 0;
	        float longi = 0;
	        
	        // read into an array then set to values and store in category array
	        int skip = 0;
	        try {
	        	br = new BufferedReader(new FileReader(csvFile));
	        	while((line=br.readLine()) != null) {
	        		if(skip == 0) {
	        			++skip;
	        			continue;
	        		}else {
	        			String[] data = line.split(split);
	        			lat = Float.parseFloat(data[0]);
	        			longi = Float.parseFloat(data[1]);	        			
	        			id = Integer.parseInt(data[2]);
	        			name = data[3];
	        			address = data[4];
	        			board = data[5];
	        			
	        			sh[n] = new School(n,name,address,board,lat,longi);
	        			++n;
	        		}
	        	}
	        }catch(IOException e) {
	        	e.printStackTrace();
	        }	
		}else {
			
		}
	}
}