public class Buku {
    int id;
    String judul;
    String pengarang;
    String tahunterbit;

    public Buku(int id, String judul, String pengarang, String tahunterbit) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunterbit = tahunterbit;
    }

    public void uraikan() {
        System.out.println("Idnya: " + id);
        System.out.println("Judulnya: " + judul);
        System.out.println("Pengarangnya: " + pengarang);
        System.out.println("Tahun Terbitnyanya: " + tahunterbit);
        System.out.println("");
    }
}
