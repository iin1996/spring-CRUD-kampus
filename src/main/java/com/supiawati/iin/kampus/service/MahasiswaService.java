package com.supiawati.iin.kampus.service;

import com.supiawati.iin.kampus.model.Mahasiswa;

import java.util.List;

public interface MahasiswaService {

    public List<Mahasiswa> getAllMahasiswa(); //getAllMahasiswa()  => ([mahasiswa,mahasiswa])

    public Mahasiswa saveMahasiswa(Mahasiswa mahasiswa); //updateMahasiswa(mahasiswa) => (mahasiswa)

    public void deleteMahasiswa(long nim); //deleteMahasiswa(nim) => null
}
