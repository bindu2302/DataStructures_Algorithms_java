
public class StringArgs {

	public static void main(String[] args) {
		if(args.length>0) {
			for(int i=0; i<=args.length-1; i++) {
				System.out.println(args[i] + " ");
			}
		} else {
			System.out.println("No arguments were passed");
		}

	}

}
