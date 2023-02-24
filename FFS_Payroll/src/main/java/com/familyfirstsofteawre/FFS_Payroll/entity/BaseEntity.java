package com.familyfirstsofteawre.FFS_Payroll.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BaseEntity {

    @Id
    @GeneratedValue( strategy =  GenerationType.AUTO)
    Long id;

}
