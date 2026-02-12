public class opgave4 {
    double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    int findMin(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    int countAboveAverage(int[] numbers) {
            double average = calculateAverage(numbers);
            int count = 0;
            for (int num : numbers) {
                if (num > average) {
                    count++;
                }
            }
        return count;
        }

    void main() {
        int[] numbers = {45, 67, 23, 89, 34, 56, 78};
        System.out.println("Average: " + calculateAverage(numbers));
        System.out.println("Max: " + findMax(numbers));
        System.out.println("Min: " + findMin(numbers));
        System.out.println("Over average: " + countAboveAverage(numbers));

    }
}
