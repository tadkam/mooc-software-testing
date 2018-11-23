package tudelft.chocolate;

public class MakeChocolateTask {

    public int makeChocolate(int small, int big, int goal) {
        int maxBigBoxes = goal/5;
        int bigBoxesWeCanUse = maxBigBoxes < big ? maxBigBoxes : big;
        if (goal<5 && small < goal) {
            return 0;
        }
        goal -= (bigBoxesWeCanUse * 5);
        if(small <goal){
            return -1;
        }
        return goal;
    }

}
