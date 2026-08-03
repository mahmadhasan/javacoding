package javacoding2026;

public class _3_RotationaOfStrings {

	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "CDAB";
		if (isRotation(s1, s2)) {
			System.out.println("Strings are rotation......");
		} else {
			System.out.println("String are not rotation....");
		}
	}

	public static boolean isRotation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		String concatenated = s1 + s1;
		return concatenated.contains(s2);
	}

}
