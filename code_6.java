package clong.jgsu;

import java.util.Scanner;

public class code_6 {
	public static void main(String[] args) {
		/**
		 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
		 */
		System.out.println("请输入两个整数：");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int bigDivisor = 0;
        int multiple = 0;
        int sum = a*b;

        int temp = 0;

        if(b>a){
            temp  = a;
            a = b;
            b = temp;
        }

        while(temp!=0){
            temp = a%b;
            a = b;
            b = temp;
        }

        bigDivisor = a;

        multiple = sum/bigDivisor;

        System.out.println("最大公约数："+bigDivisor);
        System.out.println("最小公倍数："+multiple);

        sc.close();
	}

}
