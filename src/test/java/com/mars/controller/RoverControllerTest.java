package com.mars.controller;

import com.mars.service.RoverService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class RoverControllerTest {

    @Mock
    private RoverService roverService;

    @InjectMocks
    private RoverController target;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testExecuteCommands_validCommands() throws Exception {
        String commands = "MMR";
        String expectedPosition = "0 2 E";
        when(roverService.executeCommands(commands)).thenReturn(expectedPosition);

        ResponseEntity<String> response = target.executeCommands(commands);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expectedPosition, response.getBody());

        verify(roverService).executeCommands(commands);
    }
}
