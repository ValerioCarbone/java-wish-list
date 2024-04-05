package org.experis.wishlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> wishList = new ArrayList<>();

        boolean exit = false;

        while (!exit) {
            System.out.println("Which gift do you want?");

            String gift = scan.nextLine().trim();

            wishList.add(gift);

            System.out.println(wishList.size());

            boolean isValid = false;

            while (!isValid) {

                System.out.println("Do you want another gift? Y/N");

                String answer = scan.nextLine();

                switch (answer.toUpperCase()) {
                    case "Y":
                        isValid = true;
                        break;

                    case "N":
                        isValid = true;
                        exit = true;
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            }
        }

        Collections.sort(wishList);

        System.out.println(wishList);

        scan.close();

    }
}
