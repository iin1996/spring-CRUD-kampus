package com.supiawati.iin.kampus.controller;

import com.supiawati.iin.kampus.model.Fakultas;
import com.supiawati.iin.kampus.model.Jurusan;
import com.supiawati.iin.kampus.service.FakultasService;
import com.supiawati.iin.kampus.service.JurusanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FakultasRestController {
    @Autowired
    private FakultasService fakultasService;

    @GetMapping(path = "fakultass", produces = "application/json")
    public @ResponseBody
    List<Fakultas> getAllFakultass() {
        return fakultasService.getAllFakultas();
    }

    @PostMapping(path = "fakultass", produces = "application/json", consumes = "application/json")
    public @ResponseBody
    Fakultas saveFakultas(@RequestBody Fakultas fakultasReqBody) {
        System.out.println(fakultasReqBody.toString());
        return  fakultasService.saveFakultas(fakultasReqBody);
    }
    @DeleteMapping("fakultas/{id}")
    public void delete(@PathVariable(value = "id") Long id){
        fakultasService.deleteFakultas(id);
    }
}
