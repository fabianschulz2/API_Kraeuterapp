package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.Entity.Point;
import de.proj.Kraueterlehrpfad.Entity.Routs;
import de.proj.Kraueterlehrpfad.repository.RoutsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class RoutsController {
@Autowired
    RoutsRepository routsRepository;


    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "/routen/{id}"
    )
    public void deleteKraut(@PathVariable("id") Integer id) {
        routsRepository.deleteById(id);
    }
}
