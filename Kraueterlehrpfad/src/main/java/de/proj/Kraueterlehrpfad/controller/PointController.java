package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PointController {
    @Autowired
    PointRepository pointRepository;

    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "/point/{id}"
    )
    public void deleteKraut(@PathVariable("id") Integer id) {
        pointRepository.deleteById(id);
    }
}
