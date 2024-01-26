package additional_tasks;

public class FrequencyOfAWord1 {
    public static void main(String[] args) {

        String word = "javva";
        String sentence = "Javva Javva Javva JAVvA Javva Javva";

        int frequencyWord = (sentence.length()+1)/(word.length()+1);
        System.out.println(frequencyWord);

    }
}
/*
Create a class named FrequencyOfAWord. Given the following variables:
			word: contains a single word
			sentence: contains a sentence

	Write a program that calculates the frequency of the word from the given sentence.

			Example:
				word = "java"
				sentence = "Java Java Java JAVA Java"

			Output:
				5
 */