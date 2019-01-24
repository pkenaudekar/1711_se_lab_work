package Lift;

import junit.framework.TestCase;
import org.junit.Assert;

public class LiftMovesUpDownTest extends TestCase {

    private final LiftMovesUpDown UpDown = new LiftMovement();
    public void testGetCurrentFloor() {
        Assert.assertEquals(1, UpDown.getCurrentFloor());
    }

    public void testGetDirection() {
        Assert.assertEquals(0, UpDown.getDirection());
    }
}