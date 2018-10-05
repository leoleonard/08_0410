package eight.two;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        boolean repetition;
        String text;
        Book[] book1 = new Book[3];
        Scanner scan = new Scanner(System.in);

        System.out.println("Type in the author name");
        text = scan.nextLine();

        repetition = false;

        do {
            text = scan.nextLine();
            if (text.isEmpty()) {
                System.out.println("Enter the name");
            } else {
                System.out.println(text);
            }
        }  while (!repetition);

        for (int i = 0; i < book1.length ; i++) {
            System.out.println(book1[i].toString());
        }


    }
}
