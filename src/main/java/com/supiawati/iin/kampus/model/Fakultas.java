package com.supiawati.iin.kampus.model;

import javax.persistence.*;

@Entity
@Table(name = "fakultas")
public class Fakultas {

    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;

    @Column(name="nama_fakultas")
    private String namaFakultas;

    @OneToOne(
            mappedBy = "fakultas", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false
    )
    private Mahasiswa mahasiswa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNamaFakultas() {
        return namaFakultas;
    }

    public void setNamaFakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
    }
}
