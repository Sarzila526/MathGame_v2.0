package classes;
import interfaces.*;
import java.util.Scanner;

public  class randomNumberGame 
{
    public randomNumberGame() 
	{
        Scanner reader = new Scanner(System.in);
        Boolean quit;
        quit= false;
        String name;
        Scanner inputName = new Scanner(System.in);
		System.out.println("======!    Welcome to Math Game    !=======");
        System.out.print("Enter your Name: ");
        name = inputName.nextLine();
	    {
        while (!quit)  
	    {
            showRHeader(name);
            showCalculation();
            System.out.print("Enter choice:");
            int choice = reader.nextInt();
            switch(choice)
			{
                case 1:
                    normalGame ngame = new normalGame(name);
                    break;
                case 2:
                    areaGame agame = new areaGame(name);
                    break;
                case 3:
                    ScoreData scoreData = new ScoreData();
                    scoreData.SaveScore(name);
                    break;
                case 4: 
                    ScoreData scoreData2 = new ScoreData();
                    scoreData2.showScore();
                    break;
                case 5:
                    quit = true;
					System.out.println("Thanks for playing!");
                    break;
                default:
                    System.err.println("Invalid selection!");
            }
        }
        }
    }
    public void showRHeader(String name) 
	{
        System.out.println("=========================");
		System.out.println("!     Hello,"+ name +"    !");
        System.out.println("!       Math Game       !");
        System.out.println("=========================");
    }
    public void showCalculation () 
	{
        System.out.println("1. Simple Calculation");
        System.out.println("2. Find Area of Shapes");
        System.out.println("3. Save Score");
        System.out.println("4. Read Score");
        System.out.println("5. Exit");
    }
}

