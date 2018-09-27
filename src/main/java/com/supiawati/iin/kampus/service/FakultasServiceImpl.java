package com.supiawati.iin.kampus.service;

import com.supiawati.iin.kampus.dao.FakultasDao;
import com.supiawati.iin.kampus.model.Fakultas;
import com.supiawati.iin.kampus.model.Jurusan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("fakultasService")
public class FakultasServiceImpl implements FakultasService {

    @Autowired
    private FakultasDao fakultasDao;

    @Override
    public List<Fakultas> getAllFakultas() {
        return fakultasDao.findAll();
    }

    @Override
    public Fakultas saveFakultas(Fakultas fakultas) {
        return fakultasDao.save(fakultas);
    }

    @Override
    public void deleteFakultas(long id) {
        fakultasDao.deleteById(id);
    }

}
