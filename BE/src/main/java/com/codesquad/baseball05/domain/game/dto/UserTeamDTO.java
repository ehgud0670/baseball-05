package com.codesquad.baseball05.domain.game.dto;

import com.codesquad.baseball05.domain.team.entity.Player;
import com.codesquad.baseball05.domain.team.entity.Team;
import com.codesquad.baseball05.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class UserTeamDTO {

    private User user;

    private Team team;

    private List<Player> players;
}
