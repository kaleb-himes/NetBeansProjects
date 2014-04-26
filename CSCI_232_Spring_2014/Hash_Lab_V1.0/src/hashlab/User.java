/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashlab;

import java.util.Scanner;

/**
 *
 * @author Kaleb
 */
public class User extends HashLab {

    private static Scanner a = new Scanner(System.in);
    private static String choice;
    private static int search;

    public static void Run() {
        for (int i = 0; i < Main.length; i++) {
                    if (i < (Main.length - 1)) {
                        if (Main[i].getInt() != -99) {
                            System.out.print("[" + Main[i].getInt() + "," + Main[i].getData() + "],");
                        } else {
                            System.out.print("[  ,  ],");
                        }
                    } else {
                        if (Main[i].getInt() != -99) {
                            System.out.print("[" + Main[i].getInt() + "," + Main[i].getData() + "]\n\n");
                        } else {
                            System.out.print("[  ,  ]\n\n");
                        }
                    }
                }
        System.out.println("What would you like to do?");
        System.out.println("1. Search for a value(type: search)\n"
                + "2. Add a value(type add)\n"
                + "3. Delete an entry(type: delete)\n"
                + "4. Quit(type: quit)");
        System.out.print("Enter your choice now: ");
        choice = a.next();

        System.out.println();
        if (choice.equals("search") || choice.equals("Search") || choice.equals("1")) {
            try {
                System.out.print("please enter the number corresponding to the entry you would like to find: ");
                search = a.nextInt();
                for (int i = 0; i < Main.length; i++) {
                    if (Main[i].getInt() == search) {
                        System.out.println("checking spot" + Main[i]);
                        System.out.println("comparing " + Main[i].getInt() + " to " + search);
                        System.out.println(Main[i].getData());
                        Run();
                    }
                }
                System.out.println("The value you searched for was not in the hash.");
                Run();
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Error: Invalid entry detected.");
                Run();
            }
        } else if (choice.equals("add") || choice.equals("Add") || choice.equals("2")) {
            try {
                System.out.print("please enter the number to be used as the key: ");
                int key = a.nextInt();
                System.out.print("please enter the String that will become the value of the key: ");
                String word2 = a.next();
                Main = place(key, word2).clone();
                
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Error: Invalid entry detected.");
                Run();
            }
            Run();
        } else if (choice.equals("delete") || choice.equals("Delete") || choice.equals("3")) {
            try {
                System.out.print("please enter the number corresponding to the entry you would like to delete: ");
                search = a.nextInt();
                for (int i = 0; i < size; i++) {
                    if (Main[i].getInt() == search) {
                        Main[i].setInt(-99);
                        Main[i].setData("");
                        Run();
                    }
                }
                System.out.println("The value you're looking for is not in the hash.");
                Run();
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Error: Invalid entry detected.");
                Run();
            }

        } else if (choice.equals("quit") || choice.equals("Quit") || choice.equals("4")) {
            System.exit(0);
        } else {
            System.out.println("That was not a valid option.");
            Run();
        }

    }
}
