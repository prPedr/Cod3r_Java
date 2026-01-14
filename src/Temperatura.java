public class Temperatura {
    public static void main(String[] args) {
        double f = 100;

        // Formula para coversao de fireraid para celsius
        final double c = 5.0 / 9.0 * (f - 32);

        System.out.printf("%.2f graus fireraid é igual a %.2f graus celsius", f, c);
    }
}
