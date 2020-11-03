package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Selsius havo harratini kiriting");
        Scanner scanner=new Scanner(System.in);
        double selsius=scanner.nextDouble();
        double farengeyt= 7.0/ 4.0* selsius+22.0;
        System.out.println(" farengeyt " + farengeyt+ " haho haroratigateng ! " );
        
    }

}
