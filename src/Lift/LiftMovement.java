package Lift;

import java.util.Scanner;

class LiftMovement extends LiftMovesUpDown{
    private
    int totalFloor , maxLoad, currentLoad , powerState , currentFloor , selectFloor, direction, addPeople, lift[];

    LiftMovement()
    {
        totalFloor = 6;
        maxLoad = 8;
        currentLoad = 0;
        powerState = 0;
        currentFloor = 0;
        selectFloor = 0;
        direction = 1;
        lift = new int[totalFloor];
        for(int i = 0;i < totalFloor;i++)
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
                if(selectFloor >= 0 && selectFloor <= (totalFloor - 1))
                {
                    lift[selectFloor] = 1;
                }
                else if(selectFloor == -2)
                {
                    System.out.println("Lift is switched off.");
                    System.exit(0);
                }
            }
            //addPeople = ((int)(Math.random() * (maxLoad - currentLoad) + 1));
            addPeople = 0 + (int)(Math.random() * (((maxLoad - currentLoad) - 0) + 1));
            currentLoad = currentLoad + addPeople;
            System.out.println("People entered:"+ addPeople);
            if (currentFloor == totalFloor - 1 || (currentLoad == 0 && selectFloor < currentFloor) || (direction == 0 && currentLoad != 0))
            {
                LiftMovesDown(currentFloor, currentLoad, selectFloor, totalFloor, direction, maxLoad ,lift);
            }
            else if (currentFloor == 0 || (currentLoad == 0 && selectFloor > currentFloor) || (direction == 1 && currentLoad != 0))
            {
                LiftMovesUp(currentFloor, currentLoad, selectFloor, totalFloor, direction, maxLoad, lift);
            }

            System.out.println("People exited:"+ (currentLoad - getCurrentLoad()));
            currentLoad = getCurrentLoad();
        }
    }
}
