import java.sql.SQLOutput;

public class CWH_15_ps3 {
    public static void main(String[] args) {

        //Problem 1
        String name = "JACK PARKER";
        name = name.toLowerCase();
        System.out.println(name);

        // Problam 2
        String text = "To Lower case";
        text = text.replace("","-");
        System.out.println(text);

        // Problem 3
        String letter = " Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Rakesh");
        System.out.println(letter);

        // Problem 4
        String myString = "This String contains   double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Problem
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);



    }
}
