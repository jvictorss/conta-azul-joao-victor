package com.mars.constants;

import org.springframework.stereotype.Component;

@Component
public class RoverConstants {
    public static final int TERRAIN_SIZE = 5;
    public static final char MOVE_COMMAND = 'M';
    public static final char RIGHT_COMMAND = 'R';
    public static final char LEFT_COMMAND = 'L';
    public static final String INVALID_ENTRY_ERROR_MESSAGE = "Entrada inválida. Por favor insira apenas letras maiúsculas (M, R, L).";
    public static final String INVALID_MOVE_ERROR_MESSAGE = "Desculpe, posição inválida. Andou fora dos limites.";

}
