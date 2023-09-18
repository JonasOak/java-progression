package funcoesStrings;

public class FuncaoString {

	public static void main(String[] args) {
		String s = "potato apple lemon orange";
		String[] vect = s.split("a");

		String original = "abcde FGHIJ abc DEFG    ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy"); 
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		System.out.printf("Original: -%s-\ntoLowerCase: -%s-\ntoUpperCase: -%s-\nTrim: -%s-\n"
				+ "substring(2): -%s-\nsubstring(2, 9): -%s-\nreplace('a', 'x'): -%s-\n"
				+ "replace('abc', 'xy'): -%s-\nIndex of 'bc': %s\nLast index of 'bc': %s\n"
				+ "%s%s%s%s", original, s01, s02, s03, s04, s05, s06, s07, i, j, vect[0], vect[1], vect[2], vect[3]);
	}

}
