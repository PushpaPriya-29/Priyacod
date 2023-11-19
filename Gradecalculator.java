import java.util.*;
public class Gradecalculator
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no. of subjects");
int n =sc.nextInt();
int[] marks =new int[n];
for(int i=0;i<n;i++)
{
System.out.println("marks of subject "+(i+1)+"=");
marks[i]=sc.nextInt();
}
int total=0;
for(int i=0;i<n;i++)
{
total=total+marks[i];
}
float avg=(float)total/n;
if(avg>90 && avg<=100)
System.out.println("Grade:O");
else if(avg>80 && avg<=90) 
System.out.println("Grade:A+");
else if(avg>70 && avg<=80) 
System.out.println("Grade:A");
else if(avg>60 && avg<=70) 
System.out.println("Grade:B");
else if(avg>60 && avg<=50) 
System.out.println("Grade:c");
else if(avg>40 && avg<=50) 
System.out.println("Grade:D");
else{ 
System.out.println("Fail");
}
System.out.println("Total marks : "+total);
System.out.println("Average percentage : "+avg);
}
}
