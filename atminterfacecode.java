import java.util.*;
public class atminterfacecode{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO SBI BANK ATM:");
        System.out.println();
        System.out.println("FACILITIES WE CAN PROVIDE YOU::");
        System.out.println(" 1.CASH WITHDRAWAL    2.DEPOSIT CASH  3.CHECK BALANCE ");

        BankAccount b=new BankAccount();
        Atm a=new Atm();
        
        if(a.isVerified(b.mpin)==true){
            System.out.print("Press Button::");
            System.out.println();
      
        int variable=sc.nextInt();
        switch (variable) {
            case 1:a.withdrawal(b.balance);
                   break;
             case 2:a.deposit(b.balance);  
                   break;
             case 3:a.checkbalance(b.balance); 
                   break;   
            default:System.out.println("INVALID INPUT??");
                //throw new AssertionError();
        }
    }
        else
        {
            System.out.println("Wrong Pin Enter");
        }
  }
}


class BankAccount{
 Scanner sc=new Scanner(System.in);
    protected String bankingName="SARTHAK RAUT";
     private   int AccountNumber=4052450;
    protected  int balance=1000;
      protected int mpin=102030;

}

class Atm extends BankAccount{

    int amount;
    int mpinU;

    boolean isVerified(int mpin){
      System.out.print("Enter m_pin::");
      mpinU=sc.nextInt();

      if(mpin==mpinU){
        System.out.println(bankingName);
        return true;
      }
       else
      {
        return false;
      }

    }
  
        void withdrawal(int balance){
       
          System.out.println("Enter AmountTo Withdraw ::");
           amount=sc.nextInt();
           if(amount>balance){
            System.out.println(" INSUFFICIENT BALANCE???");
           }
           else{
            System.out.println("Succesful Transaction Done");
            System.out.println("Debited amount::Rs."+amount);
            System.out.println("Current Amount::Rs."+(balance-amount));

           }
    }

         void deposit(int balance){
         System.out.println("Enter Amount to be deposited::");
         amount=sc.nextInt();
         System.out.println("Credited::Rs."+amount);
         System.out.println("Current Balance::"+(balance+amount));

    }

         void checkbalance(int balance){
        System.out.println("Current balance Rs.::"+balance);

    }
      

}



