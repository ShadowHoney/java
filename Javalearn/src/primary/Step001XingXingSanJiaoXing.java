//2014-11-21
package primary;

public class Step001XingXingSanJiaoXing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	       	想要输出一个如下所示的图案：
		 	*
		 	**
		 	***
		 	****
		 	*****
	  
		 */
	
		//观察可得，每一行的*数量与列数相同，所以，定义一个x为列数，再定义一个y代表本行的*数量，当y=x时，换行
	
			for(int x = 0 ; x < 5 ; x++){
					for(int y = 0 ; y <= x ; y++){
						System.out.print("*");
					}
				System.out.println();
			}
	

	}

}
