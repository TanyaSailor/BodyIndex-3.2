public class Main {

    public static void main(String[] args) {
        double mass = 79.9; // масса тела в кг;
        double growth = 1.85; // рост в м;

        BmiService service = new BmiService();
        double index = service.calculate(mass, growth);

        System.out.println(index);


    }
}
