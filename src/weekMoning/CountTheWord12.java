package weekMoning;

public class CountTheWord12 {
    public static void main(String[] args) {
        String str = "java Python Python JAVA Java jAvA python jAvA Python Java".toLowerCase();
        String word = "java";

        int indexFrom = 0;
        int count = 0;


        while (str.indexOf(word, indexFrom) != -1) {
            indexFrom = str.indexOf(word, indexFrom) + 1;
            count++;
        }


        System.out.println(count);
    }
}
