package AdressBook;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
import java.util.Vector;

public class AddressBook extends AddressBookOperations {
	Vector a=new Vector(); 
	//Person p=new Person();
	AddressBookOperations abo =new AddressBookOperations();
	int size=0;
public void AddressBookOperations() {
	  menuloop:
	    	while(true) {
	int options;
    Scanner console = new Scanner(System.in);
    System.out.print("Enter\n1.Add content to Adress Book \n2.Update\n3.Display Address Book content:\n4.Delete \n5.SORT:by name\n6.SORT:by zip code \n");
    options = console.nextInt();
   // System.out.println(size);
    if (options ==1) {
     	size ++;
     }
    switch(options)
    {
    case 1 :
        System.out.println("Add Details to Address Book\t");
       AddPerson();
        break;
     case 2 :
        System.out.println("Update Person to Address Book\t");
       // UpdatePerson();
        break;
     case 3 :
         System.out.println("Display Address Book:\t");
        	 Display();
         break;

     case 4 :
        System.out.println("Delete Person from Address Book");
       // DelPerson();
        findByName();
        break;
/*
     case 5 :
        System.out.println("Thursday");

        break;

     case 6 :
        System.out.println("Friday");

        break;

     case 7 :
        System.out.println("Saturday");

        break;
*/
     default :
        System.out.println("Invalid input");
        break menuloop;
    }
    	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		AddressBook ab= new AddressBook();
		ab.AddressBookOperations();
		
		
	}
	
}

