package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.Entity.Route;
import de.proj.Kraueterlehrpfad.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RouteController {
    @Autowired
    RouteRepository routeRepository;

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/routen",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Route> getRouts(){
        List<Route> routeList = routeRepository.findAll();
        return routeList;
    }
}