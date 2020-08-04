package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.entity.PointOhneLinks;
import de.proj.Kraueterlehrpfad.repository.PointOhneLinksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PointOhneLinksController {

    @Autowired
    PointOhneLinksRepository point_ohneLinksRepository;

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/point",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<PointOhneLinks> getPoints(){
            List<PointOhneLinks> pointList = point_ohneLinksRepository.findAll();
        return pointList;
    }


    @RequestMapping(
            method = RequestMethod.PUT,
            path = "/point",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public PointOhneLinks updateLink(@RequestBody PointOhneLinks point) {
        PointOhneLinks updatePoint = point_ohneLinksRepository.getOne(point.getPointId());
        updatePoint.setLatitude(point.getLatitude());
        updatePoint.setLongitude(point.getLongitude());
        updatePoint.setPointId(point.getPointId());
        updatePoint.setRoutId(point.getRoutId());

        return point_ohneLinksRepository.saveAndFlush(updatePoint);
    }
}
