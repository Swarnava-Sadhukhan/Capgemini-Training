public class sort {
    public static void main(String[] args) {
        int ar[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        System.out.println("The array after sorting is: ");
        int n = ar.length;
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (ar[j] > ar[j+1])
                {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(ar[i]+" ");
    }
}
