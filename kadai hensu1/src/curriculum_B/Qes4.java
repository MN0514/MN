package curriculum_B;
import java.util.Scanner;
public class Qes4 {

	public static void main(String[] args) {
		int[] scores1 = {1,2,3,4,5};
		int sum = 0;
		for(int a = 0; a < scores1.length; a++){ //.lengthで配列の長さ分だけ繰り返す
			System.out.println("scores1["+ a +"]の値：" + scores1[a]);
			
			}
		//Qe4 1
		
		int[] scores2 = {10,20,30,40,50};
		for(int b = scores2.length -1 ; b >= 0 ; b--){ //.lengthで配列の長さ分だけ繰り返す
			System.out.println("scores2["+ b +"]の値：" + scores2[b]);
			
			}
		
		//Qe4 2
		
		int sum2=0;
		int[] scores3 = {3,5,7,9,11};
		for(int c = 0 ; c < scores3.length  ; c++){ //.lengthで配列の長さ分だけ繰り返す
			
			sum2 += scores3[c];//要素の合計値
			}
		
		System.out.println(sum2);
		//Qe4 3
		
		int[] scores4 = {12,7,9,21,5,18}; 
		int max = 0 ;
		int min = 10000000 ;
		for(int d = 0 ; d < scores4.length  ; d++){ //.lengthで配列の長さ分だけ繰り返す
			
			
			if(max <= scores4[d]){
				max = scores4[d];
			}
			if(min >= scores4[d]){
				min = scores4[d];
			}
			
			
		}
		System.out.println("配列の 最大値は"+max+"最小値は"+min );
		
		
		
		//Qe4 4
		
		int[] scores5 = {1,2,3,4,5};
		for (int i = 0; i < scores5.length; i++) {
			scores5[i] = scores5[i] * 2;
		}// 各要素を2倍にする
		 for (int score5 : scores5) {
	            System.out.println(score5);
	        }//配列の すべての要素を表示 
		//Qe4 5
		
		int[] scores6 = {4,7,10,15,20};
		Scanner scanner = new Scanner(System.in);
        System.out.print("数値を入力してください: ");
        int input = scanner.nextInt();
        boolean found = false;
        for (int score6 : scores6) {   
            if (score6 == input) {
                found = true;
                break;
            }
        }//入力結果の判定
        if (found) {
            System.out.println(input + " は配列に含まれています。");
        } else {
            System.out.println(input + " は配列に含まれていません。");
        }//判定結果を表示

        scanner.close();
        
        
		//Qe4 6
		
		
		
		
		//int[] scores = {,,,,};
	}
}

