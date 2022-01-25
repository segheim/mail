package com.epam.esm.giftcertificatesystem.web;

import com.epam.esm.giftcertificatesystem.entity.Tag;
import com.epam.esm.giftcertificatesystem.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tags")
public class GiftCertificateController {

    private final TagService tagService;

    @Autowired
    public GiftCertificateController(TagService tagService) {
        this.tagService = tagService;
    }

    @GetMapping("/{idTag}")
    public Tag readTag(@PathVariable Long idTag) {
        return new Tag(1L, "One");
    }

//    @GetMapping("/tags/{idTag}")
//    public Tag readTag(@PathVariable Long idTag) {
//        return tagService.findById(idTag);
//    }
}