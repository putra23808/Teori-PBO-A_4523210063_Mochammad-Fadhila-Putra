public class FeaturePhone extends Handphone {

    public FeaturePhone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println(merk + " " + model + " feature phone dinyalakan.");
    }

    @Override
    public void matikan() {
        System.out.println(merk + " " + model + " feature phone dimatikan.");
    }

    public void mainGameSnake() {
        System.out.println("Memainkan game Snake di " + merk + " " + model);
    }
}
