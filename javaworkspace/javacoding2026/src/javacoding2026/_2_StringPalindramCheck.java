package javacoding2026;

public class _2_StringPalindramCheck {

	public static void main(String[] args) {
		String str = "racecar";
		System.out.println(isPalindromCheck(str));
	}

	public static boolean isPalindromCheck(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;

			}
			left++;
			right--;
		}
		return true;

	}
}
