public class Question8 {

    /**
    *Improved monopolyRoll function:
    *Players roll two six-sided dice, if the same value is on both dice they go again,
    *until two non-equal values appear on two dice. If they roll 3 consecutive double they go to jail.
    *
    *@return int sum of all dice rolls by the player in a turn or -1 if goes to jail 
    */
    public int monopolyRoll(){
        int dice1 = diceRoll();
        int dice2 = diceRoll();
        int rollCount = 1;
        int totalSum = dice1 + dice2;        

        while (dice1 == dice2){
            if (rollCount == 3){
                return -1;
            }
            dice1 = diceRoll();
            dice2 = diceRoll();
            rollCount++;
            totalSum = totalSum + dice1 + dice2;
        }
        return totalSum;
    )
    
    /**
    *Function generates random values from 1 to 6 simulating dice roll.
    *
    *@return integer value from 1 to 6.
    */
    public int diceRoll(){
        double doubleNumber = Math.random()*6;
        doubleNumber = doubleNumber + 1;
        return (int)doubleNumber;
    }  
}