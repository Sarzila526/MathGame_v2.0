package classes;
import interfaces.*;
import java.util.Random;
import java.util.Scanner;

public class normalGame extends ScoreData implements normalGaming
{
    String name;
    normalGame(String name) 
	{
       this.name = name;
       calculateMyProgram();
    }
    public void showHeader(String name) 
	{
        System.out.println("=========================");
		System.out.println("!     Hello,"+ name +"    !");
        System.out.println("!      Normal Game      !");
        System.out.println("=========================");
    }
    public void showSimpleCalculation () 
	{
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Back");
        System.out.println("=================");
        System.out.println("\nScore["+ Score+"]");
    }
    public void calculateMyProgram() 
	{
        Scanner input = new Scanner(System.in);
        int select = -1;
        Boolean valid = false ;
        while (!valid) 
		{
            showHeader(name);
            showSimpleCalculation();
            System.out.print("Enter choice:");
            select = Integer.parseInt(input.nextLine());
            Random random = new Random();
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            switch (select) 
			{
                case 1:
                    addition(a,b);
                    break;
                case 2:
                    subtraction(a,b);
                    break;
                case 3:
                    multiplication(a,b);
                    break;
                case 4:
                    division(a,b);
                    break;
                case 0:
                    valid = true;
                    break;
                default:
                    System.err.println("Not a valid option");
            }
        }
    }
    Scanner cin = new Scanner(System.in);
	
    public void addition(int a, int b) 
	{
        double add;
		double result;
        System.out.println("What is the addition of " + a  + " and " + b +" ?");
        result = Double.parseDouble(cin.nextLine());
		add =(double)a+b;
        if(add == result)
		{
            System.out.println("Correct!");
            Score++;
        }
        else  
		{
            System.err.println("Incorrect!");
			System.out.println("The right answer is: "+ add +".");  
        }
    }
    public void subtraction(int a, int b) 
	{
        double sub;
	    double result;
        System.out.println("What is the subtraction of " + a  + " and " + b +" ?");
        result = Double.parseDouble(cin.nextLine());
	    sub =(double)a-b;
        if(sub == result)
	    {
            System.out.println("Correct!");
            Score++;
        }
        else  
	    {
            System.err.println("Incorrect!");
			System.out.println("The right answer is: "+ sub +".");  
        }
    }
    public void multiplication(int a, int b) 
	{
        double mult;
		double result;
        System.out.println("What is the multiplication of " + a  + " and " + b +" ?");
        result = Double.parseDouble(cin.nextLine());
		mult = (double)a*b;
        if(mult == result)
		{
            System.out.println("Correct!");
            Score++;
        }
        else  
		{
            System.err.println("Incorrect!");
			System.out.println("The right answer is: "+ mult +".");  
        }
    }
    public void division(int a, int b) 
	{
		double div;
        double result;
        System.out.println("What is the division of " + a  + " and " + b +" ?");
        result = Double.parseDouble(cin.nextLine());
		div =(double)a/b;
        if(div == result) 
		{
            System.out.println("Correct!");
            Score++;
        }
        else  
		{
            System.err.println("Incorrect!");
			System.out.println("The right answer is: "+ div +".");  
        }
    }
}