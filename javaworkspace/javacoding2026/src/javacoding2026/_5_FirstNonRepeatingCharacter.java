package javacoding2026;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _5_FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String input = "roster";

		Optional<Character> firstNonRepeating = input.chars() // Stream of int (ASCII codes)
				.mapToObj(c -> (char) c) // Convert int to Character object
				.collect(Collectors.groupingBy( // Group characters and count frequencies
						Function.identity(), LinkedHashMap::new, // Maintains insertion order
						Collectors.counting()))
				.entrySet().stream() // Stream the map entries
				.filter(entry -> entry.getValue() == 1) // Filter characters with a count of 1
				.map(entry -> entry.getKey()) // Map to the character key
				.findFirst(); // Get the first match

		// Output the result
		if (firstNonRepeating.isPresent()) {
			System.out.println("First non-repeating character is: " + firstNonRepeating.get());
		} else {
			System.out.println("No non-repeating character found.");
		}
	}

}
