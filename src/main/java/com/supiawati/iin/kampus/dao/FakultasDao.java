package com.supiawati.iin.kampus.dao;

import com.supiawati.iin.kampus.model.Fakultas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("fakultasDao")
public interface FakultasDao extends JpaRepository<Fakultas, Long> {


}
