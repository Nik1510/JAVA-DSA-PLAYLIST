package arunesh;

import java.util.Scanner;
class bsearch
{
    int arr[],l,v;
    bsearch(int s,int val)
    {
        l=s;
        v=val;
        arr=new int[l];
    }
    void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ARRAY ELEMENTS:");
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void sort()
    {
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<l-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[i]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    int bsearch()
    {
        int beg=0,end=l-1,mid;
        while(beg<=end)
        {
            mid=(beg+end)/2;
            if(arr[mid]==v)
            return mid;
            else if(v>arr[mid])
            beg=mid+1;
            else
            end=mid-1;
        }
        return -1;
    }
    void display()
    {
        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int pos=bsearch();
        if(pos==-1)
        System.out.println("VALUE NOT FOUND");
        else
        System.out.println("VALUE FOUND AT "+pos+" INDEX");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        int s=sc.nextInt();
        System.out.println("ENTER THE VALUE TO BE SEARCHED:");
        int val=sc.nextInt();
        bsearch obj=new bsearch(s,val);
        obj.fillarray();
        obj.sort();
        obj.bsearch();
        obj.display();
    }
}
