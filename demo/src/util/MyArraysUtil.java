package util;

import java.util.Arrays;

/**
 * MyArrays class
 *
 * @author ZLB
 * @date 2022--07--09
 */
public class MyArraysUtil
{
    //冒泡排序---升序
    public static void intAsc(int[] num){
        //只需比较前n-1个数
        for(int i=0;i<num.length-1;i++){
            //临时变量
            int temp;
            //外循环结束一次，内循环就少比较一个数
            for (int j = 0; j < num.length-1-i; j++)
            {
                //升序
                if(num[j]>num[j+1]){
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }
    //冒泡排序---降序
    public static void intDesc(int[] num){
        //只需比较前n-1个数
        for(int i=0;i<num.length-1;i++){
            //临时变量
            int temp;
            //外循环结束一次，内循环就少比较一个数
            for (int j = 0; j < num.length-1-i; j++)
            {
                //降序
                if(num[j]<num[j+1]){
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }
    //冒泡排序---升序
    public static void doubleAsc(double[] num){
        //只需比较前n-1个数
        for(int i=0;i<num.length-1;i++){
            //临时变量
            double temp;
            //外循环结束一次，内循环就少比较一个数
            for (int j = 0; j < num.length-1-i; j++)
            {
                //升序
                if(num[j]>num[j+1]){
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }
    //冒泡排序---降序
    public static void doubleDesc(double[] num){
        //只需比较前n-1个数
        for(int i=0;i<num.length-1;i++){
            //临时变量
            double temp;
            //外循环结束一次，内循环就少比较一个数
            for (int j = 0; j < num.length-1-i; j++)
            {
                //降序
                if(num[j]<num[j+1]){
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }
}
