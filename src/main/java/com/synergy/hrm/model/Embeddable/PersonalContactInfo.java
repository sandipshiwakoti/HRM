package com.synergy.hrm.model.Embeddable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import lombok.Data;

@Embeddable
@Data
public class PersonalContactInfo {
        @Column(name = "email")
        private String email;

        @Column(name = "mobile_number")
        private String mobileNumber;
        @Column(name = "landline_number")
        private String landlineNumber;
        @Embedded
        @AttributeOverrides({ @AttributeOverride(name = "street", column = @Column(name = "permanent_street")),
                        @AttributeOverride(name = "town", column = @Column(name = "permanent_town")),
                        @AttributeOverride(name = "province", column = @Column(name = "permanent_province")),
                        @AttributeOverride(name = "postalCode", column = @Column(name = "permanent_postal_code")),
                        @AttributeOverride(name = "country", column = @Column(name = "permanent_country")),

        })
        private Address permanentAddress;
        @Embedded
        @AttributeOverrides({ @AttributeOverride(name = "street", column = @Column(name = "temporary_street")),
                        @AttributeOverride(name = "town", column = @Column(name = "temporary_town")),
                        @AttributeOverride(name = "province", column = @Column(name = "temporary_province")),
                        @AttributeOverride(name = "postalCode", column = @Column(name = "temporary_postal_code")),
                        @AttributeOverride(name = "country", column = @Column(name = "temporary_country")),

        })
        private Address temporaryAddress;
}
