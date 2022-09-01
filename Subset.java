public class Subset {
    // Java program to print sums
    // of all possible subsets.

    // Prints sums of all
    // subsets of arr[l..r]
   
    // Driver code
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 6, 3, 2, 6 };
        int n = arr.length;
        isThereSubsetSum(arr, n - 1, 0);
    }


// This code is contributed by anuj_67

static boolean isThereSubsetSum(int arr[],int n, int sum) {

  if (sum == 0)
    return true;
  if (n == 0)
    return false;

  if (arr[n - 1] > sum)
    return isThereSubsetSum(arr, n - 1, sum);

  return isThereSubsetSum(arr, n - 1, sum) ||
    isThereSubsetSum(arr, n - 1, sum - arr[n - 1]);
}
}