package Lift;

import java.util.Scanner;

public class Lift {

    public static void main(String[] args) {
        int option;
        LiftMovement lift = new LiftMovement();
        do {
            System.out.println("Switch on power? 1-Yes, 2-No:");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();
            if(option == 1)
            {
                lift.LiftMovement(option);
            }
            else if(option == 2)
            {
                System.out.println("Lift is still off.");
            }
            else
            {
                System.out.println("Invalid option. Lift is still off.");
            }
        }while(option != 1 && option != 2);

    }
}
