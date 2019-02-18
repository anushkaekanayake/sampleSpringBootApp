package com.adl.sample.sampleproject.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lesson {
    @Id
    @GeneratedValue
    private Integer id;
    private String leassonName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeassonName() {
        return leassonName;
    }

    public void setLeassonName(String leassonName) {
        this.leassonName = leassonName;
    }
}
