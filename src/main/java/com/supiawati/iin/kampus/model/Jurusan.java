package com.supiawati.iin.kampus.model;

import javax.persistence.*;

@Entity
@Table(name = "jurusan")
public class Jurusan {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "nama_jurusan")
    private String namaJurusan;

    @OneToOne(
            mappedBy = "jurusan", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false
    )
    private Mahasiswa mahasiswa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    @Override
    public String toString() {
        return "Jurusan{" +
                "id=" + id +
                ", namaJurusan='" + namaJurusan + '\'' +
                ", mahasiswa=" + mahasiswa +
                '}';
    }
}
