
public class Arrays {

	public static void main(String[] args) {
		int[] ints = { 10 };

		System.out.println(ints[0]);
		
		int[] emptyInts = new int[10];
		
		for (int i = 0; i < emptyInts.length; i++) {
			System.out.println(emptyInts[i] + ", ");
		}
		
		String[] strings = {"aaa", "bbb"};
		for (String s : strings) {                     // uzraksti foreach lai palaistu shortcut
			System.out.println(s + ", ");
		}
		
		String input = "a, t, t, asd, tasda, asda, ";
		String [] chars = input.split(",");
		for (String s : chars) {
			System.out.println("part: '" + s.trim() + "'");
		}
		
		
		
	}

}
