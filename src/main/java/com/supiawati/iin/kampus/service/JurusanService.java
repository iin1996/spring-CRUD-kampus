package com.supiawati.iin.kampus.service;

import com.supiawati.iin.kampus.model.Jurusan;


import java.util.List;

public interface JurusanService {

    public List<Jurusan> getAllJurusan(); //getAllMahasiswa()  => ([mahasiswa,mahasiswa])

    public Jurusan saveJurusan(Jurusan jurusan); //updateMahasiswa(mahasiswa) => (mahasiswa)

    public void deleteJurusan(long id); //deleteMahasiswa(nim) => null

}
