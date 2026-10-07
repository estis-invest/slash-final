package com.efpcode.tournament.domain.fighter.exceptions;

public class FighterEmptyException extends RuntimeException {
    public FighterEmptyException(String message) {
        super(message);
    }
}
