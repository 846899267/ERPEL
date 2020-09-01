package com.erp.config;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class a {

    public static void main(String[] args) {
        a a = new a();

                int b[][]=new int[][]{{2,4,10}, {0,3,15},{3,4,21}};
                int c[]=a.func1(b,6);
                for(int i=0;i<c.length;i++){
                    System.out.println(c[i]);
                }

    }
//    public int findMaxDivision(int[] A, int n) {
//        // write code here
//        Arrays.sort(A);
//        for(int i=0;i<n;i++){
//            System.out.print(A[i]+" ");
//        }
//        int a[]=new int[n-1];
//        for(int i=0;i<n-1;i++){
//            a[i]=A[i]-A[i+1];
//        }
//        int max=-99;
//        for(int i=0;i<n-1;i++){
//            if(max<a[i])
//                max=a[i];
//        }
//        return max;
//    }

//    public String[] myFunction (String[] arr) {
//        // write code here
//       char a[]=new char[arr.length];
//       for(int i=0;i<arr.length;i++){
//           a[i]=arr[i].toCharArray()[0];
//       }
//        char max=' ',temp=' ';
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a.length-1;j++){
//                if(a[j]<a[j+1]){
//                    temp=a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=temp;
//                }
//            }
//        }
//
//        String c[]=new String[arr.length];
//        for(int i=0;i<arr.length;i++)
//        {
//            c[i]=String.valueOf(a[i]);
//        }
//        return c;
//    }

//    public int getResult(int n, int m) {
//        // write code here
//        int a = (m-1)%n, num = 0, t = 0, flag = 0;
//        int arr[] = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 1;
//        }
//
//        while (num <n-1) {
//            if (arr[a] == 1) {
//                arr[a] = 0;
//                num++;
//
//                t = 0;
//                while (t < m) {
//                    if (arr[(a+1) % n] == 1) {
//                        t ++;
//                        a = (a + 1) % n;
//                    } else {
//                        a = (a + 1) % n;
//                    }
//                }
//
//            }
//
//        }
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==1){
//                flag=i+1;
//                System.out.println(i+1);
//            }
//
//        }
//        return flag ;
//    }

//    public int func1 (int[] a_times, int[] p_times) {
//        // write code here
//        int a[] =new int[4];
//        Arrays.fill(a,0);
//        int b[] =new int[4];
//        Arrays.fill(b,0);
//        for(int i=0;i<a_times.length;i++){
//            int flag=0;
//            for(int j=0;j<4;j++){
//                if(a[j]==0)
//                    flag=j+1;
//            }
//            if(flag>0){
//                b[i]=
//            }
//        }
//    }

//    public int func1 (int[] list) {
//        // write code here
//        int max=0,length=0,left=0,right=1;
//        for(int i=0;i<list.length;i++){
//            if(list[i]>max)
//                max=list[i];
//        }
//        for(int i=1;i<=max;i++){
//            for(int j=1;j<list.length-1;j++){
//                if(list[j]==i-1){
//                        left=j-1;
//                        while(left>=0){
//                            if(list[left]>=i)
//                                break;
//                            else
//                                left=left-1;
//                        }
//                        right=j+1;
//                        while(right<=list.length-1){
//                            if(list[right]>=i)
//                                break;
//                            else
//                                right=right+1;
//                        }
//                        if(left!=-1&&right!=list.length){
//                        length+=right-left-1;
//                        System.out.println(right-left-1+" "+j);
//                        j+=right-left-1;
//                        }
//                }
//
//            }
//        }
//        return length;
//
//    }
    /*
    *数组最大值即水池的最大高度，从最底层开始算有没有可以盛水的位置，并获取长度，下一次检查位置也跳过相应长度
    * 之后继续查看上一层，直到最高层
    */
public int func1 (int[] block_list, int[] unblock_list) {
        /*
        * 优先判断封禁和解封时间是不是相等，相等则封禁时长不增长，
        * 如果不相等，则优先判断60分钟内有没有封禁，如果有，则时长增加两次封禁的差值，
        * 如果插值大于60则市场增加60
        */
    // write code here
    if(unblock_list==null||unblock_list.length==0) {
        unblock_list = new int[block_list.length];

        for (int i = 0; i < block_list.length; i++) {
            unblock_list[i] = 0;
        }
    }
    if(unblock_list.length<block_list.length){
        int a[]=new int[block_list.length];
        int i=0;
        for(;i<unblock_list.length;i++){
            a[i]=unblock_list[i];
        }
        for(int j=i;j<block_list.length-unblock_list.length-1;j++){
            a[i]=0;
        }
        unblock_list=a;
    }
    for(int i=0;i<unblock_list.length;i++){
        System.out.println(unblock_list[i]);
    }
    int sum=0;
    for(int i=0;i<block_list.length-1;i++){
        if(block_list[i]==unblock_list[i])
            continue;
        if(block_list[i+1]-block_list[i]<60){
            sum+=block_list[i+1]-block_list[i];
        }else{
            if(unblock_list[i]-block_list[i]>0&&unblock_list[i]-block_list[i]<=60)
                sum+=unblock_list[i]-block_list[i];
            else if(unblock_list[i]-block_list[i]!=0)
                    sum+=60;
        }

    }
    if(unblock_list[block_list.length-1]-block_list[block_list.length-1]>0&&unblock_list[block_list.length-1]-block_list[block_list.length-1]<=60)
        sum+=unblock_list[block_list.length-1]-block_list[block_list.length-1];
    else if(unblock_list[block_list.length-1]-block_list[block_list.length-1]!=0)
        sum+=60;
    return sum;
}

    public int[] func1 (int[][] order_list, int n) {

        if(order_list.length==0||n==0)
            return null;
        int t[][] = new int [n][2];
        for(int i=0;i<order_list.length;i++)
        {
            int j;
            for(j=order_list[i][0];j<=order_list[i][1];j++) {
                t[j][0]=j;
                t[j][1] += order_list[i][2];
            }
        }
        int a[] = new int[n];
        for(int i =0;i<n;i++) {
            a[i]=t[i][1];
        }
        return a;
    }



}
