package bank_management_system;
import java.util.*;
public class MainBankingSystem {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		final int PIN=3737;
		int attempts=3;
		
		System.out.println("Welcome to the banking System");
		
		while(attempts>0)
		{
			System.out.println("Enter your a-Digit pin");
			int enterpin=in.nextInt();
			if(enterpin==PIN)
			{
				System.out.println("PIN is verified successfull\n");
				break;
			}
			else
			{
				attempts--;
				if(attempts>0)
				{
					System.out.println("Incorrect pin");
				}
				else
				{
					System.out.println("Too many failed attempts Account locked.");	
				}
				return;
			}
	     	}
	
	     //ACCOUNT CREATION
	in.nextLine();
	System.out.println("Enter your name");
	String name=in.nextLine();
	BankAccount a=new BankAccount(name);
	
	
	     //BANKING MENU
	  boolean exit = false;
      while (!exit) {
          System.out.println("\nWelcome " + name + "! Please choose an option:");
          System.out.println("1. Deposit Money");
          System.out.println("2. Withdraw Money");
          System.out.println("3. Check Balance");
          System.out.println("4. View Transaction History");
          System.out.println("5. Exit");
          System.out.print("Enter your choice: ");
          
          int choice=in.nextInt();
          switch(choice)
          {
          case 1:
          System.out.println("Enter the Amount to be depositted: ");
          double d=in.nextDouble();
          a.deposit(d);
          break;
        	  
          case 2:
          System.out.println("Enter the Amount to withdraw");
          double w=in.nextDouble();
          a.withdraw(w);
          break;
          
          case 3:
          a.balance();
          break;
          
          case 4:
          a.transactionhistory();
          break;
          
          case 5:
          exit=true;
          System.out.println("Thank you");
          break;
          
          default:
          System.out.println("Invalid choice.Please try again");
          }
          }
	      }
          }
        
       
	
	
	   
	

          
