package com.synergy.hrm.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.synergy.hrm.model.Embeddable.CompanyContactInfo;
import com.synergy.hrm.model.Embeddable.PersonalContactInfo;

import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private int age;

    @Embedded
    private PersonalContactInfo personalContactInfo;
    @Embedded
    private CompanyContactInfo companyContactInfo;
}
