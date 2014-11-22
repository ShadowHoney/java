//2014-11-21
package primary;

public class Step002JiuJiuChengFaBiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	想要输出一个99乘法表，诸如以下形式：
			1*1=1
			1*2=2	2*2=4
			1*3=3	2*3=6	3*3=9
			…………
			1*9=9	2*9=18	3*9=27	4*9=36	…………	9*9=81
			
			A：首先根据观察，每一行输出的公式个数与列数相同
			B：其次，a*b=c中，a为这一行所在的公式的个数，b为这一行的列数
			
		*/
		for(int x = 1 ; x <= 9 ; x++){
			for(int y = 1 ; y <= x ; y++){
				System.out.print(y + "*" + x + "=" + (y * x) + "\t");
			}
			System.out.println();
		}

	}

}
