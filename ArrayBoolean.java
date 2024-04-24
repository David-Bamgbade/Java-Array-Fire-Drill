public class ArrayBoolean {

public static int[] bools() {

int[] bool = {4,5,8,8,8,2,9};

for (int i = 0; i < bool.length; i++) {

	if (bool[i] % 2 == 0)
	bool[i] = 0;

	else if (bool[i] % 2 == 1) {	
	 bool[i] = 1;
	}

}
	 return bool;
      


}
}

	