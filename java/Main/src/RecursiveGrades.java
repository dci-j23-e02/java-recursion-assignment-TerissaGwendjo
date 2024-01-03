public class RecursiveGrades {

    public static void main(String[] args) {
        int[] grades = {85, 90, 78, 92, 88};

        // Find maximum grade
        int maxGrade = findMaxGrade(grades, 0, grades.length - 1);
        System.out.println("Maximum Grade: " + maxGrade);

        // Find minimum grade
        int minGrade = findMinGrade(grades, 0, grades.length - 1);
        System.out.println("Minimum Grade: " + minGrade);

        // Calculate average grade
        double avgGrade = calculateAverage(grades, 0, grades.length - 1);
        System.out.println("Average Grade: " + avgGrade);
    }

    // Recursive function to find the maximum grade
    private static int findMaxGrade(int[] grades, int start, int end) {
        if (start == end) { // this is the base case
            return grades[start];
        }

        int mid = (start + end) / 2;
        int maxLeft = findMaxGrade(grades, start, mid);
        int maxRight = findMaxGrade(grades, mid + 1, end);

        return Math.max(maxLeft, maxRight); // the maximum of maxLeft and maxRight are combined
    }

    // Recursive function to find the minimum grade
    private static int findMinGrade(int[] grades, int start, int end) {
        if (start == end) {
            return grades[start];
        }

        int mid = (start + end) / 2;
        int minLeft = findMinGrade(grades, start, mid);
        int minRight = findMinGrade(grades, mid + 1, end);

        return Math.min(minLeft, minRight);
    }

    // Recursive function to calculate the average grade
    private static double calculateAverage(int[] grades, int start, int end) {
        if (start == end) {
            return grades[start];
        }

        int mid = (start + end) / 2;
        double sumLeft = calculateAverage(grades, start, mid);
        double sumRight = calculateAverage(grades, mid + 1, end);

        return (sumLeft + sumRight) / 2.0;
    }
}
