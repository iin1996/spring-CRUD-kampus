package com.supiawati.iin.kampus.controller;

import java.util.List;
import java.util.Map;

import com.supiawati.iin.kampus.model.Mahasiswa;
import com.supiawati.iin.kampus.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MahasiswaRestController {

    @Autowired
    private MahasiswaService mahasiswaService;

    @GetMapping(path = "mahasiswas", produces = "application/json")
    public @ResponseBody
    List<Mahasiswa> getAllMahasiswas() {
        return mahasiswaService.getAllMahasiswa();
    }

    @PostMapping(path = "mahasiswas", produces = "application/json", consumes = "application/json")
    public @ResponseBody
    Mahasiswa saveMahasiswa(@RequestBody Mahasiswa mahasiswaReqBody) {
        return  mahasiswaService.saveMahasiswa(mahasiswaReqBody);
    }

    @DeleteMapping("mahasiswas/{nim}")
    public
    void delete(@PathVariable(value = "nim") Long nim){
        mahasiswaService.deleteMahasiswa(nim);
    }
}