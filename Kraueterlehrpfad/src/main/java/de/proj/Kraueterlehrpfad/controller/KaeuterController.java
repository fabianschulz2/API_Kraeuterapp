package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.Entity.Kraeuter;
import de.proj.Kraueterlehrpfad.repository.KraeuterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController

public class KaeuterController {


    @Autowired
    KraeuterRepository kraeuterRepository;

    @RequestMapping(
        method = RequestMethod.GET,
        path="/kraut",
        produces= MediaType.APPLICATION_JSON_VALUE)



    public List<Kraeuter> getKraeuter() {


         List<Kraeuter> kraeuterList = kraeuterRepository.findAll() ;

        return kraeuterList;
    }

}
