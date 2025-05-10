
public class Accessing_command_lineArgument {
	public static void main(String[] args) {
		System.out.println("Number of arguments: " + args.length);
		for(int i=0; i<=args.length-1; i++) {
			System.out.println("Arguments " + i + ": " + args[i]);
		}
	}
}
