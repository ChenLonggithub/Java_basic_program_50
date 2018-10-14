package clong.jgsu;

import java.util.Scanner;

public class code_7 {
	
	public static void main(String[] args) {
		/**
		 * 输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。
		 */
		System.out.println("请输入一行字符：");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ss[] = s.toCharArray();
        
        int str_sum = 0;
        int int_sum = 0;
        int other_sum = 0;
        for(int i=0;i<ss.length;i++){
            if(ss[i]>=48&&ss[i]<=57){
                int_sum++;
            }else if((ss[i]>=65&&ss[i]<=90)||(ss[i]>=97&&ss[i]<=122)){
                str_sum++;
            }else{
                other_sum++;
            }
        }
        System.out.println("char个数："+str_sum+"数字个数："+int_sum+"其他个数："+other_sum);

	}

}
