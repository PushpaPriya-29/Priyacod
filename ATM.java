import java.util.Scanner;
class ATM 
{
private BankAccount acc;
public ATM(BankAccount acc) 
{
this.acc=acc;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter your initial balance: ");
int bal=sc.nextInt();
BankAccount acc = new BankAccount(bal);
ATM atm=new ATM(acc);
while(true) 
{
System.out.println("\nWelcome to ATM.Press\n1. Deposit\n2. Withdraw\n3. Check balance\n4. Exit");
int ch=sc.nextInt();
if(ch==1) 
{
System.out.print("Enter the amount to deposit: ");
int amt = sc.nextInt();
acc.deposit(amt);
} 
else if(ch==2) 
{
System.out.print("Enter the amount to withdraw: ");
int amt = sc.nextInt();
acc.withdraw(amt);
} 
else if(ch==3) 
{
System.out.println("Balance:"+acc.checkBalance());
} 
else if(ch==4) 
{
break;
} 
else 
{
System.out.println("Invalid choice");
}
}
sc.close();
}
}
class BankAccount 
{
private int bal;
public BankAccount(int bal) 
{
this.bal=bal;
}
public void deposit(int amt) 
{
if(amt>0) 
{
bal=bal+amt;
System.out.printf(amt+" Deposited succesfully");
} 
else 
{
System.out.println("Invalid amount");
}
}
public void withdraw(int amt) 
{
if(amt>0 && amt<=bal) 
{
bal=bal-amt;
System.out.printf("Withdrawal of "+amt+" successful");
} 
else 
{
System.out.println("Insufficient funds");
}
}
public double checkBalance() 
{
return bal;
}
}



