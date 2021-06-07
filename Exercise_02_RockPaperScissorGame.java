package com.company;
import java.util.Scanner;
import java.util.Random;

public class Exercise_02_RockPaperScissorGame {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the game of Rock,Paper,Scissors against the Computer \n This is a program made using Java");
        System.out.println("Here, \n 0 = Rock \n 1 = Paper \n 2 = Scissor \n");
        System.out.println("Input your number below :");
        int myChoice = sc.nextInt();
        int computerChoice = rn.nextInt(3);

        switch (myChoice){
            case 0:
                if (computerChoice == 0){
                    System.out.println("Draw \n The computer also selected Rock !!");
                }else if (computerChoice == 1){
                    System.out.println("Loss \n The computer selected Paper !!");
                }else {
                    System.out.println("Win \n The computer selected Scissors !!");
                }
                break;
            case 1:
                if (computerChoice == 0){
                    System.out.println("Win \n The computer selected Rock !!");
                }else if (computerChoice == 1){
                    System.out.println("Draw \n The computer also selected Paper !!");
                }else {
                    System.out.println("Loss \n The computer selected Scissors !!");
                }
                break;
            case 2:
                if (computerChoice == 0){
                    System.out.println("Win \n The computer selected Rock !!");
                }else if (computerChoice == 1){
                    System.out.println("Loss \n The computer selected Paper !!");
                }else {
                    System.out.println("Draw \n The computer also selected Scissors !!");
                }
                break;
        }

        System.out.println("\nThank you for playing as well as using my Java code !! =)");

    }
}
