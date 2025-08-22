package curriculum_B;

public class Qes3 {

	public static void main(String[] args) {
		for(int a = 1 ; a <=  10 ; a++) {
			System.out.println(a);
		}//for 文を使って 1 から 10 までの数字を 1 つずつ表示
		//Q3 1
		  
		for(int b = 2 ;  b <=  20 ; b += 2) {
			System.out.println(b);
		}//for 文を使って 2 から 20 までの 偶数 を 1 つずつ表示
		//Q3 2
		
		for(int c = 10 ;  c >=  1 ; c-- ) {
			System.out.println(c);
		}//for 文を使って 10 から 1 まで カウントダウンして表示
		//Q3 3
		
		int dd = 0;
		for(int d = 1 ;  d <=  100 ; d++ ) {
			dd += d;
		};//1 から 100 までを合計
		System.out.println(dd);// 合計値を表示
		//Q3 4
		
		
		int e = 5; // 三角形の高さ

        for (int ee = 1; ee <= e; ee++) {
            
        	for (int eee = 1; eee <= ee; eee++) {
                System.out.print("*");
            }// アスタリスクを出力
            
            for (int eeee = 1; eeee <= e - ee; eeee++) {
                System.out.print(" ");
            }// 空白を出力
            
            System.out.println(); // 改行
        }//Q3 5
        
	}
}
