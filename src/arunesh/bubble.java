package arunesh;

import java.util.Scanner;
class bubble
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
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<l-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
