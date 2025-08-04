package curriculumA;

public class Qes1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
byte byteNum = 10; // byte型の変数byteNumの宣言と初期化
short shortNum = 10; //short 型の変数shortNumの宣言と初期化
int intNum = 10; //int型の変数intNumの宣言と初期化
long longNum = 10;//long型の変数longNumの宣言と初期化
float floatNum = 10; //float型の変数floatNumの宣言と初期化
double doubleNum = 10;//double型の変数doubleNumの宣言と初期化
char letter = '7'; //char型の変数letterの宣言と初期化
String letters = "初期値";//String型の変数lettersの宣言と初期化
boolean isBoolean = false;//boolean型の変数isBooleanの宣言と初期化
//ここまでQes1

byteNum = 10;
shortNum = 100;
intNum = 1000;
longNum = 10000;
floatNum = 9.5f;
doubleNum = 10.5;
letter = 'a' ;
letters = "ハロー";
isBoolean = true ;
//ここまでQes2 、7.7	変数①　

System.out.println(byteNum+shortNum+intNum+longNum);
System.out.println(byteNum*2);
System.out.println(letter+letters+isBoolean);
System.out.println(byteNum+shortNum+intNum+longNum+floatNum+doubleNum);//小数点表示
System.out.println(byteNum*shortNum*intNum*longNum);
System.out.println(doubleNum/shortNum);
System.out.println(byteNum-shortNum);
	}

}
