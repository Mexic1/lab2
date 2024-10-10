package ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args)
            throws IOException {

        //citire din fisier
        Scanner n = new Scanner(new FileInputStream("F:\\IS Anul 3\\Semestrul 1\\PJ\\lab2\\src\\ex2\\in.txt"));
        ArrayList<String> versList = new ArrayList<>();

        while(n.hasNext()) {
            versList.add(n.nextLine());
        }

        //convert ArrayList to Array
        String[] vers = versList.toArray(new String[0]);

        //number of words in a verse + number of vowels in a verse
        int[] words = new int[vers.length];
        int[] vocale = new int[100];
        for (int i = 0; i < vers.length; i++) {
            words[i] = vers[i].split("\\s+").length;
            vocale[i] = vers[i].split("[aeiouAEIOU]").length;
        }


        //write in out.txt
        FileWriter fw=new FileWriter("F:\\IS Anul 3\\Semestrul 1\\PJ\\lab2\\src\\ex2\\out.txt");
        for (int i = 0; i < vers.length; i++)
        {
            double random = Math.random();
            if(random < 0.1)
            {
                fw.write(vers[i].toUpperCase()+" "+words[i]+" "+vocale[i]);
                fw.write("\n");
            }
            else
            {
                fw.write(vers[i]+" "+words[i]+" "+vocale[i]);
                fw.write("\n");
            }
        }
        fw.close();

    }
}
