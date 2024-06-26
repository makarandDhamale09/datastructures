package main.java.Arrays;

public class PermutationArrays {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {5, 1, 2, 3, 4};

    System.out.println(Boolean.toString(permutation(arr1, arr2)));
  }

  public static boolean permutation(int[] array1, int[] array2) {
    if (array1.length != array2.length) {
      return false;
    }
    int sum1 = 0;
    int prod1 = 1;
    int sum2 = 0;
    int prod2 = 1;
    for (int i = 0; i < array1.length; i++) {
      sum1 += array1[i];
      prod1 *= array1[i];
      sum2 += array2[i];
      prod2 *= array2[i];
    }
    return sum1 == sum2 && prod1 == prod2;
  }
}
