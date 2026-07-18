// https://www.codewars.com/kata/59e9f404fc3c49ab24000112

// Make your strings more nerdy: Replace all 'a'/'A' with 4, 'e'/'E' with 3 and 'l' with 1 e.g. "Fundamentals" --> "Fund4m3nt41s"

class Nerd {
    //1st Solution
    public static String nerdify(String txt){
        return txt.replaceAll("[aA]", "4").replaceAll("[eE]", "3").replaceAll("[l]", "1");
    }

    //2nd Solution
    public static String nerdify(String txt){
        char[] chars = txt.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'e' || chars[i] == 'E') chars[i] = '3';
            else if (chars[i] == 'a' || chars[i] == 'A') chars[i] = '4';
            else if (chars[i] == 'l') chars[i] = '1';
        }
        return new String(chars);
    }
}