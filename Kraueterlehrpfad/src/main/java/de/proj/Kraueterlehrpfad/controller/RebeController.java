package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.repository.RebeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RebeController {

    @Autowired
    RebeRepository rebeRepository;


    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "/rebe/{id}"
    )
    public void deleteKraut(@PathVariable("id") Integer id) {
        rebeRepository.deleteById(id);
    }

}
