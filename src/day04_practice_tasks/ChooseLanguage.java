package day04_practice_tasks;

public class ChooseLanguage {
    public static void main(String[] args) {

        int n = 4;
        switch (n){
            case 1 -> System.out.println("Hello, thank you for your call");
            case 2 -> System.out.println("Hola, gracias por llamar");
            case 3 -> System.out.println("Merhaba, aradığınız için teşekkürler");
            case 4 -> System.out.println("Привет, спасибо за ваш звонок");
            case 5 -> System.out.println("Merci, pour votre appel");

            default -> System.out.println("Invalid Number" );
        }

    }
}
/*
1. Create a class named ChooseLanguage. Given an integer variable named selection that has a
number between 1~5, write a program that selects the language based on the number provided in
the selection and prints the following message:

		for 1: Hello, thank you for your call
		for 2: Hola, gracias por llamar
		for 3: Merhaba, aradığınız için teşekkürler
		for 4: Привет, спасибо за ваш звонок
		for 5: Merci, pour votre appel

			Example:
				   selection = 3;

			Output:
				  Merhaba, aradiginiz icin tesekkurler

 */