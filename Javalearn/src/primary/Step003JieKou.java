//2014-11-21
package primary;

import java.util.Scanner;



public class Step003JieKou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	д��һ��boolean���ͽӿ�
		 	�������̼�¼��ʵ�ֱȽ���������������Ƿ�һ��
		 	���һ�¡�����������������������һ�¡�
		 	�����һ�£����������������������ֲ�һ�¡�		 	
		*/
			Scanner sc = new Scanner(System.in);
			//��һ��������  double a = sc.nextInt();
			//һ��ʼû�б���¼������ʱҲû�б���ֱ��¼��С��ʱ����
			//sc.next����Ը�����������ѡ��
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			//ԭ��д�˴���ʱû�м�����Ĵ��룬������ʾ��ɫ��̾�ž��棺
			//��Resource leak: 'sc' is never closed��
			sc.close();
			
				boolean z = justice(a, b);
			 	if(z){
				System.out.println("�����������������һ��");
			}else{
				System.out.println("����������������ֲ�һ��");
			}
			
			
			
			
			
	}
	
	
	public static boolean justice(double x , double y){
		
		//���������Լ�д�ģ��ȽϷ���
		//boolean  result =  (x==y);
		//return result;
		
		//���������ռ򻯰棨ԭ��ͬ�ϣ�
		return x==y;
		
		
	}

}
