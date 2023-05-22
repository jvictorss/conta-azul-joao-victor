package com.mars.service;

import com.mars.enums.Direction;
import com.mars.exception.InvalidEntryException;
import com.mars.exception.InvalidMoveException;
import com.mars.model.Position;
import org.springframework.stereotype.Component;

import static com.mars.constants.RoverConstants.*;

@Component
public class RoverService {

    public String executeCommands(String commands) throws InvalidMoveException {
        Position position = new Position(0, 0, Direction.NORTH);

        if(!isValidCommandString(commands)) {
            throw new InvalidEntryException(INVALID_ENTRY_ERROR_MESSAGE);
        }

        for (char command : commands.toCharArray()) {
            switch (command) {
                case LEFT_COMMAND:
                    position.rotateLeft();
                    break;
                case RIGHT_COMMAND:
                    position.rotateRight();
                    break;
                case MOVE_COMMAND:
                    position.move();
                    break;
                default:
                    throw new InvalidEntryException(INVALID_ENTRY_ERROR_MESSAGE);
            }

            if (!isValidPosition(position)) {
                throw new InvalidMoveException(INVALID_MOVE_ERROR_MESSAGE);
            }
        }
        return position.toString();
    }

    private boolean isValidPosition(Position position) {
        int x = position.getX();
        int y = position.getY();

        return x >= 0 && x <= TERRAIN_SIZE && y >= 0 && y <= TERRAIN_SIZE;
    }

    private boolean isValidCommandString(String commands) {
        return commands.matches("^[MRL]+$");
    }
}
