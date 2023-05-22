package com.mars.service;

import com.mars.enums.Direction;
import com.mars.exception.InvalidEntryException;
import com.mars.exception.InvalidMoveException;
import com.mars.model.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class RoverServiceTest {
    @Mock
    private RoverService roverService;

    @BeforeEach
    void setUp() {
        roverService = new RoverService();
    }

    @Test
    void testExecuteCommands_validCommands() throws InvalidMoveException {
        String commands = "MLRMM";

        String result = roverService.executeCommands(commands);

        Position expectedPosition = new Position(0, 3, Direction.NORTH);
        String expectedOutput = expectedPosition.toString();
        Assertions.assertEquals(expectedOutput, result);
    }

    @Test
    void testExecuteCommands_invalidCommand() {
        String commands = "MMX";

        Assertions.assertThrows(InvalidEntryException.class, () -> {
            roverService.executeCommands(commands);
        });
    }

    @Test
    void testExecuteCommands_invalidMove() {
        String commands = "MMMMMMMMMMMM";

        Assertions.assertThrows(InvalidMoveException.class, () -> {
            roverService.executeCommands(commands);
        });
    }

    @Test
    void testExecuteCommands_noCommands() throws InvalidEntryException {
        String commands = "";

        Assertions.assertThrows(InvalidEntryException.class, () -> {
            roverService.executeCommands(commands);
        });
    }

}
