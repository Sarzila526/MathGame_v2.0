package classes;
import interfaces.*;
import java.util.Random;
import java.util.Scanner;

public class areaGame extends ScoreData implements areaGaming
{
    String name;
	areaGame(String name) 
	{   
        this.name = name;
        calculateMyProgram2();
    }
    public void showHeader() 
	{
        System.out.println("=========================");
		System.out.println("!     Hello,"+ name +"    !");
        System.out.println("!        Area Game      !");
        System.out.println("=========================");
    }
    public void showAreaCalculation () 
	{
        System.out.println("[1] Circle");
        System.out.println("[2] Triangle");
        System.out.println("[3] Rectangle");
        System.out.println("[4] Square");
        System.out.println("[5] Cube");
        System.out.println("[0] Back");
        System.out.println("===================");
        System.out.println("\nScore["+ Score+"]");
    }
    public void calculateMyProgram2() 
	{
        Scanner input = new Scanner(System.in);
        int select = -1;
        Boolean valid = false ;
        while (!valid) 
		{
            showHeader();
            showAreaCalculation();
            System.out.print("Enter choice:");
            select = Integer.parseInt(input.nextLine());
            Random random = new Random();
            int x = random.nextInt(20);
            int y = random.nextInt(30);
            switch (select) 
			{
                case 1:
                    circle(x);
                    break;
                case 2:
                    triangle(x,y);
                    break;
                case 3:
                    rectangle(x,y);
                    break;
                case 4:
                    square(x);
                    break;
				case 5:
                    cube(x);
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
	
    public void circle(int x) 
	{
        double cir;
		double pi,result;
        System.out.print("What is the area of a circle with radius of "+ x +" units ? ");
        result = Double.parseDouble(cin.nextLine());
		pi = 3.14159;
		cir = (double)pi*x*x;
        if(cir == result) 
		{
            System.out.println("Correct!");
            Score++;
        }
        else  
		{
            System.err.println("Incorrect!");
			System.out.println("The right answer is: "+ cir +" square units. ");  
        }
    }
	
    public void triangle(int x, int y) 
	{
        double tri;
		double result;
        System.out.println("What is the area of a triangle with height of "+ x +" units & base of "+ y +" units ?");
        result = Double.parseDouble(cin.nextLine());
		tri = (double)(x*y)/2;
        if(tri == result) 
		{
            System.out.println("Correct!");
            Score++;
        }
        else  
		{
            System.err.println("Incorrect!");
			System.out.println("The right answer is: "+ tri +" square units. ");  
        }
    }
	
    public void rectangle(int x, int y) 
	{
        double rec;
		double result;
        System.out.println("What is the area of a rectangle with height of "+ x +" units & width of "+ y +" units ?");
        result = Double.parseDouble(cin.nextLine());
		rec = (double)x*y;
        if(rec == result) 
		{
            System.out.println("Correct!");
			Score++;
        }
        else  
		{
            System.err.println("Incorrect!");
			System.out.println("The right answer is: "+ rec +" square units. ");  
        }
    }
	
     public void square(int x) 
	{
        double squ;
		double result;
        System.out.println("What is the area of a square with length of "+ x +" units ?");
        result = Double.parseDouble(cin.nextLine());
		squ = (double)x*x;
        if(squ == result) 
		{
            System.out.println("Correct!");
			Score++;
        }
        else  
		{
            System.err.println("Incorrect!");
			System.out.println("The right answer is: "+ squ +" square units. ");  
        }
    }
	
	 public void cube(int x) 
	{
        double cub,vCub;
		double result, vResult;
        System.out.println("What is the area & volumn of a (a*a*a)cube with length of "+ x +" units ?");
		System.out.println("Area :");
        result = Double.parseDouble(cin.nextLine());
		cub = (double)6*x*x;
		{
			if(cub == result) 
		{
            System.out.println("Correct!");
			Score++;
        }
        else  
		{
            System.err.println("Incorrect!");
			System.out.println("The right answer is: "+ cub +" square units. ");  
        }
		}
		System.out.println("Volumn :");
		vResult = Double.parseDouble(cin.nextLine());
		vCub = (double)(x*x*x);
		{
	        if(vCub == vResult) 
		{
            System.out.println("Correct!");
			Score++;
        }
        else  
		{
            System.err.println("Incorrect!");
			System.out.println("The right answer is: "+ vCub +" cubic units. ");  
        }
		}   
    }
}
