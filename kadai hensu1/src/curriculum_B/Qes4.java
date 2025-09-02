package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		int[] scores1 = {1,2,3,4,5};
		int sum = 0;
		for(int a = 0; a < scores1.length; a++){ //.lengthで配列の長さ分だけ繰り返す
			System.out.println("scores1["+ a +"]の値：" + scores1[a]);
			sum += scores1[a];
			}
		//Qe4 1
		
		int[] scores2 = {10,20,30,40,50};
		for(int b = 4; b < scores2.length; b--){ //.lengthで配列の長さ分だけ繰り返す
			System.out.println("scores2["+ b +"]の値：" + scores2[b]);
			sum -= scores1[b];
			}
		//Qe4 2
		
		
		int[] scores3 = {3,5,7,9,11};
		
		//Qe4 3
		
		int[] scores4 = {12,7,9,21,5,18}; 
		
		//Qe4 4
		
		int[] scores5 = {1,2,3,4,5};
		
		//Qe4 5
		
		int[] scores6 = {4,7,10,15,20};
		
		//Qe4 6
		
		
		
		
		//int[] scores = {,,,,};
	}

}
