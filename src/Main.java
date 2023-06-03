import java.util.Scanner;

public class Main implements Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your M/P/C/CS(or Bio)/E marks in order below: ");
        double math = Double.parseDouble(sc.next());
        double phy = Double.parseDouble(sc.next());
        double chem = Double.parseDouble(sc.next());
        double comp = Double.parseDouble(sc.next());
        double eng = Double.parseDouble(sc.next());
        double sum = math+phy+chem+comp+eng;
        System.out.println("Your result in percentage is: "+Math.calc(sum));
    }
}