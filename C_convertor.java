import java.util.*;
public class C_convertor
{
public void rupeesto(double amt,String ch)
{
double camt=0.0;
if(ch.equals("USD")){
camt=amt/83;
}
else if(ch.equals("EURO")){
camt=amt/89;
}
else if(ch.equals("JPY")){
camt=amt/0.55;
}
else{
System.out.println("Ivalid choice");
}
System.out.println(amt+" Rupees = "+camt+" "+ch);
}
public void dollarsto(double amt,String ch)
{
double camt=0.0;
if(ch.equals("INR")){
camt=amt*83.29;
}
else if(ch.equals("EURO")){
camt=amt*0.93;
}
else if(ch.equals("YEN")){
camt=amt*149.6;
}
else{
System.out.println("Ivalid choice");
}
System.out.println(amt+" U.S Dollars = "+camt+" "+ch);
}
public void euroto(double amt,String ch)
{
double camt=0.0;
if(ch.equals("INR")){
camt=amt*88.16;
}
else if(ch.equals("USD")){
camt=amt*1.058;
}
else if(ch.equals("JPY")){
camt=amt*160.195;
}
else{
System.out.println("Ivalid choice");
}
System.out.println(amt+" Euro = "+camt+" "+ch);
}
public void yento(double amt,String ch)
{
double camt;
if(ch.equals("INR")){
camt=amt/1.8;
}
else if(ch.equals("USD")){
camt=amt/149.6;
}
else if(ch.equals("EURO")){
camt=amt/160.8;
}
else{
System.out.println("Ivalid choice");
return;
}
System.out.println(amt+" Japanese Yen = "+camt+" "+ch);
}
public static void main(String[] args)
{
String ch;
double amt;
int ch1;
C_convertor cc=new C_convertor();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the base currency");
System.out.println("\nPress :\n1.Rupees\n2.US Dollars\n3.Euro\n4.Japanese Yen");
ch1=sc.nextInt();
sc.nextLine();
System.out.println("Enter the converted currency");
System.out.println("\nEnter:\nINR - Indian Rupees\nUSD - US Dollars\nEURO - Euro\nJPY - Japanese Yen");
ch=sc.nextLine();
System.out.println("Enter the amount to be converted");
amt=sc.nextDouble();
switch(ch1)
{
case 1:
cc.rupeesto(amt,ch);
break;
case 2:
cc.dollarsto(amt,ch);
break;
case 3:
cc.euroto(amt,ch);
break;
case 4:
cc.yento(amt,ch);
break;
default:
System.out.println("Invalid choice");
}
}
}



