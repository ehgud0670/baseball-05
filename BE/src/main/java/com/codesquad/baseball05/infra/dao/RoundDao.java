package com.codesquad.baseball05.infra.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class RoundDao {

    private final JdbcTemplate jdbcTemplate;

    public RoundDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Object pitch() {
        return null;
    }


}
