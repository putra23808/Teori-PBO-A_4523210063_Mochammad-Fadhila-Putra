public class Smartphone extends Handphone {

    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println(merk + " " + model + " smartphone dinyalakan.");
    }

    @Override
    public void matikan() {
        System.out.println(merk + " " + model + " smartphone dimatikan.");
    }

    @Override
    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Smartphone mengirim pesan ke " + nomorTujuan + ": " + pesan);
    }

    @Override
    public void kirimPesan(String emailTujuan, String subjek, String pesan) {
        System.out.println("Mengirim email ke " + emailTujuan + " dengan subjek '" + subjek + "' dan pesan: " + pesan);
    }

    public void aksesInternet() {
        System.out.println("Mengakses internet dari " + merk + " " + model);
    }
}
