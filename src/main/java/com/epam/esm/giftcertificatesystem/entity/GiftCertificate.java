package com.epam.esm.giftcertificatesystem.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class GiftCertificate {

    private final Long id;
    private final String name;
    private final String description;
    private final BigDecimal price;
    private final Integer duration;
    private final Date createDate;
    private final Date lastUpdateDate;
    private final List<Tag> tags;

    public GiftCertificate(Long id, String name, String description, BigDecimal price,
                           Integer duration, Date createDate, Date lastUpdateDate, List<Tag> tags) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.duration = duration;
        this.createDate = createDate;
        this.lastUpdateDate = lastUpdateDate;
        this.tags = tags;
    }

}
