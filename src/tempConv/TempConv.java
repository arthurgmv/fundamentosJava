package tempConv;

public class TempConv {
    public static void main(String[] args) {
        //(F - 32) x 5/9 = C
        final double Fator = 5 / 9.0;
        final double Ajuste = 32;
        double fahrenheit = 70;
        double celsius = Math.round((fahrenheit - Ajuste) * Fator);
        System.out.println(celsius);
    }
}

