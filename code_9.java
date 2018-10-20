package clong.jgsu;

public class code_9 {
	public static void main(String[] args) {
		/**
		 * 一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。
		 */
		
		for(int i = 1;i<=1000;i--) {
			int temp = 0;
			for(int n = 1;n<i/2 + 1;n++) {
				if(i % n == 0) {
					temp += n;
				}
			}
			if(temp == i) {
				System.out.println(i + " ");
			}
		}
		
	}
	
	
}
