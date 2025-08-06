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

		System.out.println(byteNum + shortNum + intNum + longNum);
		System.out.println(byteNum * 2);
		System.out.println(letter + letters + isBoolean);
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum);//小数点表示
		System.out.println(byteNum * shortNum * intNum * longNum);
		System.out.println(doubleNum / shortNum);
		System.out.println(byteNum - shortNum);
	}

}
