package Leetcode;

public class searchinmountainarr {
    public static void main(String[] args) {
      int [] arr  = {1,2,3,4,5,3,1};
      int target = 4;
      int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target) {
        int peak = peak(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start < end) {
            if (arr[mid] >= arr[mid + 1]) {
                end = mid;
                return end;
            } else {
                start = mid + 1;
            }


        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

         start = 0;
         end = arr.length - 1;

        boolean IsAsc = arr[start] > arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (IsAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                }

            }
        }
        return -1;
    }
}