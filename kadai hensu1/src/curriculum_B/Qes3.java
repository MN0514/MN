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
       
        Scanner scanner = new Scanner(System.in); // 入力用のScannerを毎回生成
        while (true) {
            
            System.out.print("数字を入力してください: ");
            int num = scanner.nextInt(); // 整数を入力
            
            if (num == 0) { // 入力が 0 なら終了
                System.out.println("終了しました");
                break; // ループを抜け
            }
        }
        scanner.nextLine();
        //Q3 10
        
        for (int aa = 1; aa<=9 ; aa++) {
        	for (int ab = 1; ab<=9 ; ab++) {
        		int ac = aa*ab;//計算結果
        		if(ab<=8) {
            		System.out.print("|"+String.format("%02d", aa) + "*" + String.format("%02d", ab) +"=" + String.format("%02d", ac) + "|");
            		}
        		else {
        			System.out.println("|"+String.format("%02d", aa) + "*" + String.format("%02d", ab) +"=" + String.format("%02d", ac) + "|");//9を計算したら改行する
        		}//ab=9のとき改行
        		
        	}
        }//Q3 11
        System.out.print("在庫を知りたい商品を入力してください（「、」区切り）: ");
        String input = scanner.nextLine();
        String[] items = input.split("、");
        Random rand = new Random();
        int tvCount = rand.nextInt(12); // 0〜11のランダム値
        int displayCount = 11 - tvCount;
        for (String item : items) {
        	
            switch (item) {
               
                case "パソコン":
                    System.out.println("パソコンの残り台数は" + rand.nextInt(12) + "台です");
                    break;
                case "冷蔵庫":
                    System.out.println("冷蔵庫の残り台数は" + rand.nextInt(12) + "台です");
                    break;
                case "扇風機":
                    System.out.println("扇風機の残り台数は" + rand.nextInt(12) + "台です");
                    break;
                case "洗濯機":
                    System.out.println("洗濯機の残り台数は" + rand.nextInt(12) + "台です");
                    break;
                case "加湿器":
                    System.out.println("加湿器の残り台数は" + rand.nextInt(12) + "台です");
                    break;
                case "テレビ":
                case "ディスプレイ":
                    // 条件演算子を使って出力内容を変える
                    String output = item.equals("テレビ")
                    	? "テレビの残り台数は" + tvCount + "台です"
                        : "ディスプレイの残り台数は" + displayCount + "台です";
                    System.out.println(output);
                    break;
                default:
                    System.out.println(item + "は対象外の商品です");
                    
            }
            
        }
        scanner.close();//scannerを閉じる
        }        
	}



