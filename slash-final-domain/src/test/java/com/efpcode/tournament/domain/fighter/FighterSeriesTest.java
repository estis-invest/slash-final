package com.efpcode.tournament.domain.fighter;

import com.efpcode.tournament.domain.fighter.exceptions.FighterEmptyException;
import com.efpcode.tournament.domain.fighter.exceptions.FighterWrongFormatException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;


class FighterSeriesTest {
    @ParameterizedTest
    @DisplayName("Null and Blank throws error")
    @NullAndEmptySource
    @ValueSource(strings = {"   ", "\t", "\n"})
    void nullAndBlankThrowsError(String testSeriesName) {
        assertThatThrownBy(() -> new FighterSeries(testSeriesName))
                .isInstanceOf(FighterEmptyException.class)
                .hasMessageContaining("FighterSeries cannot be created with empty or null.");





    }

    @ParameterizedTest
    @DisplayName("SeriesNames cannot start or end with whitespace throws error")
    @ValueSource(strings = {" Title", "Title ", "Title\t", "\tTitle", "\nTitle", "Title\n", "Title  "})
    void seriesNamesCannotStartOrEndWithWhitespaceThrowsError(String badSeriesNames) {


        assertThatThrownBy(() -> new FighterSeries(badSeriesNames))
                .isInstanceOf(FighterWrongFormatException.class)
                .hasMessageContaining("FightSeries cannot start or end with whitespace.");



    }

    @Test
    @DisplayName("SeriesNames can create proper object if input is correct")

    void seriesNamesCanCreateProperObjectIfInputIsCorrect() {

        var correctSeriesName = "Dragon Ball";

        var result = new FighterSeries(correctSeriesName);

        assertThat(result.series()).isEqualTo(correctSeriesName);


    }

}