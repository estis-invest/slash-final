package com.efpcode.tournament.domain;


public record Tournament (
        TournamentId tournamentId,
        TournamentName tournamentName,
        TournamentStatus tourStatus,
        TournamentSize tournamentSize
){
}
