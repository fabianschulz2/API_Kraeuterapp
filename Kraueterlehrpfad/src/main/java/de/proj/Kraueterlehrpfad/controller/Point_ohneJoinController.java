package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.Entity.Point;
import de.proj.Kraueterlehrpfad.Entity.Point_ohneJoin;
import de.proj.Kraueterlehrpfad.Entity.Route;
import de.proj.Kraueterlehrpfad.repository.PointRepository;
import de.proj.Kraueterlehrpfad.repository.Point_ohneJoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Point_ohneJoinController {

    @Autowired
    Point_ohneJoinRepository point_ohneJoinRepository;

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/point",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Point_ohneJoin> getPoints(){
            List<Point_ohneJoin> pointList = point_ohneJoinRepository.findAll();
        return pointList;
    }


    @RequestMapping(
            method = RequestMethod.PUT,
            path = "/point",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Point_ohneJoin updateLink(@RequestBody Point_ohneJoin point) {
        Point_ohneJoin updatePoint = point_ohneJoinRepository.getOne(point.getPointId());
        updatePoint.setLatitude(point.getLatitude());
        updatePoint.setLongitude(point.getLongitude());
        updatePoint.setPointId(point.getPointId());
        updatePoint.setRoutId(point.getRoutId());

        return point_ohneJoinRepository.saveAndFlush(updatePoint);
    }
}
