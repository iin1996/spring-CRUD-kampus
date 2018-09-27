package com.supiawati.iin.kampus.dao;

import com.supiawati.iin.kampus.model.Jurusan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("jurusanDao")
public interface JurusanDao extends JpaRepository<Jurusan, Long> {

}
