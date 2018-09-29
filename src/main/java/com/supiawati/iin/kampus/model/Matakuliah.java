package com.supiawati.iin.kampus.model;


import javax.persistence.*;

@Entity
@Table(name = "matakuliah")
public class Matakuliah {

    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;

    @Column(name="nama_matakuliah")
    private String namaMatakuliah;

    @Column(name = "sks")
    private int sks;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mahasiswa_nim")
    private Mahasiswa mahasiswa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNamaMatakuliah() {
        return namaMatakuliah;
    }

    public void setNamaMatakuliah(String namaMatakuliah) {
        this.namaMatakuliah = namaMatakuliah;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    @Override
    public String toString() {
        return "Matakuliah{" +
                "id=" + id +
                ", namaMatakuliah='" + namaMatakuliah + '\'' +
                ", sks=" + sks +
                ", mahasiswa=" + mahasiswa +
                '}';
    }
}
