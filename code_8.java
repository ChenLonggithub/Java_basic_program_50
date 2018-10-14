package clong.jgsu;

import java.util.Scanner;

public class code_8 {
	public static void main(String[] args) {
		/**
		 * 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数
		 * 相加)，几个数相加有键盘控制。输出结果的形式如：2+22+222=246；
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入基数");
		int cardinalNumber = input.nextInt();
		System.out.println("请输入相加的次数");
		int count = input.nextInt();
		int sum = getSum(cardinalNumber, count);
		System.out.println("sum = " + sum);
	}

	public static int getSum(int cardinal, int count) {
		int sum = 0;
		int num = cardinal;
		for (int i = 1; i <= count; i++) {
			sum += num;
			num = num * 10 + cardinal;// 每轮循环过后num都会变大10倍
		}
		return sum;
	}

}
