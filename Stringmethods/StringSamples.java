package Stringmethods;

public class StringSamples {
	public static void main(String[] args) {
		String name1 ="UmaMurugan";
		String name2="AnanyaRamesh";
		
		int length = name1.length();
		System.out.println(length);
		
		boolean startsWith = name2.startsWith("A");
		System.out.println(startsWith);
		
		boolean endsWith = name1.endsWith("n");
		System.out.println(endsWith);
		
		String upperCase = name1.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = name1.toLowerCase();
		System.out.println(lowerCase);
		
		int indexOf = name1.indexOf("M");
		System.out.println(indexOf);
		
		int lastIndexOf = name1.lastIndexOf("n");
		System.out.println(lastIndexOf);
		
		char charAt = name1.charAt(8);
		System.out.println(charAt);
		
		boolean empty = name1.isEmpty();
		System.out.println(empty);
		
		boolean contains = name1.contains("h");
		System.out.println(contains);
		
		boolean equals = name1.equals(name2);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = name1.equalsIgnoreCase(name2);
		System.out.println(equalsIgnoreCase);
		
		String replace = name1.replace("Uma", "Vihana");
		System.out.println(replace);
		
		String replaceAll = name1.replaceAll("Mu", "@@");
		System.out.println(replaceAll);
		
		String substring = name1.substring(1);
		System.out.println(substring);
		
		String substring2 = name1.substring(0, 4);
		System.out.println(substring2);
		
		String concat = name1.concat(name2);
		System.out.println(concat);

		String trim = name1.trim();
		System.out.println(trim);
		
		
		
		
	}
}
