package Day8;
import java.util.Scanner;

public class ATM_Machine {
    public static void lines(){
        System.out.println("-----------------------");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to BA's ATM");
        lines();
        Scanner sc = new Scanner(System.in);
        int pin_Number = 1234;     
        float Account_Balance = 5000f;                  // default comparsion 
        for (int attempt = 3 ;attempt>0; --attempt)
        {
        int pin = sc.nextInt();                     // getting from user
        if(pin == pin_Number)
        {
            System.out.println("Welcome user");
            lines();
            for (int x =1;x==1;){
            System.out.println("1. Credit\n2. Debit\n3. Check Balance\n4. Change PIN Number\n0. Exit");
            lines();
            int choice = sc.nextInt();
            lines();
            switch(choice)
            {
                case 1: 
                {
                    System.out.println("Enter the amount to be credited :");
                    int amount = sc.nextInt();
                    lines();
                    Account_Balance =  Account_Balance + amount;
                    System.out.printf("Amount added: %.2f\n",Account_Balance);
                    lines();
                    break;
                }
                case 2: 
                {
                System.out.println("Enter the amount to be debited :");
                int amount = sc.nextInt(); // reading from the user
                lines();
                if(amount <= Account_Balance)
                {
                    Account_Balance =  Account_Balance - amount;
                    System.out.printf("Current Balance : %.2f\n",Account_Balance);
                    lines();
                }
                else 
                {
                System.out.println("Insufficient Balance");
                lines();
            }
            break;
                }
                case 3:
                {
                    System.out.printf("Current Balance %2f\n ",Account_Balance);
                    lines();
                    break;
                }
                case 4 :
                {
                    System.out.println("Enter the current PIN Number :");
                   int  cur_pin = sc.nextInt();
                    
                    if(cur_pin == pin_Number){
                        System.out.println("Enter the new pin :");
                        int New_PIN = sc.nextInt();
                        lines();
                        System.out.println("New PIN_Number : " +New_PIN);
                        lines();
                        pin_Number = New_PIN;
                        System.out.println("New pin generated successfully");
                        lines();
                    }else{
                        System.out.println("Entered pin is wrong");
                        lines();
                    }
                    break;
                }
                case 0 :
                {
                    x=0;
                    System.out.println("Exited Successfully");
                    lines();
                    break;
                }
            }
        }
        break;   // breaks entire loop
        }else{
        
            System.out.println("Enter the correct PIN Number only " + (attempt-1) +((attempt>2)?" attempts left":" attempt left" ));
            lines();
        }
        
        }
    }
}