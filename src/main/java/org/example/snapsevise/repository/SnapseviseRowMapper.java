package org.example.snapsevise.repository;

import org.example.snapsevise.model.Snapsevise;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SnapseviseRowMapper implements RowMapper<Snapsevise> {

    @Override
    public Snapsevise mapRow(ResultSet rs, int numRow) throws SQLException {
        Snapsevise snapsevise = new Snapsevise();

        snapsevise.setSnapseviseId(rs.getInt("snapseviseId"));
        snapsevise.setSnapseviseRim(rs.getString("snapseviseRim"));

        return snapsevise;
    }
}
