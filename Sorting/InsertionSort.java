Class Main{
  public static void InsertionSort (int[]arr){
    int n = arr.length;
    for (int i =0; i<n-1; i++){
      for (int j = i+1; j>0; j--){
        if (arr[j]<arr[j-1]){
          int temp = arr[j];
          arr[j]= arr[j-1];
          arr[j-1]= temp;
        }
        
      }
    }
    public static void main(String args[]){
      int [] arr = {3,6,8,2,7,1}
        InsertionSort(arr);
      System.out.print(Arrays.toString(arr));
      
    }
  }
}
