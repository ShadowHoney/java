//2014-11-21
package primary;

public class Step002JiuJiuChengFaBiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	��Ҫ���һ��99�˷�������������ʽ��
			1*1=1
			1*2=2	2*2=4
			1*3=3	2*3=6	3*3=9
			��������
			1*9=9	2*9=18	3*9=27	4*9=36	��������	9*9=81
			
			A�����ȸ��ݹ۲죬ÿһ������Ĺ�ʽ������������ͬ
			B����Σ�a*b=c�У�aΪ��һ�����ڵĹ�ʽ�ĸ�����bΪ��һ�е�����
			
		*/
		for(int x = 1 ; x <= 9 ; x++){
			for(int y = 1 ; y <= x ; y++){
				System.out.print(y + "*" + x + "=" + (y * x) + "\t");
			}
			System.out.println();
		}

	}

}
