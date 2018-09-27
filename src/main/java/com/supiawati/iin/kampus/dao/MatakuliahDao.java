package com.supiawati.iin.kampus.dao;

import com.supiawati.iin.kampus.model.Mahasiswa;
import com.supiawati.iin.kampus.model.Matakuliah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("matakuliahDao")
public interface MatakuliahDao extends JpaRepository<Matakuliah, Long> {

}
