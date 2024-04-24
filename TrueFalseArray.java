public class TrueFalseArray {

public static boolean[] bools(int[] number) {

boolean[] trueFalse = new boolean[number.length];

for(int i = 0; i < trueFalse.length; i++) {

trueFalse[i] = number[i] % 2 != 0;


	
	}


	 return trueFalse;
      
}


}
