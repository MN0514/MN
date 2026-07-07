package curriculumA;

public class Qes1 {

	public static void main(String[] args) {
		byte byteNum = 0; // byte型の変数byteNumの宣言と初期化
		short shortNum = 0; //short 型の変数shortNumの宣言と初期化
		int intNum = 0; //int型の変数intNumの宣言と初期化
		long longNum = 0L;//long型の変数longNumの宣言と初期化
		float floatNum = 0.0f; //float型の変数floatNumの宣言と初期化
		double doubleNum = 0.0;//double型の変数doubleNumの宣言と初期化
		char letter = '\u0000'; //char型の変数letterの宣言と初期化
		String letters = null;//String型の変数lettersの宣言と初期化
		boolean isBoolean = false;//boolean型の変数isBooleanの宣言と初期化
		//ここまでQes1

		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;
		//ここまでQes2  7.7 変数①

		System.out.println(byteNum + shortNum + intNum + longNum);//11110を出力
		System.out.println(byteNum * 2);//11110を出力
		System.out.println(letter + letters + isBoolean);//a ハロー trueを出力
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum);//小数点表示
		System.out.println(byteNum * shortNum * intNum * longNum);//数字を全て足して出力
		System.out.println(doubleNum / shortNum);//10.5割る100をして出力
		System.out.println(byteNum - shortNum);//10引く100をすして出力
		
		//ここまでQes3  7.8 変数②
		
		String name = null;//name という String型の変数 を宣言
		name = "山田太郎";//name変数に"山田太郎"という値を代入
		System.out.println("こんにちは"+name+"さん！");//name変数を使用してコンソールに こんにちは、山田太郎さん！ と表示してください。
		//ここまでQes4  7.8 変数②
		
		int age = 0 ;//age という int型の変数 を宣言し
		age = 25 ;//age変数に 25 を代入してください。
		System.out.println("年齢:"+age+"歳");//age変数を使用してコンソールに  年齢: 25歳 という表示してください。
		//ここまでQes5  7.8 変数②
		
		
		int num1 = 10;//num1 という int型の変数 を宣言し、10 を代入
		int num2 = 5;//num2 という int型の変数 を宣言し、5 を代入
		int sum =num1+num2;//num1 と num2 を足した結果をsumという変数に代入
		System.out.println(sum);//上記をコンソールに表示
		//ここまでQes6  7.8 変数②
		
		int score = 80;//score という int型の変数 を宣言し、80 を代入
		score = score+20;//score に 20 を加えて、更新する
		System.out.println("最終スコア:"+score);//最終スコア: 100 をscoreを使用してコンソールに表示してください。
		//ここまでQes7  7.8 変数②
		
		
		double price = 99.99 ;//price という double型の変数 を宣言し、99.99 を代入
		int P = (int)price ;//price を int型 に変換
		System.out.println("整数価格:" + P );//整数価格: 99 とコンソールに表示
		//ここまでQes8  7.9 型変換
		
		String numStr = null;//String 型の変数 numStr を宣言
		numStr = "123" ;//変数 numStr に "123" を代入
		int str = Integer.parseInt(numStr); // 文字列を int に変換
		System.out.println(str + 10 );//変換後の値: の後ろにnumStr + 10 した結果をコンソールに表示してください。
		//ここまでQes9  7.9 型変換
		
		int num = 50 ;//int 型の変数 num に 50 を代入
		String stri = String.valueOf(num);//num を String 型に変換
		System.out.println("得点:" + stri + "点" );//"得点: 50点" の形で表示
		
		//ここまでQes10  7.9 型変換
		
		int a = 10 ; //int 型の変数aに10を代入
		int b = 20 ; //int 型の変数bに20を代入
		boolean result = false ; //boolean 変数resultを宣言
		result = a<b; //a が b より小さいかどうかを boolean 変数 result に代入
		System.out.println(result); //result の値を表示
		
		//ここまでQes11 7.10	真偽値と条件式
		
		int x = 15;//int 型の変数 x に 15 を代入
		if(x > 10) {
			System.out.println("OK"); //x が 10 以上なら "OK"を表示
		}
		else {
			System.out.println("NG");//そうでなければ "NG" を表示
			
		}
		
		//ここまでQes12 7.10	真偽値と条件式
		
		String text = "私はJavaが好きです。Javaは楽しい！";
			
		System.out.println(text.replace("Java","Python"));//String型の変数textを文章の中にある「Java」を「Python」に置き換えて表示
		
		//ここまでQes13 7.10	真偽値と条件式
		
	}

}
