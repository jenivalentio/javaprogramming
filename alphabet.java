public class Alphabet
 {

    public static void main(String[] args) {

        char d = '*';

        if( (d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z'))
            System.out.println(d + " is an alphabet.");
        else
            System.out.println(d + " is not an alphabet.");
    }
}
