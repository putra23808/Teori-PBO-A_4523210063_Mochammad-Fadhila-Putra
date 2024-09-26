public class Main {
    public static void main(String[] args) {
        Handphone hp = new Handphone("Nokia", "3310");
        hp.nyalakan();
        hp.kirimPesan("08123456789", "Halo, ini pesan pertama.");
        hp.kirimPesan("08123456789", "08129876543", "Ini pesan grup.");
        String[] nomor = { "08123456789", "08129876543", "08121234567" };
        hp.kirimPesan(nomor, "Pesan broadcast.");
        hp.matikan();

        System.out.println();

        Smartphone smartphone = new Smartphone("Apple", "iPhone 12");
        smartphone.nyalakan();
        smartphone.kirimPesan("08123456789", "Pesan dari smartphone.");
        smartphone.kirimPesan("email@domain.com", "Subject", "Isi email.");
        smartphone.aksesInternet();
        smartphone.matikan();

        System.out.println();

        FeaturePhone featurePhone = new FeaturePhone("Samsung", "GT-E1205Y");
        featurePhone.nyalakan();
        featurePhone.mainGameSnake();
        featurePhone.matikan();
    }
}
