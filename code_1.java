package clong.jgsu;

import java.util.Scanner;

public class code_1 {
	
	public static void main(String[] args) {
	/**
	 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
	 * 假如兔子都不死，问每个月的兔子对数为多少？
	 */
		System.out.println("请输入你想知道得月数的兔子对数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        System.out.println("当月份为"+a+"时对应的兔子数为："+fun(a));
}
      public static int fun(int b){
        if(b == 1|| b == 2){
          return 1;
        }else{
          return fun(b-1)+fun(b-2);
      }
    }
}
