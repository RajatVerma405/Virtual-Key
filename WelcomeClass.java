package VirtualKey;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
public class WelcomeClass 
{
	
	public static String welcomeText;
	public static String developerText;	
	
	static ArrayList<String> option = new ArrayList<>();
	public static void Welcome() throws IOException 
	{	
		System.out.println("Welcome to virtual Key Project");
		welcomeText =  "Rajat Verma";
		System.out.println("Developer Name is:"+"\n"+welcomeText);
		
		developerText = "Full Stack Java Developer";
		System.out.println("Designation:"+"\n"+developerText);
	}
	
	public static void selection()  
	{
		option.add("1. Show Sorted Files");
        option.add("2. File Operations Menu");
        option.add("3. Quit");
        
        Show();
        System.out.println("-----------------------------------");
        System.out.println("Enter your input:");
    }
	public static void Show() 
	{
	    	System.out.println("-----------------------------------");
			System.out.println("            Main Menu              ");
			System.out.println("-----------------------------------");
	        for (String s : option)  
	        {
	            System.out.println(s);
	        }
	        
	}
	public static void ShowFiles() 
	{
        System.out.println("List of Files: ");
    	Directory1.Directory();
    }
	public static void GetUserInput() 
	{
	//BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	int m1 = 0;
	while(true)
		{
			m1=in.nextInt();
		
			switch(m1) 
			{
	            case 1: // Show Files in Directory
	               System.out.println("You selected show files");
	            	ShowFiles();
	            	Show();
	            	System.out.println("-----------------------------------");
	                System.out.println("Enter your input:");
	                GetUserInput();
	                break;
	                
	            case 2: // Show File Options menu
	            	FileOptionMenu.Select(); 
	            	FileOptionMenu.Show1();
	            	
	            	System.out.println("-----------------------------------");
	                System.out.println("Enter your input:");
	                FileOptionMenu.GetUserInput1();
	                break;
	            case 3:
	            	//Show();
	            	//System.out.println("-----------------------------------");
	                //System.out.println("Enter your input:");
	            	//GetUserInput();
	            	System.out.println("Exit program");
	            	exit(0);
	            	break;
	            default:
	                System.out.println("Invalid Option");
	                break;
	        }
		}
	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		return;
	}
}
