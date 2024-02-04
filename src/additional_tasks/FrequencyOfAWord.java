package additional_tasks;

public class FrequencyOfAWord {
    public static void main(String[] args) {

        String word = "java";
        String sentence = "Java Java Java JAVA Java Java java";

        String wordLowe = word.toLowerCase();
        String sentenceLowe = sentence.toLowerCase();
        //int index = -1;
        int count = 1;
        int partSentens = sentenceLowe.length();


        while (partSentens > wordLowe.length()) {
            sentenceLowe = sentenceLowe.substring(sentenceLowe.indexOf(' ')+1);
            partSentens = sentenceLowe.length();
            count ++;
        }

        System.out.println(count);

    }
}
/*
/*   int index = -1;
        int count = 0;

       while ((index = sentenceLoweCase.indexOf(wordLoweCase, wordLoweCase+1)) > 0){

           index = index+1;
       }count ++;

        System.out.println(count);


4. Create a class named FrequencyOfAWord. Given the following variables:
			word: contains a single word
			sentence: contains a sentence

	Write a program that calculates the frequency of the word from the given sentence.

			Example:
				word = "java"
				sentence = "Java Java Java JAVA Java"

			Output:
				5


 */