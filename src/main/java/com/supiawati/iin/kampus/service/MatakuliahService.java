package com.supiawati.iin.kampus.service;

import com.supiawati.iin.kampus.model.Mahasiswa;
import com.supiawati.iin.kampus.model.Matakuliah;

import java.util.List;

public interface MatakuliahService {

    public List<Matakuliah> getAllMatakuliah(); //getAllMahasiswa()  => ([mahasiswa,mahasiswa])

    public Matakuliah saveMatakuliah(Matakuliah matakuliah); //updateMatakuliah(mahasiswa) => (mahasiswa)

    public void deleteMatakuliah(long nim); //deleteMatakuliah(nim) => null
}
