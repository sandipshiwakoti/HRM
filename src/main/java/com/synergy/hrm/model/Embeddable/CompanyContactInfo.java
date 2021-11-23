package com.synergy.hrm.model.Embeddable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import lombok.Data;

@Embeddable
@Data
public class CompanyContactInfo {
    @Column(name = "company_email")
    private String email;
    @Column(name = "company_fax")
    private String fax;
    @Column(name = "company_phone_number")
    private String phoneNumber;
    @Embedded
    @AttributeOverrides({ @AttributeOverride(name = "street", column = @Column(name = "company_street")),
            @AttributeOverride(name = "town", column = @Column(name = "company_town")),
            @AttributeOverride(name = "province", column = @Column(name = "company_province")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "company_postal_code")),
            @AttributeOverride(name = "country", column = @Column(name = "company_country")),

    })
    private Address companyAddress;
}
