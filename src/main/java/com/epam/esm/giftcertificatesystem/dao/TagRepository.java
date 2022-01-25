package com.epam.esm.giftcertificatesystem.dao;

import com.epam.esm.giftcertificatesystem.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TagRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TagRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Tag readById(Long id) {
        return new Tag(1L, "sport");
    }


}
