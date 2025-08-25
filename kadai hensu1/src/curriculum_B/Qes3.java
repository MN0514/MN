package curriculum_B;
import java.util.Random;
import java.util.Scanner;
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
        
        
        int counta = 1 ;//int型変数　countaの初期値を宣言
        while (counta <= 10 ) {
        	System.out.println(counta);//counta変数を表示
        	counta++ ;//countaの値を+1
        }////Q3 6
        
        int countb = 2 ;//int型変数　countbの初期値を宣言
        while (countb <= 20 ) {
        	System.out.println(countb);//countb変数を表示
        	countb += 2 ;//countの値を+2
        }//Q3 7
        
        int countc = 10 ;//int型変数　countcの初期値を宣言
        while (countc >=1 ) {
        	System.out.println(countc);//countc変数を表示
        	countc -- ;//countの値を-1
        	}//Q3 8
        
        int countd = 1;//int型変数　countdの初期値を宣言
        int countdd = 0;
        while (countd <=100 ) {
        	countdd +=countd; 
        	countd ++ ;//counddtの値を+1
        	}
        System.out.println(countdd);//countdd変数を表示
        
        //Q3 9
        
        while (true) {
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("数字を入力してください: ");
        	int name = scanner.nextInt();//整数の入力
        	if (name == 0) {//終了条件の定義
        	System.out.println("終了しました");
        	//scanner.close();//scannerを閉じる
        	break;//ループを閉じる
        	}
        }//Q3 10
        
        for (int aa = 01; aa<=9 ; aa++) {
        	for (int ab = 01; ab<=9 ; ab++) {
        		int ac = aa*ab;//計算結果
        		if(ab<=8 && ac < 10) {
        		System.out.print("|0"+ aa + "*0" + ab +"=" + "0" + ac + "|");
        		}//計算結果が一桁のとき02のように0を出力するようにする
        		else if(ab<=8 && ac >= 10) {
            		System.out.print("|0"+ aa + "*0" + ab +"=" + ac + "|");
            		}
        		else if(ab == 9 && ac<= 10) {
            		System.out.println("|0"+ aa + "*0" + ab +"=" + "0" + ac + "|");
            		}//ab=9のとき改行かつ計算結果が一桁のとき02のように0を出力するようにする
        		else {
        			System.out.println("|0"+ aa + "*0" + ab +"=" + ac + "|");//9を計算したら改行する
        		}////ab=9のとき改行
        		
        	}
        }//Q3 11
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("在庫を知りたい家電: ");
        String goods = scanner.nextLine();//在庫数を知りたい家電を入力

        int zaikopc = random.nextInt(12);//在庫数を0～11でランダム生成
        int zaikorei = random.nextInt(12);//在庫数を0～11でランダム生成
        int zaikosenpu = random.nextInt(12);//在庫数を0～11でランダム生成
        int zaikosenta = random.nextInt(12);//在庫数を0～11でランダム生成
        int zaikokasi = random.nextInt(12);//在庫数を0～11でランダム生成
        int zaikotv = random.nextInt(12);//在庫数を0～11でランダム生成
        int zaikodis = 11-zaikotv;//ディスプレイとテレビの合計在庫数を11にする
        switch(goods) {
        case "パソコン":
        	System.out.println(goods + "の残り台数は"+ zaikopc +"台です");
        	break;
        case "冷蔵庫":
        	System.out.println(goods + "の残り台数は"+ zaikorei +"台です");
        	break;
        case "扇風機":
        	
        	System.out.println(goods + "の残り台数は"+ zaikosenpu +"台です");
        	break;
        case "洗濯機":
        	
        	System.out.println(goods + "の残り台数は"+ zaikosenta +"台です");
        	break;
        case "加湿器":        	
        	System.out.println(goods + "の残り台数は"+ zaikokasi +"台です");
        	break;
        case "テレビ":
        	System.out.println(goods + "の残り台数は"+ zaikotv +"台です");
        	break;
        case "ディスプレイ":        	
        	System.out.println(goods + "の残り台数は"+ zaikodis +"台です");
        	break;
       	default:
       		System.out.println("『"+ goods + " 』は指定の商品ではありません");
       		break;
        }
        
        
	}
}
