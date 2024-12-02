public class app {

    /**
     * @param args
     */
    public static void main(String[] args) {

        var Genap = 10;

        if (Genap <= 10000) {
            System.out.println("angka yang kamu masukkan adalah genap ");
            Genap += 2;
        } else {
            System.out.println("angka yang kamu masukkan adalah ganjil");
            Genap -= 1;
        }

    }
}