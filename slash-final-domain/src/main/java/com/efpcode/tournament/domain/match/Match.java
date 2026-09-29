package com.efpcode.tournament.domain.match;

import com.efpcode.tournament.domain.TournamentId;
import com.efpcode.tournament.domain.fighter.FighterId;

public record Match(
        MatchId matchId,
        MatchId nextMatchId,
        MatchStatus matchStatus,
        MatchWinner matchWinner,
        FighterId playerOneId,
        FighterId playerTwoId,
        TournamentId tournamentId

) {
}
