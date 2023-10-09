package average;

public class Average {
    /**
     * Returns the average of an array of numbers
     *
     * @param nums the array of integer numbers
     * @return the average of the numbers
     */
    public float computeAverage(int[] nums) {
        float result = 0;
        // Add your code
        int sum = 0;
        for (int element : nums) {
            sum += element;
        }
        result = (float) sum / nums.length;
        return result;
    }

    public static void main(String[] args) {
        // Add your code
        Average myAverage = new Average();
        int[] arr = {1, 2, 3, 4, 5, 6};
        float average = myAverage.computeAverage(arr);
        System.out.println("The average is " + average);
    }
}
