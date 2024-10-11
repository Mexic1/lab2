package ex3;

import java.util.Scanner;

public class PozString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder x=new StringBuilder("Systemin");
        String y=sc.nextLine();
        int poz= sc.nextInt();
        int l=sc.nextInt();
        StringBuilder p= x.delete(poz,l);
        System.out.println(p);
        String f=p.substring(0,poz)+y+p.substring(poz);
        System.out.println(f);
    }
}
