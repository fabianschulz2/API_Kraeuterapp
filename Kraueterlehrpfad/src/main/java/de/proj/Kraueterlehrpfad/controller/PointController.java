package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.Entity.Point;
import de.proj.Kraueterlehrpfad.Entity.Route;
import de.proj.Kraueterlehrpfad.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
//
//    @RequestMapping(
//            method = RequestMethod.PUT,
//            path = "/point",
//            consumes = MediaType.APPLICATION_JSON_VALUE
//    )
//    public Point updateLink(@RequestBody Point point) {
//        Point updatePoint = pointRepository.getOne(point.getPointId());
//        updatePoint.setLatitude(point.getLatitude());
//        updatePoint.setLongitude(point.getLongitude());
//        updatePoint.setPointId(point.getPointId());
//        updatePoint.setRoute(point.getRoute());
//        return pointRepository.saveAndFlush(updatePoint);
//    }
}
