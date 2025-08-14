package curriculum_B;

public class Qes2 {

	public static void main(String[] args) {
		
		int score = 75;//int 型の変数 score に 75 を代入
		if(score >= 60) {
			System.out.println("合格です！");
		}//score が 60 以上なら "合格です！" と表示
		
		//課題7.11 if型反復処理 Qes1 
		
		int age = 25;//int 型の変数 age に 25 を代入
		if (age >=20 && age<=30) {
			System.out.println("適性年齢です");
		}//age が 20 以上 30 以下なら "適正年齢です" と表示
		else{
			System.out.println("対象外です");
		}//それ以外の場合は "対象外です" と表示
		
		//課題7.11 if型反復処理 Qes2
		
		age = 18;
		if (age >=20) {
			System.out.println("成人です");
		}//age が 20 以上 30 以下なら "適正年齢です" と表示
		else if(age >=13 && age <=19){
			System.out.println("ティーンエイジャーです");
		}
		else{
			System.out.println("子供です");
		}
		
		
		//課題7.11 if型反復処理 Qes3
		
		int x = 30;
		int y = 15;
		int z = 50;//int 型の変数 x, y, z に 30, 15, 50 を代入
			
		if (x > y && x > z) {
			System.out.println(x);
		}
		else if(y > x && y > z){
			System.out.println(y);
		}
		else{
			System.out.println(z);
		}//一番大きい数値を判定して表示
		
		
		//課題7.11 if型反復処理 Qes4
		
		int num = 0;
		if (num>0) {
			System.out.println("正の数です");
		}//age が 20 以上 30 以下なら "適正年齢です" と表示
		else if(num == 0 ){
			System.out.println("0です");
		}
		else{
			System.out.println("負の数です");
		}
		//課題7.11 if型反復処理 Qes5
		
		int value = 55;
		if (value % 2 != 0) {
			System.out.println("奇数です");
		}//value が 偶数 なら "偶数です" と表示
		else{
			System.out.println("偶数です");
		}//value が 奇数 なら "奇数です" と表示
		
			score = 50 ;///課題7.11 if型反復処理 Qes1 で宣言したscoreに50を代入
			if (score >= 90) {
				System.out.println("優");
			}//90 以上なら "優"
			else if(score >= 70 && score < 90 ){
				System.out.println("良");
			}//70 以上なら "良"
			else if(score >= 50 && score < 70 ){
				System.out.println("可");
			}//50 以上なら "可"
			else{
				System.out.println("不可");
			}//50 未満なら "不可"　を表示
			//課題7.11 if型反復処理 Qes7
			
			String input = "" ;//変数　inputwp宣言
			if(input == null || input.isEmpty()) {
				System.out.println("入力は無効です");
			}//入力が null または空文字（""）のときに「入力が無効です」と表示する
			//課題7.11 if型反復処理 Qes8
	}
	
		
}

