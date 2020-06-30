package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.Entity.Route;
import de.proj.Kraueterlehrpfad.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(
            method = RequestMethod.POST,
            path="/routen",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Route postRout(@RequestBody Route route){
        return routeRepository.save(route);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "/routen/{id}"
    )
    public void deleteKraut(@PathVariable("id") Integer id) {
        routeRepository.deleteById(id);
    }
}
