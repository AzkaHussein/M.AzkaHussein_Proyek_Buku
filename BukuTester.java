public class BukuTester {
    public static void main(String[] args) {
        Buku b1 = new Buku(1, "Sang Alkemis", "Paulo Coelho", "2000");
        Buku b2 = new Buku(2, "Cantik Itu Luka", "Eka Kurniawan", "2000");
        Buku b3 = new Buku(900, "Seperti Dendam, Rindu Perlu dibalas ", "Eka Kurniawan", "2000");
        Buku b4 = new Buku(35, "Atheis", "Achdiat K.", "1947");
        Buku b5 = new Buku(51, "Bumi Manusia", "Pram", "1970");

        b1.uraikan();
        b2.uraikan();
        b3.uraikan();
        b4.uraikan();
        b5.uraikan();
    }
}
