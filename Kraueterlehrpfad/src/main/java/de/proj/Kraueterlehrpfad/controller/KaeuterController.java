package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.Entity.Kraeuter;
import de.proj.Kraueterlehrpfad.repository.KraeuterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController

public class KaeuterController {


    @Autowired
    KraeuterRepository kraeuterRepository;

    @RequestMapping(
        method = RequestMethod.GET,
        path="/kraeuterliste",
        produces= MediaType.APPLICATION_JSON_VALUE)

    public List<Kraeuter> getKraeuter() {


         List<Kraeuter> kraeuterList = kraeuterRepository.findAll() ;

        return kraeuterList;
    }
    @RequestMapping(
            method = RequestMethod.GET,
            path="/kraut/{id}",
            produces= MediaType.APPLICATION_JSON_VALUE)

    public Optional<Kraeuter> getKraut(@PathVariable("id") Integer id) {
        return kraeuterRepository.findById(id);
    }

    @RequestMapping(
            method = RequestMethod.PUT,
            path="/kraut",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Kraeuter updateKraeuter(@RequestBody Kraeuter kraeuter){
        Kraeuter updateKraeuter = kraeuterRepository.getOne(kraeuter.getKraeuter_ID());
        updateKraeuter.setAusbreitung(kraeuter.getAusbreitung());
        updateKraeuter.setBestaeuber(kraeuter.getBestaeuber());
        updateKraeuter.setBlueten(kraeuter.getBlueten());
        updateKraeuter.setBluetenzeit(kraeuter.getBluetenzeit());
        updateKraeuter.setFamilie(kraeuter.getFamilie());
        updateKraeuter.setFruchtreife(kraeuter.getFruchtreife());
        updateKraeuter.setFruechte(kraeuter.getFruechte());
        updateKraeuter.setHeilanwendung(kraeuter.getHeilanwendung());
        updateKraeuter.setInhaltsstoffe(kraeuter.getInhaltsstoffe());
        updateKraeuter.setInsektenarten(kraeuter.getInsektenarten());
        updateKraeuter.setLateinischer_Name(kraeuter.getLateinischer_Name());
        updateKraeuter.setName(kraeuter.getName());
        updateKraeuter.setSamenreife(kraeuter.getSamenreife());
        updateKraeuter.setSchmetterlingsfutterpflanze(kraeuter.getSchmetterlingsfutterpflanze());
        updateKraeuter.setVorkommen(kraeuter.getVorkommen());
        updateKraeuter.setWuchs(kraeuter.getWuchs());
        return kraeuterRepository.saveAndFlush(updateKraeuter);
    }

    @RequestMapping(
            method = RequestMethod.POST,
            path="/kraut",
            produces=MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Kraeuter saveKraeuter(@RequestBody Kraeuter kraeuter){
        return kraeuterRepository.save(kraeuter);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            path="/kraut/{id}"
    )
    public void deleteKraeuter(@PathVariable("id") Integer id){
        kraeuterRepository.deleteById(id);
    }
}

