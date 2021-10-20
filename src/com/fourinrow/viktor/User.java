package com.fourinrow.viktor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {

    static Scanner scan = new Scanner(System.in);

    public static int userInput(int player) {

    	
        int user = 0;
        boolean cont = true;
        
        System.out.println();
        System.out.println("\t\tPlayer " + player + " turn");

        do {

            try {
            	
                user = scan.nextInt();

                if (user < 1 || user > 7) {

                    System.out.println("Wrong input, try again");
                    scan.nextLine();

                } else {
                    cont = false;
                    scan.nextLine();

                }
            } catch (InputMismatchException ex) {

                System.out.println("Wrong input, try again");
                scan.nextLine();

            }

        } while (cont);

       
        return user - 1;

    }

}
