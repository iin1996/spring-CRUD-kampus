package com.supiawati.iin.kampus.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {

    @Id
    @GeneratedValue
    @Column(name = "nim")
    private long nim;

    @Column(name = "nama_mahasiswa")
    private String namaMahasiswa;

    @Column(name = "alamat")
    private String alamat;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Matakuliah> matakuliahs = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "jurusan_id")
    private Jurusan jurusan;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fakultas_id")
    private Fakultas fakultas;

    public Mahasiswa() {
    }

    public List<Matakuliah> getMatakuliahs() {
        return matakuliahs;
    }

    public void setMatakuliahs(List<Matakuliah> matakuliahs) {
        this.matakuliahs = matakuliahs;
    }

    public long getNim() {
        return nim;
    }

    public void setNim(long nim) {
        this.nim = nim;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim=" + nim +
                ", namaMahasiswa='" + namaMahasiswa + '\'' +
                ", alamat='" + alamat + '\'' +
                ", matakuliahs=" + matakuliahs +
                ", jurusan=" + jurusan +
                ", fakultas=" + fakultas +
                '}';
    }
}
