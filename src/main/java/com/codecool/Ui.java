package com.codecool;

import com.codecool.API.Wardrobe;

import java.util.Scanner;

public class Ui {



    int option;
    Scanner scanner = new Scanner(System.in);


    public void start() {
        do {
            menuPrinter(new String[] {
                    "Create new wardrobe.",
                    "Access wardrobe."
            });

            System.out.print("Please select an option: ");
            while (true) {
                try {
                    option = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.println("Invalid input!");
                    promptEnterKey();
                }
            }
            switch (option) {
                case 1:
                    System.out.print("Capacity: ");
                    int capacity = Integer.parseInt(scanner.nextLine());
                    Wardrobe wardrobe = new Wardrobe(capacity);
                    System.out.println("Your wardrobe has been created!");
                    promptEnterKey();
                    break;

            }


        } while (option != 0);
    }

    private void menuPrinter(String[] options) {
        int counter = 1;
        for (String option : options) {
            System.out.println(counter + ". " + option);
            counter++;
        }
        System.out.println("0. Exit\n");
    }

    void promptEnterKey() {
        System.out.println("\n Press \"ENTER\" to continue...");
        scanner.nextLine();
    }
}

