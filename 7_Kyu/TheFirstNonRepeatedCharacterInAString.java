// https://www.codewars.com/kata/570f6436b29c708a32000826

// You need to write a function, that returns the first non-repeated character in the given string.
//
// If all the characters are unique, return the first character of the string.
// If there is no unique character, return null in JS or Java, None in Python, '\0' in C.
//
// You can assume, that the input string has always non-zero length.
//
// Examples
// "test"   returns "e"
// "teeter" returns "r"
// "trend"  returns "t" (all the characters are unique)
// "aabbcc" returns null (all the characters are repeated)

public class FirstNonRepeated {
    public static Character firstNonRepeated(String source) {
        Map<Character, Integer> counts = new LinkedHashMap<>();

        for (char c : source.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        boolean allUnique = counts.values().stream().allMatch(count -> count == 1);
        if (allUnique) {
            return source.charAt(0);
        }

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }
}