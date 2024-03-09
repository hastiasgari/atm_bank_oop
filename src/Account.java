import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Account {
	//class variable 
	 int balance; 
	 int prevTransaction; 
	 String customerName; 
	 String customerID; 
	 //class constructor 
	 Account(String cname, String cid) { 
	   customerID = cid; 
	   customerName = cname; 
	    
	  } 
	  void deposit(int amount) { 
	   if (amount != 0 && amount > 0) { 
	    balance = balance + amount; 
	    prevTransaction = amount; 
	   } 
	  } 
	  void withdraw(int amount) { 
	   if(amount != 0) { 
	    balance = balance - amount; 
	    prevTransaction = - amount; 
	    
	   } 
	  } 
	  void getPrevTransaction() { 
	   if (prevTransaction > 0) { 
	    System.out.println("Deposited: " + prevTransaction); 
	     
	   }else if (prevTransaction < 0) { 
	    System.out.println("WithDraw: " + Math.abs(prevTransaction)); 
	   }else { 
	    System.out.println("No Transaction Occured!"); 
	   } 
	  } 
	  
	  void Date() {
		  var today =new Date();
		  SimpleDateFormat SDF = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		  System.out.println("Current Date: "+SDF.format(today));
	  }
	  
	  void showMenu() { 
	   char option = '\0'; 
	   Scanner Scanner = new Scanner(System.in); 
	   System.out.println("Welcome, " + customerName + "!"); 
	   System.out.println("your ID is; " + customerID + "!"); 
	   System.out.println(); 
	   System.out.println("What would you like to do? 👌😁 "); 
	   System.out.println(); 
	   System.out.println("A. Check Your Balance"); 
	   System.out.println("B. Make A Deposit"); 
	   System.out.println("C. Make A Withdraw"); 
	   System.out.println("D. View Previous Transaction"); 
	   System.out.println("E. View The Date Of Today"); 
	   System.out.println("F. Exit");
	   
	  do { 
	   System.out.println(); 
	   System.out.println("Please Enter an option: "); 
	   char option1 = Scanner.next().charAt(0); 
	   option = Character.toUpperCase(option1); 
	   System.out.println(); 
	   switch(option) { 
	   case 'A' : 
	    System.out.println("=================="); 
	    System.out.println("Balance = $" + balance); 
	    System.out.println("=================="); 
	    break; 
	   case 'B' : 
	    System.out.println("Enter an amount to deposit: "); 
	   int amount = Scanner.nextInt(); 
	   deposit(amount); 
	    break; 
	 
	   case 'C' : 
	    System.out.println("Enter an amount to withdraw: "); 
	   int amount2 = Scanner.nextInt(); 
	   withdraw(amount2); 
	    break; 
	   case 'D' : 
	    System.out.println("=========== "); 
	   getPrevTransaction(); 
	   System.out.println("=========== "); 
	    break; 
	   case 'E': 
	    Date();
	    break; 
	   case 'F':
		   System.out.println("===========");
	  default: 
	   System.out.println("Error: Invalid Option. Please Enter A,B,C, or D"); 
	   break; 
	 
	   } 
	  } 
	   while (option != 'E'); 
	   System.out.println("Thank You For Using Our ATM!😊");   
	   //Zahra Asgari
	  } 
	}


