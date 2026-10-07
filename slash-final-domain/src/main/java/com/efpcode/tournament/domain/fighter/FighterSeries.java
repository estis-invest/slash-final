package com.efpcode.tournament.domain.fighter;

import com.efpcode.tournament.domain.fighter.exceptions.FighterEmptyException;
import com.efpcode.tournament.domain.fighter.exceptions.FighterWrongFormatException;

public record FighterSeries(String series) {

    public FighterSeries{
        if (series == null || series.isBlank()){
            throw new FighterEmptyException("FighterSeries cannot be created with empty or null.");
        }


        if (!series.equals(series.strip())){
            throw new FighterWrongFormatException("FightSeries cannot start or end with whitespace.");
        }

    }

}
