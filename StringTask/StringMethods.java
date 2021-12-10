package StringTask;

public class StringMethods {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("Welcome To ");

		s.append(" Flipcart");
		System.out.println("StringBuffer Example:" + s);

		StringBuffer deleteCharAt = s.deleteCharAt(6);
		System.out.println(deleteCharAt);

		// stringbuffer//
		int capacity = s.capacity();
		System.out.println(capacity);

		char charAt = s.charAt(5);
		System.out.println(charAt);

		int length = s.length();
		System.out.println(length);

		int indexOf = s.indexOf("W");
		System.out.println(indexOf);

		int lastIndexOf = s.lastIndexOf("y");
		System.out.println(lastIndexOf);

		/*
		 * System.out.println("Length of Stringbuffer:" + s.length());
		 * System.out.println("Contents of Stringbuffer:" + s); // set the length of the
		 * buffer to 5 s.setLength(6); // checking the length and contents after setting
		 * the length System.out.println("New Length of buffer:" + s.length());
		 * System.out.println("New Contents:" + s);
		 */

		System.out.println("String = " + s.toString());

		// set char at index 4 to '0'
		s.setCharAt(7, '#');

		// print string
		System.out.println("After setCharAt() String = " + s.toString());
		System.out.println("================================================================");
		StringBuilder s1 = new StringBuilder("Welcome to ");

		s1.append("Amazon");
		System.out.println("StringBuilder Example:" + s1);

		StringBuilder delete = s1.delete(0, 2);
		System.out.println(delete);

		 StringBuilder insert = s1.insert(4,"order");
		 System.out.println(insert);
		
		 StringBuilder reverse = s1.reverse();
		 System.out.println(reverse);
		
		StringBuilder replace = s1.replace(2, 5,"delivery");
		System.out.println(replace);
		
		

	}
}
