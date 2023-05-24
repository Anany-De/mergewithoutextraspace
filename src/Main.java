

//User function Template for Java

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        // code here


        //Gap Method

        int gap=(n+m+1)/2;
        int flag=0;
        while(flag<2)
        {

            int i=0,j=gap;

            while(j<m+n)
            {
                if(i<n && j<n)
                {

                    if(arr1[i]>arr1[j]) swap(arr1,i,arr1,j);

                }
                else if(i<n && j>=n)
                {
                    if(arr1[i]>arr2[j-n]) swap(arr1,i,arr2,j-n);

                }
                else if(i>=n && i<m+n)
                {
                    if(arr2[i-n]>arr2[j-n]) swap(arr2,i-n,arr2,j-n);
                }
                i++; j++;
            }

            gap=(gap+1)/2;
            if(gap==1) flag++;

        }
        /*
        int i=0; int j=0;
        while(true){
            if(i>=n){
                //System.out.println("break");
                break;
            }
            if(arr1[i]>arr2[j]){
                //System.out.println("hi");
                long temp = arr1[i];
                arr1[i]= arr2[j];
                arr2[j]=temp;

                Arrays.sort(arr2);
            }
            i++;
        }
        */

    }

    public static void swap(long[] arr1, int x,long[] arr2, int y){
        long temp= arr1[x];
        arr1[x]=arr2[y];
        arr2[y]=temp;
    }

}

