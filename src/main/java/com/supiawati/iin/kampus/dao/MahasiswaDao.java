package com.supiawati.iin.kampus.dao;

import com.supiawati.iin.kampus.model.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("mahasiswaDao")
public interface MahasiswaDao extends JpaRepository<Mahasiswa, Long> {

}
