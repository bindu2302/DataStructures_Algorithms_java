
public class Overloading {

	public static void main(String[] args) {
		System.out.println("First method");
	}
	
	public static void main(int[] args) {
		System.out.println("second method");
	}

	public static int main(int x) {
		System.out.println("third method");
		return 10;
	}

	public static void main(int x, int y) {
		System.out.println("Fourth method");
	}


}
