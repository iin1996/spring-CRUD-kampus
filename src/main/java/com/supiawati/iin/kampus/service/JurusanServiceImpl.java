package com.supiawati.iin.kampus.service;

import com.supiawati.iin.kampus.dao.JurusanDao;
import com.supiawati.iin.kampus.model.Jurusan;
import com.supiawati.iin.kampus.model.Matakuliah;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("jurusanService")
public class JurusanServiceImpl implements JurusanService {

    @Autowired
    private JurusanDao jurusanDao;

    @Override
    public List<Jurusan> getAllJurusan() {
        return jurusanDao.findAll();
    }

    @Override
    public Jurusan saveJurusan(Jurusan jurusan) {
        return jurusanDao.save(jurusan);
    }

    @Override
    public void deleteJurusan(long id) {
        jurusanDao.deleteById(id);
    }

}
