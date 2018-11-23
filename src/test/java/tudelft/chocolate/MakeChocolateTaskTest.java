package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MakeChocolateTaskTest {
    public MakeChocolateTask task = new MakeChocolateTask();


    @Test
    public void smallAndBigBars() {
        int result = task.makeChocolate(2,2,12);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void totalBiggerThenAllBars() {
        int result = task.makeChocolate(4,1,10);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void onlySmallBars() {
        int result = task.makeChocolate(4,0,3);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void onlyBigBars() {
        int result = task.makeChocolate(0,2,1);
        Assertions.assertEquals(0, result);
    }






}
