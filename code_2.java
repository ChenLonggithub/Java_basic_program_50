package clong.jgsu;

public class code_2 {
	
	public static void main(String[] args) {
		
		/**
		 * 题目：判断101-200之间有多少个素数，并输出所有素数。
		 */
        // 外层循环，遍历100-200之间的数
        for (int i = 100; i <= 200; i++) {
            // 对100-200之间的每一个数进行遍历
            // 质数，正整数，除了1和它本身之外，不能被任何中间数整除
            boolean flag = true; // false 不是 质数，true是质数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    // 不是质数
                    flag = false;
                    break;
                }
            }
            // 不管是不是质数，都会执行到这里
            // 可以根据flag这个标志来判断是否是质数
            if (flag) {
                System.out.println(i + "是质数");
            }
        }
	
}
}
