package Lift;
import java.util.Random;

public class LiftMovesUpDown {

    private
    int currentLoad , currentFloor , direction, exitPeople, nextFloorUp, nextFloorDown, floor;
    //int exitPeople;


    public void LiftMovesDown(int currentFloor, int currentLoad, int totalFloor, int direction, int maxLoad, int [] liftArr)
    {
        System.out.println("\nCurrent Floor: "+currentFloor);
        /*for(int i = 0; i < liftArr.length; i++)//
        {
            System.out.print(liftArr[i]+" ");
        }*/

        this.currentFloor = currentFloor;
        this.currentLoad = currentLoad;
        this.direction = direction;

        //this.currentLoad = this.currentLoad - (0 + (int)(Math.random() * (((maxLoad - currentLoad) - 0) + 1)));
        //addPeople = 0 + (int)(Math.random() * (((maxLoad - currentLoad) - 0) + 1));
        /*Random people = new Random();
        exitPeople = people.nextint(currentLoad);*/

        //while( lift[ this.currentFloor ] == 1)
        do
        {
            /*if(currentFloor == 0)
            {
                this.direction = 1;
                //direction = 1;
                System.out.println("\ndirect = 1"); //
                break;
            }*/
            //this.currentFloor--;
            currentFloor--;
            //System.out.println("\nwhile1 entered"); //
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
            //System.out.println("\ndirect = 1"); //
        }
        else if(currentFloor == 0)
        {
            this.direction = 1;
            //direction = 0;
            //System.out.println("\ndirect = 1"); //
            //currentFloor--;
            //this.currentFloor = this.currentFloor - 1;
        }


        //lift[this.currentFloor] = 0;
        //liftArr[currentFloor] = 0;
        Random people = new Random();
        exitPeople = people.nextInt(currentLoad);
        //System.out.println("\nPeople exited on floor "+this.currentFloor+":"+ exitPeople);
        System.out.println("\nPeople exited on floor "+this.currentFloor+":"+ exitPeople);
    }

    public void LiftMovesUp(int currentFloor, int currentLoad, int totalFloor, int direction, int maxLoad, int [] liftArr)
    {
        System.out.println("\nCurrent Floor: "+currentFloor);
        /*for(int i = 0; i < liftArr.length; i++)//
        {
            System.out.print(liftArr[i]+" ");
        }*/

        this.currentFloor = currentFloor;
        this.currentLoad = currentLoad;
        this.direction = direction;
        //this.currentLoad = this.currentLoad - ((int)(Math.random() * (maxLoad - currentLoad) + 1));
        //this.currentLoad = this.currentLoad - (0 + (int)(Math.random() * (((maxLoad - currentLoad) - 0) + 1)));
        /*Random people = new Random();
        exitPeople = people.nextInt(currentLoad);*/


        //while(lift[currentFloor] != 1)
        do
        {
            /*if(currentFloor == totalFloor - 1)
            {
                this.direction = 0;
                //direction = 0;
                System.out.println("\ndirect = 0"); //
                currentFloor--;
                this.currentFloor = this.currentFloor - 1;
                break;
            }*/
            //this.currentFloor++;
            currentFloor++;
            //System.out.println("\nwhile2 entered"); //
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
            //System.out.println("\ndirect = 0"); //
        }
        else if(currentFloor == totalFloor - 1)
        {
            this.direction = 0;
            //direction = 0;
            //System.out.println("\ndirect = 0"); //
            //currentFloor--;
            //this.currentFloor = this.currentFloor - 1;
        }

        //lift[this.currentFloor] = 0;
        //liftArr[currentFloor] = 0;
        Random people = new Random();
        exitPeople = people.nextInt(currentLoad);
        //System.out.println("People exited on floor "+this.currentFloor+":"+ exitPeople);
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
