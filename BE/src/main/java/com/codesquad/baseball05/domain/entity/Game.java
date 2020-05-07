package com.codesquad.baseball05.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@AllArgsConstructor
public class Game {

    @Id
    private Long id;

    private Team homeTeam;

    private Team awayTeam;

    private String userTeam;

    private List<Inning> innings;
}