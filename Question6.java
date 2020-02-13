public class Question6 {

/** 
*Function to find range covered by int Array
*
*@param array of integers for processing
*
*@return range in int (diference between max and min) or -1 if the array lenght is 0 
*/
    public int findRange(int[] intArray){
        int max = intArray[0];
        int min = intArray[0];
        for (int i = 1; i < intArray.length; i++){
            if (intArray[i] > max){
                max = intArray[i];
            } 
            if (intArray[i] < min){
                min = intArray[i];
            }
        }
        if (intArray.length == 0){
            return -1;
        } else {
        return (max - min);
        }
    }
}