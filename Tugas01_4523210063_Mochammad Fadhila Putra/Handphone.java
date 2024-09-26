public class Handphone {
    protected String merk;
    protected String model;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void nyalakan() {
        System.out.println(merk + " " + model + " dinyalakan.");
    }

    public void matikan() {
        System.out.println(merk + " " + model + " dimatikan.");
    }

    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mengirim pesan ke " + nomorTujuan + ": " + pesan);
    }

    public void kirimPesan(String nomorTujuan1, String nomorTujuan2, String pesan) {
        System.out.println("Mengirim pesan ke " + nomorTujuan1 + " dan " + nomorTujuan2 + ": " + pesan);
    }

    public void kirimPesan(String[] daftarNomor, String pesan) {
        for (String nomor : daftarNomor) {
            System.out.println("Mengirim pesan ke " + nomor + ": " + pesan);
        }
    }
}
