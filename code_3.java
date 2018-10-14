package clong.jgsu;

public class code_3 {

	public static void main(String[] args) {
		/**
		 * 打印出所有的"水仙花数"，所谓"水仙花数是指一个三位数，其各位数字立方和等于该数本身。
		 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
		 */
		int sum = 0;
        for (int i = 100; i<=1000;i++){
        	int i1 = i / 100;
        	int i2 = i % 100 / 10;
        	int i3 = i % 10;
        	int sum1 = i1*i1*i1+i2*i2*i2+i3*i3*i3;
        	if(i == sum1){
        	System.out.println(i + " 是水仙花数！");
        	}
        }
	}
}

