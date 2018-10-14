package clong.jgsu;

import java.util.Scanner;

public class code_5 {

	public static void main(String[] args) {
		/**
		 * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
		 */
		
			System.out.println("    请输入成绩：");
	
	        Scanner sc = new Scanner(System.in);
	
	        int sort = sc.nextInt();
		
		    if(sort >=90){
		
		        System.out.println("A");
		
		    }else if(sort<60){
		
		        System.out.println("C");
		
		    }else{
		
		        System.out.println("B");
		
		    }
	}
}
