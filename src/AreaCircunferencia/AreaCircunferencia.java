package AreaCircunferencia;

public class AreaCircunferencia {
    public static void main(String[] args) {
        int raio = 3;
        final double pi = 3.14159;

        double area = pi * raio * raio;
        double areaArredondada = Math.round(area * 100.0) / 100.0;

        System.out.println(String.format("%.2f", areaArredondada));
    }
}
