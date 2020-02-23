package main;

import definition.SinglyLinkedList;
import person.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        SinglyLinkedList<Person> list = new SinglyLinkedList<>();
        boolean flag = true;
        do {
            System.out.println("Welcome in the Gopal Tiwari's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addContact(list, list1, list2);
                    break;
                case 2:
                    list.sort();
                    list.print();
                    break;
                case 3:
                    searchContact(list, list2);
                    break;
                case 4:
                    removeContact(list, list1, list2);
                    break;
                case 5:
                    flag = false;
                    break;
            }
        } while (flag);
    }

    private static void removeContact(SinglyLinkedList<Person> list, ArrayList<String> list1, ArrayList<String> list2) {
    }

    private static void searchContact(SinglyLinkedList<Person> list, ArrayList<String> list2) {
    }

    private static void addContact(SinglyLinkedList<Person> list, ArrayList<String> list1, ArrayList<String> list2) {
    }

}

