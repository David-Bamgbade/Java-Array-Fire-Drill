public class ArrayOutput {

public static int[] doubleArray(int[] numbers){

int[] david = new int[numbers.length * 2];

for (int i = 0; i < numbers.length; i++){
david[i] = numbers[i]; 
david[i + 3] = numbers[i] * 2;
}

 return david;
}
   
}