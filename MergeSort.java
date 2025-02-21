import java.util.*;
class MS{
    public static void Divide(int []a,int l,int h){
        if(l<=h){
            int mid=(l+h)/2;
            Divide(a,l,mid);
            Divide(a,mid+1,h);
            Merge(a,l,h,mid);
        }

    }
    public static void Merge(int[] a,int l,int h,int mid){
        int i,j,k;
        i=l;j=mid+1;k=0;
        int []temp=new int[h-l+1];
        while(i<=mid && j<=h){
            if(a[i]<a[j]){
                temp[k]=a[i];
                k++;i++;
            }
            else{
                temp[k]=a[j];
                k++;j++;
            }
        }
        while(i<=mid){
            temp[k]=a[i];
            k++;i++;
        }
        while(j<=h){
            temp[k]=a[j];
            k++;j++;
        }
        for(int b=l;b<=h;b++){
            a[b]=temp[b-l];
        }
    }

}
class MergeSort{
    public static void main(String[] agrs){
        int []a=new int[]{2,3,7,5,1,4};
        MS m=new MS();
        System.out.println("Sorted : ");
        m.Divide(a,0,5);
        printArr(a);
    }
    public static void printArr(int[] a){
        for(int i=0;i<6;i++){
            System.out.print(a[i]+" ");
        }
    }
}