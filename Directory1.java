package VirtualKey;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;
//import java.util.Scanner;

public class Directory1 {
	private static final String name = null;

	public static void Directory() 
	
		{
            //@SuppressWarnings("resource")
			//Scanner scanner = new Scanner( System.in );
            //System.out.println("Enter the directory path: ");
            String name = "E:\\eclipse-workspace\\JavaProject\\bin\\VirtualKey"; // Takes the directory path as the user input
            File folder = new File(name);
            if(folder.isDirectory())
            {
                File[] fileList = folder.listFiles();

                Arrays.sort(fileList);

                System.out.println("\nTotal number of items present in the directory: " + fileList.length );


                // Lists only files since we have applied file filter
                System.out.println("-------------------Sorted files--------------------");
                for(File file:fileList)
                {
                	
                	System.out.println(file.getName());
                }

                // Creating a filter to return only files.
                FileFilter fileFilter = new FileFilter()
                {
                    @Override
                    public boolean accept(File file) {
                        return !file.isDirectory();
                    }
                };

                fileList = folder.listFiles(fileFilter);

                // Sort files by name
                Arrays.sort(fileList, new Comparator<Object>()
                {
                    @Override
                    public int compare(Object f1, Object f2) {
                        return ((File) f1).getName().compareTo(((File) f2).getName());
                    }
                });

                //Prints the files in file name ascending order
                System.out.println("-----------------Unsorted files------------------");
                
                for(File file:fileList)
                {
                  
                	System.out.println(file.getName());
                }

            }   
        }

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
