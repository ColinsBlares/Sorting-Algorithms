public class LastOccurrenceBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5, 6, 7};
        int target = 4;
        int index = findLastOccurrence(arr, target);

        if (index != -1) {
            System.out.println("Последнее вхождение элемента " + target + " находится на индексе " + index);
        } else {
            System.out.println("Элемент " + target + " не найден в массиве.");
        }
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                result = mid;
                low = mid + 1;
            }
        }
        return result;
    }
}
