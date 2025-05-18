package com.example.belajar.spring.model;

public class Mahasiswa {
    private Long id;
    private String nama;
    private String email; // Jika email tidak diperlukan, bisa dihapus
    private Jurusan jurusan; // Ubah menjadi objek Jurusan

    public Mahasiswa() {}

    public Mahasiswa(Long id, String nama, Jurusan jurusan) { // Ubah parameter jurusan
        this.id = id;
        this.nama = nama;
        this.jurusan = jurusan; // Set jurusan
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Jurusan getJurusan() { // Getter untuk jurusan
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) { // Setter untuk jurusan
        this.jurusan = jurusan;
    }
}
