package com.codesquad.baseball05.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@AllArgsConstructor
public class Team {

    @Id
    private Long id;

    private String name;

    private List<Player> players;
}