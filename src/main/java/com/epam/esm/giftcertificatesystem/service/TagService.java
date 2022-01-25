package com.epam.esm.giftcertificatesystem.service;

import com.epam.esm.giftcertificatesystem.dao.TagRepository;
import com.epam.esm.giftcertificatesystem.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagService {

    private final TagRepository tagRepository;

    @Autowired
    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    public Tag findById(Long id) {
        return tagRepository.readById(id);
    }
}
