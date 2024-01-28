package day08_practice_string;

public class UniqueCharacters1 {
    public static void main(String[] args) {
        String str = "aabcccd";

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                // if the first time the character has occurred in the string is also the last time it occurred, then the character is unique
                unique += ch;
            }
        }
        System.out.println(unique);

    }
}
