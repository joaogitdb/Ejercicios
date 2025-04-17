package com.restpersonalejercicio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="personal_pc")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalPC {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private Integer ramMemory;
    private String cpu;
    private String graphicCard;
    private Double cpuFreq;
    private String brand;
    private String model;
    private Boolean hasScreen;
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
   
}
