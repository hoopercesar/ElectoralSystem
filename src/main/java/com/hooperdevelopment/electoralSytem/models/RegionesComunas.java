package com.hooperdevelopment.electoralSytem.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// comprovreg (id, comuna, provincia_id, region_id, provincia, region)
@Entity
@Table(name="comprovreg")
public class RegionesComunas {

    public Long id;
    public String comuna;
    public String region;

    @Column(name="id")
    @Id
    public Long getId() {
        return id;
    }

    @Column(name="id")
    @Id
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="comuna")
    public String getComuna() {
        return comuna;
    }
    @Column(name="comuna")
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    @Column(name="region")
    public String getRegion() {
        return region;
    }
    @Column(name="region")
    public void setRegion(String region) {
        this.region = region;
    }
}
