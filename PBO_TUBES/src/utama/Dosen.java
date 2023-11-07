package utama;

public class Dosen extends Pengguna implements Loginable{
    private String idDosen;

    public Dosen(String idDosen, String nama, String email, String password) {
        super(nama, email, password);
        this.idDosen = idDosen;
    }

    public void logIn(String email, String password) {
        if (getEmail() == email && this.password == password) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal. Email atau password salah.");
        }
    }

    public void tampilkanProfil() {
        System.out.println("IdDosen: " + idDosen);
        System.out.println("Nama: " + getNama());
        System.out.println("Email: " + getEmail());
    }

    public  void logOut() {
        System.out.println("Anda telah logout");
    }


    
}
