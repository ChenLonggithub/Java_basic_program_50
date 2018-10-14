package clong.jgsu;

import java.util.Scanner;

public class code_4 {
	public static void main(String[] args) {
		/**
		 * 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
		 */
		Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数:");  
        int num = sc.nextInt();
        //int num = 90;
        int n = 2;
        System.out.print(num + "=");//输出你要分解的数
        while (num > n) {//初值n为2,在程序执行的过程中n渐渐变大(n++),n渐渐变小(num/n)
            if (num % n == 0) {
                System.out.print(n + "×");
                num = num / n;//num除以n的商,作为新的正整数你num
            }else if (num % n != 0) {
                n++;
            }
        }
        System.out.println(n);
	}

}
