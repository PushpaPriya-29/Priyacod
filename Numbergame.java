import java.util.*;
public class Numbergame
{
int i,nog=5,score;
char play;
public void numbergame()
{
Scanner sc = new Scanner(System.in);
for(play='y';play=='y' || play=='Y';)
{
int num;
int gen=1+(int)(100*Math.random());
System.out.println("Number generated between 1 to 100.\ntry to guess the number");
for(i=0;i<nog;i++)
{
System.out.println("Guess a number between 1 to 100");
num=sc.nextInt();
if(gen==num)
{
System.out.println("Well Done!! You guessed the number right");
break;
}
else if(num>gen && i!=nog-1)
{
System.out.println(num+" is greater than the number generated");
}
else
{
System.out.println(num+" is less than the number generated");
}
}
if(i==nog)
{
System.out.println("Trials Exhausted");
System.out.println("The number generated was : "+gen);
score=nog-i;
System.out.println("No. of attempts="+i+"\nScore="+score);
System.out.println("\nPlay again:Y or N?");
play=sc.next().charAt(0);
}
}
}
public static void main(String[]args)
{
Numbergame obj=new Numbergame();
obj.numbergame();
}
}
