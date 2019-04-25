
public class App {

	public static void main(String[] args) {

		Stack s = new Stack(100);

		String posTFix = "243*+";

		System.out.println(posTFix);

		int result = s.posfixeval(posTFix);

		System.out.println(result);

	}
}
