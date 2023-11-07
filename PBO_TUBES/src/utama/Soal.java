package utama;

public class Soal {
    private String pertanyaan;

    public Soal(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public void tampilkanSoal() {
        System.out.println(getPertanyaan());
    }
    
}
