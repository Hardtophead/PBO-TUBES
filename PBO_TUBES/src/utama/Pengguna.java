package utama;

public abstract class Pengguna {
    private String nama;
    private String email;
    protected String password;
    
    public Pengguna(String nama, String email, String password) {
        this.nama = nama;
        this.email = email;
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }

    public String getNama() {
        return nama;
    }

    public abstract void tampilkanProfil();


     
}
