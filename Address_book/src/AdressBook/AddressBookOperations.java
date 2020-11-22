package AdressBook;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
//import Person;

//import new_address.Person;

public class AddressBookOperations  {
	ArrayList<Person> people = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		
		
	public void AddPerson() {
        System.out.println("Enter name: ");
        String name = in.nextLine();
        System.out.println("Enter phone number: ");
        String phnno = in.nextLine();
        System.out.println("Enter city: ");
        String city = in.nextLine();
        System.out.println("Enter pincode: ");
        String pincode = in.nextLine();
        Person person = new Person(name, phnno, city, pincode);
	        addToFile(person);
	        people.add(person);
	        System.out.println();
	}
	
    private static void addToFile(Person person) {
    	 try 
			{
				FileWriter fw=new FileWriter("AddressBook.txt",true);
				BufferedWriter bw=new BufferedWriter(fw);
				bw.write("Name:"+person.getName()+"   Phoneno:"+person.getPhnno()+"    City:"+person.getCity()+"     PinCode:"+person.getPincode());
				bw.newLine(); bw.close(); 
				}
    	 
			catch(Exception e)
			{
				//e.printStackTrace();
				System.out.println("error"+e.getMessage());
				}
}
	public void Display()
	{ 
		
		try{
			FileReader fr= new FileReader("AddressBook.txt");
			BufferedReader br = new BufferedReader(fr); 
			  String name; 
			  while ((name = br.readLine()) != null) 
			   System.out.println(name); 
			// String name ;
	         //   while((name = br.readLine()) != null) {
	              Person person = new Person(name, br.readLine(), br.readLine(), br.readLine());
	                people.add(person);        //adds person to the list
	                br.readLine();   
		
		}
	
        catch ( IOException e) {
            System.out.println(e);
        }
	}
	
	 public void findByName() {
		 Display();
	        System.out.print("Enter surname: ");
	        String surnameToFind = in.nextLine();
	        int matches = 0;
	        for(Person person : people) {           
	            if(person.getName().equals(surnameToFind)) {
	                System.out.println(person);
	                matches++;
	            }
	        }
	         if(matches<=0) {
	            System.out.println("There is no person with this surname");
	        }
	    }
public void DelPerson()
{
	/*  System.out.print("Enter name: ");
      String name = in.nextLine();
      int matches = 0;
      for(Person person : people) {           
          if(person.getName().equals(name)) {
        	  System.out.println(person);
              matches++;
          }
      }
       if(matches<=0) {
          System.out.println("There is no person with this name");
      }*/
	  System.out.print("Enter surname: ");
      String surnameToFind = in.nextLine();
      int matches = 0;
      for(Person person : people) {           
          if(person.getName().equals(surnameToFind)) {
              System.out.println(person);
              matches++;
          }
      }
       if(matches<=0) {
          System.out.println("There is no person with this surname");
      }
  }

}
