package com.supiawati.iin.kampus.service;

import com.supiawati.iin.kampus.dao.MahasiswaDao;
import com.supiawati.iin.kampus.model.Mahasiswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mahasiswaService")
public class MahasiswaServiceImpl implements MahasiswaService {

    @Autowired
    private MahasiswaDao mahasiswaDao;

    @Override
    public List<Mahasiswa> getAllMahasiswa() {
        return mahasiswaDao.findAll();
    }

    @Override
    public Mahasiswa saveMahasiswa(Mahasiswa mahasiswa) {
        return mahasiswaDao.save(mahasiswa);
    }

    @Override
    public void deleteMahasiswa(long nim) {
        mahasiswaDao.deleteById(nim);
    }
}
