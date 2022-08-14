public class BmiService {

    public double calculate(double mass, double growth) {
        double result = mass / (growth * growth);

        return (result);

    }
}