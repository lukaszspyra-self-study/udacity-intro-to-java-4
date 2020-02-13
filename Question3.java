public class Question3 {

    /**
    *Function to find and return lowest index in String argument array that the target String occurs,
    *alternative to the one in answer section.
    *
    *@param stringArray of Strings to search from
    *@param target target String that will be searched
    *
    *@return lowest int index of String target occurence or -1 if not found
    */
    public int indexOfFirstOccurence(String[] stringArray, String target) {
        int lowestIndexOfOccurence = -1;
        for (int i = 0; i < stringArray.length; i++){
            if (stringArray[i].equals(target)) {
                lowestIndexOfOccurence = i;
                break;
            }
        }
    return lowestIndexOfOccurence;
    }
}