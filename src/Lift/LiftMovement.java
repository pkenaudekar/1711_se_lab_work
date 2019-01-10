package Lift;

import java.util.Scanner;
import java.util.Random;
class LiftMovement extends LiftMovesUpDown{
    private
    int totalFloor , maxLoad, currentLoad , powerState , currentFloor , selectFloor, direction, enterPeople, nextFloorUp, nextFloorDown, floor;
    int[] lift;

    LiftMovement()
    {
        totalFloor = 6; maxLoad = 8; currentLoad = 0; powerState = 0;
        currentFloor = 0; selectFloor = 0; direction = 1;
        lift = new int[totalFloor];
        for(int i = 0; i < lift.length; i++)
        {
            lift[i] = 0;
        }
    }

    public void LiftMovement(int powerState)
    {
        while(powerState != 0)
        {
            while(selectFloor != -1)
            {
                System.out.println("Select floor number from 0 to " + (totalFloor - 1) +", select -1 to accept request, select -2 to shut down the lift:");
                Scanner input = new Scanner(System.in);
                selectFloor = input.nextInt();

                if(selectFloor== -1 || selectFloor == -2 || selectFloor >= 0 && (selectFloor <= (totalFloor-1)))
                {
                    if (selectFloor >= 0 && selectFloor < totalFloor) {
                        lift[selectFloor] = 1;
                    }
                    else if (selectFloor == -2)
                    {
                        System.out.println("People exited on floor " + currentFloor + " are:" + currentLoad);
                        System.out.println("Lift is switched off.");
                        powerState = 0;
                        System.exit(0);
                    }
                }
                else
                {
                    System.out.println("Invalid option selected try again.");
                }
            }
            System.out.println("Floor(s) were selected");

            Random people = new Random();
            enterPeople = people.nextInt(maxLoad - currentLoad);
            currentLoad = currentLoad + enterPeople;
            System.out.println("\nPeople entered on floor "+currentFloor+":"+ enterPeople);
            System.out.println("Total People in lift:"+ currentLoad); //

            /*CODE TO CHECK IF THERE IS ANOTHER FLOOR SELECTED IN THIS DIRECTION*/
            floor = currentFloor;
            if(direction == 1)
            {
                nextFloorUp = 0;
                while (floor < totalFloor)
                {
                    if(lift[floor] == 1)
                    {
                        nextFloorUp = 1;
                        break;
                    }
                    floor++;
                }
                if(nextFloorUp == 0)
                {
                    this.direction = 0;
                }
            }
            else
            {
                nextFloorDown = 0;
                while (floor >= 0)
                {
                    if(lift[floor] == 1)
                    {
                        nextFloorDown = 1;
                        break;
                    }
                    floor--;
                }
                if(nextFloorDown == 0)
                {
                    this.direction = 1;
                }
            }

            System.out.println("Floor's coming up next");
            for(int i = 0; i < lift.length; i++)
            {
                System.out.print(lift[i]+" ");
            }
            if(direction==1)
            {
                System.out.print("  ->Lift Going Up");
            }
            else
            {
                System.out.print("  <-Lift Going Down");
            }

            if ((currentFloor == totalFloor - 1 && direction == 0) || (direction == 0 && currentLoad > 0) || (currentFloor == totalFloor -1 && direction == 1))
            {
                LiftMovesDown(currentFloor, currentLoad, totalFloor, direction, maxLoad ,lift);
            }
            else if ((currentFloor == 0 && direction == 1) || (direction == 1 && currentLoad > 0) || (currentFloor == 0 && direction == 0))
            {
                LiftMovesUp(currentFloor, currentLoad, totalFloor, direction, maxLoad, lift);
            }
            direction = getDirection();
            currentFloor=getCurrentFloor();
            lift[currentFloor] = 0;
            selectFloor = 0;

            currentLoad = currentLoad-getExitPeople();
        }
    }
}
