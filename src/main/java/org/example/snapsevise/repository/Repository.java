package org.example.snapsevise.repository;

import org.example.snapsevise.model.Snapsevise;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    private final JdbcTemplate jdbcTemplate;

    public Repository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Snapsevise> findAlleSnapseviser () {
        String sql = "SELECT * FROM snapsevise";

        List<Snapsevise> snapseviseList = jdbcTemplate.query(sql, new SnapseviseRowMapper());

        return snapseviseList;
    }
}
