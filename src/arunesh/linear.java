package arunesh;

import java.util.Scanner;
class linear
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        int l=sc.nextInt();
        int arr[]=new int[l];
        System.out.println("ENTER THE ARRAY ELEMENTS:");
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER THE VALUE TO BE SEARCHED");
        int n=sc.nextInt();
        int pos=-1;
        for(int i=0;i<l;i++)
        {
            if(arr[i]==n)
            {
                pos=i;
            }
        }
        if(pos==-1)
        System.out.println("THE VALUE WAS NOT FOUND");
        else
        System.out.println("THE VALUE WAS FOUND AT "+pos+" POSITION");
    }
}
