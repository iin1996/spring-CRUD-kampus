package com.supiawati.iin.kampus.controller;

import com.supiawati.iin.kampus.model.Matakuliah;
import com.supiawati.iin.kampus.service.MatakuliahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MatakuliahRestController {

    @Autowired
    private MatakuliahService matakuliahService;

    @GetMapping(path = "matakuliahs", produces = "application/json")
    public @ResponseBody
    List<Matakuliah> getAllMatakuliah(){
        return matakuliahService.getAllMatakuliah();
    }

    @PostMapping(path = "matakuliahs", produces = "application/json", consumes = "application/json")
    public @ResponseBody
    Matakuliah saveMatakuliah(@RequestBody Matakuliah matakuliahReqbody){
        System.out.println(matakuliahReqbody.toString());
        return matakuliahService.saveMatakuliah(matakuliahReqbody);
    }
    @DeleteMapping("matakulias/{id}")
    public void delete(@PathVariable(value = "id") Long id){
        matakuliahService.deleteMatakuliah(id);
    }
}
