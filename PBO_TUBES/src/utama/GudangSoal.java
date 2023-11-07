package utama;


public class GudangSoal {
    private String judul;
    private Soal[] kumpulanSoal;

    public GudangSoal(String judul, Soal[] kumpulanSoal) {
        this.judul = judul;
        this.kumpulanSoal = kumpulanSoal;
    }

    public void setKumpulanSoal(Soal[] kumpulanSoal) {
        this.kumpulanSoal = kumpulanSoal;
    }

    public Soal[] getKumpulanSoal() {
        return kumpulanSoal;
    }

    
    

    

    
}
