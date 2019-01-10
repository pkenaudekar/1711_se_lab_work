package Lift;
import java.util.Random;

public class LiftMovesUpDown {

    private
    int currentLoad , currentFloor , direction, exitPeople, nextFloorUp, nextFloorDown, floor;
    //int exitPeople;


    public void LiftMovesDown(int currentFloor, int currentLoad, int totalFloor, int direction, int maxLoad, int [] liftArr)
    {
        System.out.println("\nCurrent Floor: "+currentFloor);
        this.currentFloor = currentFloor;
        this.currentLoad = currentLoad;
        this.direction = direction;

        do
        {
            currentFloor--;
            this.currentFloor = this.currentFloor - 1;
        }while( liftArr[currentFloor] == 0 && currentFloor != 0);

        /*CODE TO CHECK IF THERE IS ANOTHER FLOOR SELECTED IN THIS DIRECTION*/
        nextFloorDown = 0;
        floor = currentFloor;
        while (floor >= 0)
        {
            if(liftArr[floor] == 1)
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
        else if(currentFloor == 0)
        {
            this.direction = 1;
        }
        Random people = new Random();
        exitPeople = people.nextInt(currentLoad);
        System.out.println("\nPeople exited on floor "+this.currentFloor+":"+ exitPeople);
    }

    public void LiftMovesUp(int currentFloor, int currentLoad, int totalFloor, int direction, int maxLoad, int [] liftArr)
    {
        System.out.println("\nCurrent Floor: "+currentFloor);
        this.currentFloor = currentFloor;
        this.currentLoad = currentLoad;
        this.direction = direction;
        do
        {
            currentFloor++;
            this.currentFloor = this.currentFloor + 1;
        }while( liftArr[currentFloor] == 0 && (currentFloor != totalFloor - 1));

        /*CODE TO CHECK IF THERE IS ANOTHER FLOOR SELECTED IN THIS DIRECTION*/
        nextFloorUp = 0;
        floor = currentFloor;
        while (floor < totalFloor)
        {
            if(liftArr[floor] == 1)
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
        else if(currentFloor == totalFloor - 1)
        {
            this.direction = 0;
        }

        Random people = new Random();
        exitPeople = people.nextInt(currentLoad);
        System.out.println("People exited on floor "+this.currentFloor+":"+ exitPeople);
    }

    public int getCurrentLoad()
    {
        //return this.currentLoad;
        return currentLoad;
    }

    public int getCurrentFloor()
    {
        //return this.currentFloor;
        return currentFloor;
    }

    public int getDirection()
    {
        return this.direction;
        //return direction;
    }

    public int getExitPeople()
    {
        return exitPeople;
    }
}
