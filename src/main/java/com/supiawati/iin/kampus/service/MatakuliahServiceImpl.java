package com.supiawati.iin.kampus.service;

import com.supiawati.iin.kampus.dao.MatakuliahDao;
import com.supiawati.iin.kampus.model.Matakuliah;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("matakuliahService")
public class MatakuliahServiceImpl implements MatakuliahService {

    @Autowired
    private MatakuliahDao matakuliahDao;

    @Override
    public List<Matakuliah> getAllMatakuliah() {
        return matakuliahDao.findAll();
    }

    @Override
    public Matakuliah saveMatakuliah(Matakuliah matakuliah) {
        return matakuliahDao.save(matakuliah);
    }

    @Override
    public void deleteMatakuliah(long id) {
        matakuliahDao.deleteById(id);
    }

}
