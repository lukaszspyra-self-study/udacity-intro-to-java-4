public class Question4 {

    //returns number of years to million, account increase of 5% yearly.
    public int yearsTilOneMillion(double initialBalance){
        double totalSum = initialBalance;
        int yearsCount = 0;
        while (totalSum < 1000000){
            totalSum = totalSum * 1.05;
            yearsCount++;
        }
        
        return yearsCount;
    }
}