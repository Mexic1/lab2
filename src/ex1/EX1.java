package ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        try {

            String nume_fis = "C:\\Users\\cmora\\Desktop\\Faculta\\Anul3\\Sem1\\PJ\\lab2\\src\\ex1\\judetein.txt";
            BufferedReader flux_in = new BufferedReader(new InputStreamReader(new FileInputStream(nume_fis)));

            // Read all lines into an ArrayList
            ArrayList<String> judeteList = new ArrayList<>();
            String line;
            while ((line = flux_in.readLine()) != null) {
                judeteList.add(line);
            }
            flux_in.close();

            // Convert ArrayList to array
            String[] judete = judeteList.toArray(new String[0]);

            // Sortăm tabloul de județe
            Arrays.sort(judete);

            // Citim un județ de la tastatură
            Scanner inputScanner = new Scanner(System.in);
            System.out.print("Introduceți un județ: ");
            String judetCautat = inputScanner.nextLine();
            inputScanner.close();

            // Căutăm poziția județului în tabloul sortat
            int pozitie = Arrays.binarySearch(judete, judetCautat);

            // Afișăm rezultatul
            if (pozitie >= 0) {
                System.out.println("Județul " + judetCautat + " se află pe poziția " + pozitie + " în vectorul ordonat.");
            } else {
                System.out.println("Județul " + judetCautat + " nu a fost găsit în vectorul ordonat.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fișierul nu a fost găsit.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}