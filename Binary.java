/**
 * 
 * Given a number say which is the next smallest and next largest number, which
 * has the same number of 1's and 0's in its binary representation.
 * 
 * Example : Input 5 Output 6 3
 */
public class Binary {

	public static int convertArrayToInt(int[] bits, int length) {
		int aux = 0;

		for (int i = length - 1; i >= 0; i--) {
			aux = aux * 10 + bits[i];
		}

		return aux;

	}

	public static int[] convertDecimalToBinary(int nr) {

		int bits[] = new int[32];
		int length = 0;

		while (nr != 0) {
			bits[length] = nr % 2;
			nr /= 2;
			length++;
		}

		int aux[] = new int[length];

		for (int i = 0; i < length; i++) {
			aux[i] = bits[i];
		}

		return aux;

	}
	public static int pow(int x, int y) {
	
		int nr = 1;
		
		for(int i = 1; i<=y ;i++) {
			nr = nr*x;
		}
		return nr;
	}
	
	public static int convertBinaryToDecimal(int nr) {
        
		int aux = 0;
		int i = 0;
		while(nr!=0) {
	     aux = aux + pow(2,i)*nr%10;
	     nr/=10;
	     i++;
		}
		return aux;
	}

	public static int smallest(int nr) {

		int bits[] = convertDecimalToBinary(nr);

		int position0 = -1;
		for (int i = 0; i < bits.length; i++) {

			if (bits[i] == 0) {
				position0 = i;
			} else if (bits[i] == 1&& position0!=-1) {
				bits[i] = 0;
				bits[position0] = 1;
				break;
			}
		}

		int aux = convertArrayToInt(bits, bits.length);

		return aux;
	}

	public static int largest(int nr) {

		int bits[] = convertDecimalToBinary(nr);

		int position1 = -1;
		for (int i = 0; i < bits.length; i++) {

			if (bits[i] == 1) {
				position1 = i;
			} else if (bits[i] == 0 && position1 !=-1) {
				bits[i] = 1;
				bits[position1] = 0;
				break;
			}
		}

		int aux = convertArrayToInt(bits, bits.length);

		return aux;
	}

	public static void main(String[] args) {

		System.out.println(smallest(9) + " " + convertBinaryToDecimal(smallest(9)));
		System.out.println(largest(9)  + " " + convertBinaryToDecimal(largest(9)));
	}

}
