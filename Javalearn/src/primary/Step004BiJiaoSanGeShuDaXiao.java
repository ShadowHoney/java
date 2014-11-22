//2014-11-22
package primary;

import java.util.Scanner;

public class Step004BiJiaoSanGeShuDaXiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		double a = sc.nextDouble();	
		System.out.println("请输入第二个数");
		double b = sc.nextDouble();
		System.out.println("请输入第三 个数");
		double c = sc.nextDouble();
		sc.close();
		
		double result = getMax(a, b, c);
		
		System.out.println("三个数中最大的是：" + result);
		
		
	}
	
	public static double getMax(double a , double b ,double c){
		/*	
		 
		 if(a > b){
			if(a > c)
				return a;
			else
				return c;
		}else{
			if(b > c)
				return b;
			else
				return c;
		}
		
		*/
		
		//三元运算符，要灵活运用啊！！！如果if，else只有一个语句，那就用三元运算符
		 double result = (a > b)?((a > c)?a:c):((b > c)?b:c);
		 return result;
	}

}
