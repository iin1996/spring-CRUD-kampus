package com.supiawati.iin.kampus.controller;

import com.supiawati.iin.kampus.model.Jurusan;
import com.supiawati.iin.kampus.model.Mahasiswa;
import com.supiawati.iin.kampus.service.JurusanService;
import com.supiawati.iin.kampus.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JurusanRestController {
    @Autowired
    private JurusanService jurusanService;

    @GetMapping(path = "jurusans", produces = "application/json")
    public @ResponseBody
    List<Jurusan> getAllJurusans() {
        return jurusanService.getAllJurusan();
    }

    @PostMapping(path = "jurusans", produces = "application/json", consumes = "application/json")
    public @ResponseBody
    Jurusan saveJurusan(@RequestBody Jurusan jurusanReqBody) {
        System.out.println(jurusanReqBody.toString());
        return  jurusanService.saveJurusan(jurusanReqBody);
    }
    @DeleteMapping("jurusans/{id}")
    public void delete(@PathVariable(value = "id") Long id){
        jurusanService.deleteJurusan(id);
    }

}
