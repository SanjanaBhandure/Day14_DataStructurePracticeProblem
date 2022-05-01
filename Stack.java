/*
 * Stack program using Data Structures
 *
 * @author: Sanjana bhandure
 * @version: 1.0
 * @date: 1-5-2022
 */
package com.Bridgelabz.Day14_DataStructures;

import java.util.Scanner;

public class Stack {
    int[] stack;
    int top;
    int size;
    int element;

    Stack(int size) {
        this.size = size;
        top = -1;
        stack = new int[size];
    }

    /*
     * void push method created to add an element in stack
     */
    void push() {
        if (top == size - 1) {
            System.out.println("Stack Is Full");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an element to add in stack: ");
            element = scanner.nextInt();
            top++;
            stack[top] = element;
        }
    }

    /*
     * void pop method created to delete an element from stack
     */
    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            int element = stack[top];
            System.out.println("The popped element is:  " + element);
            top--;
        }
    }

    /*
     * void display method created to display all the elements in stack
     */
    void display() {
        if (top == -1) {
            System.out.println("Stack Is Empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i] + " ");
        }
    }

    public static void main(String args[]) {
        Stack stack = new Stack(5);
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        while (op != 4) {
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    stack.push();
                    stack.display();
                    break;

                case 2:
                    stack.pop();
                    stack.display();
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    System.out.println("Exit!!!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter valid option!!!");
            }
        }
    }
}