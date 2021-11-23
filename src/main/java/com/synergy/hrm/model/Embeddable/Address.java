package com.synergy.hrm.model.Embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Address {
    @Column(name = "street")
    private String street;

    @Column(name = "town")
    private String town;

    @Column(name = "province")
    private String province;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "country")
    private String country;
}
