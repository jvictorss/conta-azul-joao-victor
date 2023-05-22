package com.mars.controller;

import com.mars.service.RoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoverController {

    private final RoverService roverService;

    @Autowired
    public RoverController(RoverService roverService) {
        this.roverService = roverService;
    }

    @PostMapping("/mars/{commands}")
    public ResponseEntity<String> executeCommands(@PathVariable String commands) throws Exception {

        return ResponseEntity.ok(roverService.executeCommands(commands));
    }

}
