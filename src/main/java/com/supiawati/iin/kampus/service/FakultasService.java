package com.supiawati.iin.kampus.service;

import com.supiawati.iin.kampus.model.Fakultas;

import java.util.List;

public interface FakultasService {

    public List<Fakultas> getAllFakultas(); //getAllMahasiswa()  => ([mahasiswa,mahasiswa])

    public Fakultas saveFakultas(Fakultas fakultas); //updateMahasiswa(mahasiswa) => (mahasiswa)

    public void deleteFakultas(long id); //deleteMahasiswa(nim) => null

}
