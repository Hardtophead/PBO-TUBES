package utama;

public class Mahasiswa extends Pengguna {
    private String nim;

    public Mahasiswa(String nim, String nama, String email, String password) {
        super(nama, email, password);
        this.nim = nim;
    }

    

    public void logIn(String email, String password) {
        if (getEmail() == email && this.password == password) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal. Email atau password salah.");
        }
    }

    public void tampilkanProfil() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + getNama());
        System.out.println("Email: " + getEmail());
    }

    public  void logOut() {
        System.out.println("Anda telah logout");
    }

}
