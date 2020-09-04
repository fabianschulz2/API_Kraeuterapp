package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.entity.Kraut;
import de.proj.Kraueterlehrpfad.exception.KrautNotFoundException;
import de.proj.Kraueterlehrpfad.repository.KrautRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController

public class KrautController {

    @Autowired
    KrautRepository krautRepository;

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/kraeuter",
            produces = MediaType.APPLICATION_JSON_VALUE)

    public List<Kraut> getKraeuter() {
        List<Kraut> krautList = krautRepository.findAll();
        return krautList;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/kraeuter/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)

    public Kraut getKraut(@PathVariable("id") Integer id) {
        try {
            if(! krautRepository.existsById(id)){
                throw new KrautNotFoundException();
            }
            return krautRepository.findById(id).get();
        }catch (KrautNotFoundException ex){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Das Kraut "+id+" wurde nicht gefunden.",ex
            );
        }
    }

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/kraeuter",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Kraut saveKraut(@RequestBody Kraut kraut) {
        return krautRepository.save(kraut);
    }

    @RequestMapping(
            method = RequestMethod.PUT,
            path = "/kraeuter",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Kraut updateKraeuter(@RequestBody Kraut kraut) {
        Kraut updateKraeuter = krautRepository.getOne(kraut.getKraeuterId());
        updateKraeuter.setAusbreitung(kraut.getAusbreitung());
        updateKraeuter.setBestaeuber(kraut.getBestaeuber());
        updateKraeuter.setBlueten(kraut.getBlueten());
        updateKraeuter.setBluetenzeit(kraut.getBluetenzeit());
        updateKraeuter.setFamilie(kraut.getFamilie());
        updateKraeuter.setFruchtreife(kraut.getFruchtreife());
        updateKraeuter.setFruechte(kraut.getFruechte());
        updateKraeuter.setHeilanwendung(kraut.getHeilanwendung());
        updateKraeuter.setInhaltsstoffe(kraut.getInhaltsstoffe());
        updateKraeuter.setInsektenarten(kraut.getInsektenarten());
        updateKraeuter.setLateinischerName(kraut.getLateinischerName());
        updateKraeuter.setName(kraut.getName());
        updateKraeuter.setSamenreife(kraut.getSamenreife());
        updateKraeuter.setSchmetterlingsfutterpflanze(kraut.getSchmetterlingsfutterpflanze());
        updateKraeuter.setVorkommen(kraut.getVorkommen());
        updateKraeuter.setWuchs(kraut.getWuchs());
        updateKraeuter.setVerwendungInKueche(kraut.getVerwendungInKueche());
        updateKraeuter.setBluetenzeitAnfang(kraut.getBluetenzeitAnfang());
        updateKraeuter.setBluetenzeitEnde(kraut.getBluetenzeitEnde());
        updateKraeuter.setQuellen(kraut.getQuellen());
        updateKraeuter.setBildUrl(kraut.getBildUrl());
        return krautRepository.saveAndFlush(updateKraeuter);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "/kraeuter/{id}"
    )
    public void deleteKraut(@PathVariable("id") Integer id) {
        krautRepository.deleteById(id);
    }


}

