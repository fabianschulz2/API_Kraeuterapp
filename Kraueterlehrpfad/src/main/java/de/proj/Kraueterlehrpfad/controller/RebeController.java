package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.Entity.Rebe;
import de.proj.Kraueterlehrpfad.repository.RebeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
public class RebeController {

    @Autowired
    RebeRepository rebeRepository;


    //Gebe alle Reben zurueck
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/reben",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Rebe> getReben(){
        List<Rebe> rebeList = rebeRepository.findAll();
        return rebeList;
    }
}
