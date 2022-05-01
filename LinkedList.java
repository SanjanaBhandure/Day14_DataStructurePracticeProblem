/*
 * Linked List using Data Structures
 *
 * @author: Sanjana bhandure
 * @version: 1.0
 * @date: 1-5-2022
 */

package com.Bridgelabz.Day14_DataStructures;

import java.util.Scanner;

public class LinkedList {
    int data;
    LinkedList next;

    LinkedList (int value) {
        this.data = value;
    }

    void display() {
        System.out.println(data);
    }
}

class Linked {
    public LinkedList firstNode, lastNode;

    Linked() {
        firstNode = null;
        lastNode = null;
    }

    /*
     * Insert node or create linked list
     */
    void insertNode(int value) {
        LinkedList node = new LinkedList(value);
        node.next = null;
        if (firstNode == null) {
            firstNode = lastNode = node;
            System.out.println("Linked list created successfully!!!");
        }else {
            lastNode.next = node;
            lastNode = node;
            System.out.println("Node inserted successfully!!!");
        }
    }

    /*
     * Delete node from linked list
     */
    void delete() {
        int count = 0, number, i;
        LinkedList node, node1;
        Scanner input = new Scanner(System.in);

        for(node = firstNode; node != null; node = node.next)
            count++;
        display();
        node = node1 = firstNode;
        System.out.println(count+" nodes available here!");
        System.out.println("Enter the node number which you want to delete:");
        number = Integer.parseInt(input.nextLine());
        if(number != 1) {
            if(number <= count) {
                for(i = 2; i <= number; i++)
                    node = node.next;

                for(i = 2; i <= number-1; i++)
                    node1 = node1.next;

                node1.next = node.next;
                node.next = null;
                node = null;
            }
            else
                System.out.println("Invalid node number!\n");
        }
        else {
            firstNode = node.next;
            node = null;
        }

        System.out.println("Node has been deleted successfully!\n");
    }

    /* Display linked list */
    void display() {
        LinkedList node = firstNode;
        System.out.println("List of node:");
        while(node != null) {
            node.display();
            node = node.next;
        }
    }
}


class SinglyLinkedList {
    public static void main(String args[ ]) {
        Linked list = new Linked();
        Scanner input = new Scanner(System.in);
        int op = 0;
        while(op != 4) {
            System.out.println("1. Insert 2. Delete 3. Display 4. Exit");
            System.out.println("Enter your choice:");
            op = Integer.parseInt(input.nextLine());
            switch(op) {
                case 1:
                    System.out.println("Enter the position value for Linked list:");
                    list.insertNode(Integer.parseInt(input.nextLine()));
                    break;

                case 2:
                    list.delete();
                    break;

                case 3:
                    list.display();
                    break;

                case 4:
                    System.out.println("Exit!!!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");

            }
        }
    }
}