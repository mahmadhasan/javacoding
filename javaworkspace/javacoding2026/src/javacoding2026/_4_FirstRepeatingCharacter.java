package javacoding2026;

import java.util.HashSet;
import java.util.Set;

public class _4_FirstRepeatingCharacter {

	public static void main(String[] args) {
		String input = "programming";

		Set<Character> seen = new HashSet<Character>();
		
		input.chars().mapToObj(c -> (char) c).filter(c -> !seen.add(c)).findFirst().get();
		
		System.out.println(seen);

	}

}
