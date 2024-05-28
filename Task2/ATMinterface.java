// ATM INTERFACE
    import java.util.Scanner;  
      
    public class ATM_Machine  
    {  
         
        public static void main(String args[] )  
        {  
           
            int total_balance = 7460000, withdraw, account_num, mony_transfer, deposit;  
              
          
            Scanner sc = new Scanner(System.in);  
              
    System.out.println("Enter Login ID and Password");
    string the_id = sc.nextInt();
    System.out.println("\n");
   int pssword = sc.nextInt();

if(pssword==012345)
                System.out.println("ATM MACHINE");

  System.out.println("\n");
                System.out.println("Select Option 1 for WITHDRAW MONEY");  
                System.out.println("Select Option 2 for DEPOSIT AMOUNT");  
                System.out.println("Select Option 3 for BALANCE CHECKING");  
                System.out.println("Select Option 4 for MONEY TRANSFER");  
                System.out.println("Select Option 5 for EXIT");  

                System.out.print("Enter your Choice:  ");  
                  
                
                int choice = sc.nextInt();  
                switch(choice)  
                {  
                    case 1:  
            System.out.print("Enter amount to withdraw:  ");  
                          
            
            withdraw = sc.nextInt();  
                          
        
            if(total_balance >= withdraw)  
            {  
               
                total_balance = total_balance - withdraw;  
                System.out.println("Collect money");  
                System.out.println("Thanks");
            }  
            else  
            {  
                
                System.out.println("Insufficient Balance in you account");  
            }  
            System.out.println("");  
            break;  
       
                    case 2:  
                          
            System.out.print("Enter the money to deposit:  ");  
                          
            
            deposit = sc.nextInt();  
                          
            
            total_balance = total_balance + deposit;  
            System.out.println("Your Money has been successfully deposited"); 
             System.out.println("Your current balance is:  "+total_balance);
            System.out.println(" Thanks");
            System.out.println("");
            break;  
       
                    case 3:  
            
            System.out.println("Your balance in account is: "+total_balance);  
            System.out.println("");  
            break;  

case 4:  
            
            System.out.println("Enter Bank account");  
            account_num = sc.nextInt();  
System.out.println("Enter amount"); 
             mony_transfer  = sc.nextInt();


            System.out.println("");  
            break;


       
                    case 5:  
            //exit 
            System.exit(0);  
                } 
       else
          System.out.println("Incorrect ID and Password");  
          
          }    
    }
