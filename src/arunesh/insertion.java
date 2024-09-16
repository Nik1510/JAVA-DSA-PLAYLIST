package arunesh;

import java.util.Scanner;
class insertion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        int l=sc.nextInt();
        int arr[]=new int[l];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY:");
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<l;i++)
        {
            int t=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>t)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=t;
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
