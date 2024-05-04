public class CellingOfNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 14, 16, 19 };
        int key = 7;
        System.out.println("Celling value: " + findCelling(arr, key));
        System.out.println("Floor value: "+findFloor(arr, key));
    }

    static int findCelling(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (key == arr[mid]) {
                return arr[mid];
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }

    static int findFloor(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (key == arr[mid]) {
                return arr[mid];
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
