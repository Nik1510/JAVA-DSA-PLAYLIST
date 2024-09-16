package arunesh;

import java.util.Scanner;
class selection
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
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
