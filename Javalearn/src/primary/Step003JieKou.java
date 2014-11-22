//2014-11-21
package primary;

import java.util.Scanner;



public class Step003JieKou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	写出一个boolean类型接口
		 	依赖键盘记录器实现比较输入的两个数据是否一致
		 	如果一致。输出“你所输入的两个数字一致”
		 	如果不一致，输出“你所输入的两个数字不一致”		 	
		*/
			Scanner sc = new Scanner(System.in);
			//第一次这里是  double a = sc.nextInt();
			//一开始没有报错，录入整数时也没有报错，直到录入小数时报错
			//sc.next后可以根据数据类型选择
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			//原本写此代码时没有加下面的代码，但是提示黄色感叹号警告：
			//“Resource leak: 'sc' is never closed”
			sc.close();
			
				boolean z = justice(a, b);
			 	if(z){
				System.out.println("你所输入的两个数字一致");
			}else{
				System.out.println("你所输入的两个数字不一致");
			}
			
			
			
			
			
	}
	
	
	public static boolean justice(double x , double y){
		
		//以下是我自己写的，比较繁琐
		//boolean  result =  (x==y);
		//return result;
		
		//以下是最终简化版（原理同上）
		return x==y;
		
		
	}

}
