import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ders Adı:");
        String ders = s.next();

        System.out.println("1.Vize:");
        Double vize1 = s.nextDouble();

        System.out.println("2.Vize:");
        Double vize2 = s.nextDouble();

        System.out.println("Final:");
        Double fnl = s.nextDouble();

        Vize program = new Vize(ders, vize1, vize2, fnl);

        program.bilgiAl();
        program.ort();

    }
}
