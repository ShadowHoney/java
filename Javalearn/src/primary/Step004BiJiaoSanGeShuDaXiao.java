//2014-11-22
package primary;

import java.util.Scanner;

public class Step004BiJiaoSanGeShuDaXiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����");
		double a = sc.nextDouble();	
		System.out.println("������ڶ�����");
		double b = sc.nextDouble();
		System.out.println("��������� ����");
		double c = sc.nextDouble();
		sc.close();
		
		double result = getMax(a, b, c);
		
		System.out.println("�������������ǣ�" + result);
		
		
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
		
		//��Ԫ�������Ҫ������ð����������if��elseֻ��һ����䣬�Ǿ�����Ԫ�����
		 double result = (a > b)?((a > c)?a:c):((b > c)?b:c);
		 return result;
	}

}
