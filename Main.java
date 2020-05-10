public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = (float) 1.8;
        float weight = 75F;
        float bodyMassIndex = service.calculate(height, weight);
        System.out.println(bodyMassIndex);
    }
}
