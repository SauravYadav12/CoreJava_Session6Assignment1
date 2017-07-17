class PrimeNumberArray 
{
  public static void main(String[] args) 
  {
        int arr[] = new int[]{2,3,5,7,9,11,13,17,19,23};
        int arr2[] = new int[10];
        int count = 9;
        for(int i = 0; i<=arr.length ; i++)
        {
          
          arr2[i] = arr[count];
          
          System.out.println(arr2[i]);

          count--;
          if (count == -1)
            break;
        }
  }
}