package classes;
import interfaces.*;
import java.io.*;

public class ScoreData 
{
    public static int Score;
    String name;
    ScoreData() 
	{
        File file = new File("Score.txt");
    }

    void SaveScore(String name) 
	{
        File file = new File("Score.txt");
        FileWriter fw;
        try 
		{
            fw = new FileWriter(file, true);
            fw.write("\nName:" + name + "\nScore:" + Score);
            System.out.println("Name: " + name + " Score: " + Score + " has been saved!");
			fw.flush();
            fw.close();
        }
		catch (IOException e) 
		{
            e.printStackTrace();
        }
    }

    void showScore() 
	{
        File file = new File("Score.txt");
        FileReader fr;
        String data;
        try 
		{
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while ((data = br.readLine()) != null) 
			{
                System.out.println(data);
            }
        } 
		catch (FileNotFoundException e) 
		{
            e.printStackTrace();
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        }
    }
}
