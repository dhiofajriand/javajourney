import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int amount;
        int period;
        double interest;
        double monthly;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah loan: ");
        amount = scanner.nextInt();
        System.out.print("Tenggat (tahun): ");
        period = scanner.nextInt();
        System.out.print("Besar Bunga: ");
        interest = scanner.nextFloat();

        interest = interest/100;
        double minterest = interest/12;
        int mperiod = period*12;
        double oneplus = Math.pow(1+minterest,mperiod);
        double upside = minterest*oneplus;
        double downside = oneplus-1;
        monthly = amount*upside/downside;

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        String result = currency.format(monthly);
        System.out.println("Angsuran Bulanan :" + result);
        result = currency.format(monthly*mperiod);
        System.out.println("Total Pembayaran :" + result);

    }
}
