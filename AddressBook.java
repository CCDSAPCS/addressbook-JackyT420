import java.io.*;
import java.util.Scanner;

public class AddressBook {

    private Contact[] friends; // An array of Contacts - each stores info for one friend
    private int numfriends; // Number of friends currently in AddressBook

    // Create an empty AddressBook
    public AddressBook() {
		friends = new Contact[10];
		numfriends = 0;
	    
 public void addContact(Contact c){
	friend[numfriends]=c;
		numfriends++;
		}
		
		
	public void printContacts90{
		for(int i=0; i,numfriends; i++)
			friends[i].printContact90;
		}
		
	public int numContacts(){
		return numfriends;
		}
		
		
	public int haveContacts(String s){
		for (int i =0; i< numfriends; i++)
		if (friends[i].getName().equals(s);{
		    return i;}
		    else {
		    return -1;
		    }
    
			    }
public static void menu(){
	system.out.println("1. add a contact");
	system.out.println("2. delete a contact");
	system.out.println("3. print the number of contacts you have");
	system.out.println("4. print out all contact info");
	system.out.println("5. quit");
	
	
 public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String choice = s.next();
       AddressBook book = new AddressBook();
        if(choice == "1"){
		
            System.out.println("Imput name:");
            String name = s.next();
            System.out.println("Imput age: ");
            int age = s.nextInt();
            System.out.println("Imput phone number(no dashes)");
            int number = s.nextInt();
            System.out.println("Imput Birthday");
            int bday = s.nextInt();
          
            Contact c = new Contact(name, age, number, bday);
            book.addContact(c);
        }
