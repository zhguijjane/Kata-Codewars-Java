/*Complete the method which accepts an array of integers, and returns one of the following:

    "yes, ascending" - if the numbers in the array are sorted in an ascending order
    "yes, descending" - if the numbers in the array are sorted in a descending order
    "no" - otherwise

You can assume the array will always be valid, and there will always be one correct answer.
*/

class Solution {
  
  public static String isSortedAndHow(int[] array) {

        if (isDescending(array))
            return "yes, descending";
        if (isAscending(array))
            return "yes, ascending";

        return "no";
    }

    private static boolean isDescending(int[] array) {
        return IntStream.range(0, array.length - 1).allMatch(i -> array[i] >= array[i + 1]);
    }

    private static boolean isAscending(int[] array) {
        return IntStream.range(0, array.length - 1).allMatch(i -> array[i] <= array[i + 1]);
    }
  
}
