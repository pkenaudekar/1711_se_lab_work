package Lift;

import java.util.Scanner;

public class Lift {

    public static void main(String[] args) {
        LiftMovement lift = new LiftMovement();
        System.out.println("Switch on power? 1-Yes, 2-No:");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        if(option == 1)
        {
            lift.LiftMovement(option);
        }
        else
        {
            System.out.println("Lift is still off.");
        }
    }
}
