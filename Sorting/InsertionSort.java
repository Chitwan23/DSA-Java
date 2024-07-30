import java.util.*;
class Main{
  public static void InsertionSort (int[]arr){
    int n = arr.length;
    for (int i = 1; i<n; i++){
      int j = i-1;
      int current = arr[i];
      while(j>=0 && arr[j]>current)
      {arr[j+1]=arr[j];
       j--;
        }
      arr[j+1]= current ;

        
      }
    }
    public static void main(String args[]){
      int [] arr = {3,6,8,2,7,1};
        InsertionSort(arr);
      System.out.println(Arrays.toString(arr));
      
    }
  }
}
