public class maxmin {

    public static Pair findMaxMin(int[] arr, int low, int high) {
        if (low == high) {
            return new Pair(arr[low], arr[low]);
        }

        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                return new Pair(arr[low], arr[high]);
            } else {
                return new Pair(arr[high], arr[low]);
            }
        }

        int mid = (low + high) / 2;
        Pair leftPair = findMaxMin(arr, low, mid);
        Pair rightPair = findMaxMin(arr, mid + 1, high);

        int overallMax = Math.max(leftPair.max, rightPair.max);
        int overallMin = Math.min(leftPair.min, rightPair.min);

        return new Pair(overallMax, overallMin);
    }

    static class Pair {
        int max;
        int min;

        Pair(int max, int min) {
            this.max = max;
            this.min = min;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 9, 2, 7, 4, 6};
        Pair result = findMaxMin(arr, 0, arr.length - 1);
        System.out.println("Maximum: " + result.max);
        System.out.println("Minimum: " + result.min);
    }
}
