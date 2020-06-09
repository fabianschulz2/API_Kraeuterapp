package de.proj.Kraueterlehrpfad.controller;

import de.proj.Kraueterlehrpfad.repository.RebeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RebeController {

    @Autowired
    RebeRepository rebeRepository;
}
