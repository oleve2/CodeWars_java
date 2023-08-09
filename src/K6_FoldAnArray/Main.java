package K6_FoldAnArray;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello");
    int[] arr = new int[]{-9, 9, -8, 8, 66, 23 };
  
    int[] resArr = foldArray(arr, 1);
    for(int i: resArr) {
      System.out.println(i);
    }
  }
  
  public static int[] foldArray(int[] array, int runs)
  {
    int[] resArr= array;
    
    for (int r=1; r <= runs; r++) {
      int cntSteps = resArr.length / 2;
      List<Integer> tempArr = new ArrayList<>();
      
      for (int i=0; i < cntSteps; i++) {
        int var = resArr[i] + resArr[resArr.length -1 - i];
        tempArr.add(var);
      }
      if ((resArr.length % 2) != 0) {
        tempArr.add(resArr[cntSteps]);
      }
  
      resArr = tempArr.stream().mapToInt(i -> i).toArray();
    }

    return resArr;
  }
}
