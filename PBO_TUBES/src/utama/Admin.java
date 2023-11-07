package utama;

public class Admin extends Pengguna{
    private String adminId;
    public Mahasiswa[] mhs;
    public Dosen[] dos;

    public Admin(String adminId, String nama, String email, String password) {
        super(nama, email, password);
        this.adminId = adminId;
    }

    public void logIn(String email, String password) {
        if (getEmail() == email && this.password == password) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal. Email atau password salah.");
        }
    }

    public void tampilkanProfil() {
        System.out.println("AdminId: " + adminId);
        System.out.println("Nama: " + getNama());
        System.out.println("Email: " + getEmail());
    }

    public  void logOut() {
        System.out.println("Anda telah logout");
    }

    public void setMhs(Mahasiswa[] mhs) {
        this.mhs = mhs;
    }

    public void setDos(Dosen[] dos) {
        this.dos = dos;
    }

    public void tampilkanMhs() {
        for(Mahasiswa element:mhs) {
            System.out.println("Nama : "+ getNama());
        }
    }

    public void tampilkanDos() {
        for(Dosen element:dos) {
            System.out.println("Nama : "+ getNama());
        }
    }


}
