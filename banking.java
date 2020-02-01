import java.util.Scanner;

public class banking
{
    String name;
    static int acno;
    int balance;
    int pin;
    public void create_account()
    {   Scanner input=new Scanner(System.in);
        System.out.println("Enter name");
        name=input.nextLine();
        System.out.println("Enter deposit ammount");
        balance=input.nextInt();
        System.out.println("Enter PIN");
        pin=input.nextInt();
        acno=acno++;
    }
    public void view_details()
    {   //System.out.println(pin);
        Scanner p=new Scanner(System.in);
        System.out.println("Enter pin: ");
        if(p.nextInt()==pin)
        {
            System.out.println("Account number: "+acno);
            System.out.println("Name: "+name);
            System.out.println("Available amount: "+balance);
        }
        else
            System.out.println("Wrong pin !");
    }
    public void deposit()
    {   Scanner p=new Scanner(System.in);
        System.out.println("Enter pin: ");
        if(p.nextInt()==pin)
        {
            System.out.println("Enter amount to deposit:" );
            Scanner input=new Scanner(System.in);
            balance=balance+input.nextInt();
            System.out.println("New balance: "+balance);
        }
        else
            System.out.println("Wrong pin !");
    }

    public void withdraw()
    {   Scanner p=new Scanner(System.in);
        System.out.println("Enter pin: ");
        if(p.nextInt()==pin)
        {
            System.out.println("Enter amount to withdraw:" );
            Scanner input=new Scanner(System.in);
            int with=input.nextInt();
            if(balance>=with)
            {
                balance=balance-with;
                System.out.println("New balance: "+balance);
            }
            else
                System.out.println("Insufficient balance !");
        }
        else
            System.out.println("Wrong pin !");

    }

    public static void main(String s[])
    {   boolean runing=true;
        banking b=new banking();
        while(runing)
        {
            System.out.println("Enter choice of task:");
            System.out.println(" 1: CREATE ACCOUNT");
            System.out.println(" 2: VIEW DETAILS");
            System.out.println(" 3: DEPOSIT");
            System.out.println(" 4: WITHDRAW");
            System.out.println(" 5: EXIT");
            Scanner i=new Scanner(System.in);
            int choice =i.nextInt();

            switch (choice)
            {
                case 1:
                    {b.create_account();
                    break;}
                case 2:
                    {b.view_details();
                    break;}
                case 3:
                    {b.deposit();
                    break;}
                case 4:
                    {b.withdraw();
                    break;}
                case 5:
                    {runing=false;
                    break;}
            }
        }
    }

}
