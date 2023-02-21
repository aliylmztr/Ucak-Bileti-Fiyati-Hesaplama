import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, age, type;
        double perKm = 0.10, total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz :");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz :");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş-Dönüş) :");
        type = input.nextInt();

        if ((km > 0) && (age > 0) && ((type == 1) || (type == 2))) {
            total = km * perKm;
            if (age < 12) {
                total = total - (total * 0.50);
            } else if (age >= 12 && age <= 24) {
                total = total - (total * 0.10);
            } else if (age > 65) {
                total = total - (total * 0.30);
            } else {
                total *= 1;
            }
            if (type == 1) {
                total *= 1;
            } else if (type == 2) {
                total = (total - (total * 0.20)) * 2;
            }
            System.out.println("Toplam Tutar :" + total);
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}
