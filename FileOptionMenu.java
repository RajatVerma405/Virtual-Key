package VirtualKey;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOptionMenu 
{
	
		static Directory dir = new Directory();

		static ArrayList<String> option1 = new ArrayList<>();
	   
		public static void Select() 
		{   
				option1.add("1. Add a File");
				option1.add("2. Delete A File");
				option1.add("3. Search A File");
				option1.add("4. Return to Menu");
	    }
	    public static void Show1() 
	    {
	    	System.out.println("-----------------------------------");
	    	System.out.println("		File Options Menu          ");
	    	System.out.println("-----------------------------------");
	    	for (String s : option1)  
	        {
	    		 
	    		System.out.println(s);
	    		
	        }
	    	option1.clear();
	    }
	    public static void GetUserInput1() 
		{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int m2 = 0 ;
		//while(m2!=5)
		while(true)	
		{
				m2=in.nextInt();
		    
	    	switch(m2) 
	    	{
	            case 1: // Add File
	                AddFile();
	                Select();
	                Show1();
	                
	                System.out.println("-----------------------------------");
	                System.out.println("Enter your input:");
	                GetUserInput1();
	                
	                break;
	            case 2: // Delete File
	                DeleteFile();
	                Select();
	                Show1();
	                System.out.println("-----------------------------------");
	                System.out.println("Enter your input:");
	                GetUserInput1();
	                break;
	            case 3: // Search File
	               SearchFile();
	               Select(); 
	               Show1();
	               System.out.println("-----------------------------------");
	                System.out.println("Enter your input:");
	                GetUserInput1();
	                break;

	                
	            case 4: // Return to Menu
	            	
	            	WelcomeClass.Show();
	            	 System.out.println("-----------------------------------");
		                System.out.println("Enter your input:");
	                WelcomeClass.GetUserInput();
	                break;  
	            default:
	                System.out.println("Invalid Option");
	                break;   
	        }

		}
	}
	    public static void AddFile()  {
	        System.out.println("Please Enter the Filename:");
	        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	        String fileName ;
			try 
			{
				fileName = br.readLine();
				System.out.println("You are adding a file named: " + fileName);
			//Path path = FileSystems.getDefault().getPath(Directory.name + fileName).toAbsolutePath();
				File file = new File(dir.getName() + fileName);
				
			      if (file.createNewFile()) {
			    	  System.out.println("File created: " + file.getName());
			    	  dir.getFiles().add(file);
			    	  
			      } else 
			      {
			        System.out.println("This File Already Exits, no need to add another");
			      }
			}catch (IOException e){
				System.out.println(e);
			}
		}
	    public static void DeleteFile() {
	    	
	    	System.out.println("Please Enter the Filename you want to delete:");
	    	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	    	String fileName;
			try {
				fileName = br.readLine();
			
	        System.out.println("You are deleting a file named: " + fileName);
	        
	        
		    //TODO: Delete file
	        // Finished TODO
	        
			Path path = FileSystems.getDefault().getPath(Directory.name + fileName).toAbsolutePath();
			File file = path.toFile();
		      if (file.delete()) {
		    	  System.out.println("Deleted File: " + file.getName());
		    	  dir.getFiles().remove(file);
		      } else {
		        System.out.println("Failed to delete file:" + fileName);
		        System.out.println("Failed to delete file:" + fileName + ", file was not found.");
		      }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	    public static void SearchFile() {
	    	
	    	Boolean found = false;
	    	
	    	System.out.println("Please Enter the Filename you want to search:");
	    	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	    	String fileName;
			try {
				fileName = br.readLine();
			
	        System.out.println("You are searching for a file named: " + fileName);
	        
	        //TODO Fix it so ArrayList obtains files
	        //Finished TODO

	        ArrayList<File> files = dir.getFiles();


	        for(int i = 0; i < files.size(); i++) {
				if(files.get(i).getName().equals(fileName)) {
					System.out.println("Found " + fileName);
					found = true;
				}
	        }
	        if (found == false) 
	        {
	        	System.out.println("File not found");
	        }
	    }
			 catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    }

}

