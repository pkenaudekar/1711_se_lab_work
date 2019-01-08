package Lift;

public class LiftMovesUpDown {

    protected
    int currentLoad , currentFloor , lift[], direction;

    public void LiftMovesDown(int curruntFloor, int currentLoad, int selectFloor, int totalFloor, int direction, int maxLoad, int lift[])
    {
        this.currentFloor = curruntFloor;
        this.currentLoad = currentLoad;
        this.direction = direction;

        this.currentLoad = this.currentLoad - (0 + (int)(Math.random() * (((maxLoad - currentLoad) - 0) + 1)));
        //addPeople = 0 + (int)(Math.random() * (((maxLoad - currentLoad) - 0) + 1));
        while( lift[ this.currentFloor ] == 1)
        {
            if(curruntFloor == 0)
            {
                this.direction = 1;
                break;
            }
            this.currentFloor--;
        }
        lift[this.currentFloor] = 0;
    }

    public void LiftMovesUp(int curruntFloor, int currentLoad, int selectFloor, int totalFloor, int direction, int maxLoad, int lift[])
    {
        this.currentFloor = curruntFloor;
        this.currentLoad = currentLoad;
        this.direction = direction;

        //this.currentLoad = this.currentLoad - ((int)(Math.random() * (maxLoad - currentLoad) + 1));
        this.currentLoad = this.currentLoad - (0 + (int)(Math.random() * (((maxLoad - currentLoad) - 0) + 1)));
        while( lift[ this.currentFloor ] == 1)
        {
            if(curruntFloor == totalFloor-1)
            {
                this.direction = 0;
                break;
            }
            this.currentFloor++;
        }
        lift[this.currentFloor] = 0;
    }

    public int getCurrentLoad()
    {
        return this.currentLoad;
    }

    public int getCurrentFloor()
    {
        return this.currentFloor;
    }

    public int getDirection()
    {
        return this.direction;
    }
}
