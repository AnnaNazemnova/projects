import java.io.IOException;

public class game1 {
    public static void main(String[] args) throws IOException {
        char ch,answer='F';
        System.out.println("Какую букву я загадала?");
        System.out.print("Попробуй угадать:");
        ch= (char)System.in.read();
        if (ch==answer) System.out.print("Поздравляю");
        else if (ch>answer) System.out.print("Перестарался");
        else System.out.print("Недостарался");

    }
}
