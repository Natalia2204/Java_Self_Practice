package weekMoning;

public class CountTheWord {
    public static void main(String[] args) {

        String str = "java Python Python JAVA Java jAvA python jAvA Python Java";
        String word = "java";


        int indexWord = str.toLowerCase().indexOf("java");
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.toLowerCase().contains(word)) {
                indexWord = str.toLowerCase().indexOf(word);
                str = str.substring(indexWord + word.length());
                count++;
            }
        }
        System.out.println(count);


    }

}
/*
2. Create a class named CountTheWord. Given the following two String variables:
            str
            word

    Write a program that counts how many times the given word has appeared in the string `str`.

            Example:
                str = "java JAVA Java jAvA python Python"
                word = "java"

            Output:
                4
 */