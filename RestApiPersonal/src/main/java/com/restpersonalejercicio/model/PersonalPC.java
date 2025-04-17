package com.restpersonalejercicio.model;

import javax.persistence.*;
import lombok.*;

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

	public Integer getRamMemory() {
		return ramMemory;
	}

	public void setRamMemory(Integer ramMemory) {
		this.ramMemory = ramMemory;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGraphicCard() {
		return graphicCard;
	}

	public void setGraphicCard(String graphicCard) {
		this.graphicCard = graphicCard;
	}

	public Double getCpuFreq() {
		return cpuFreq;
	}

	public void setCpuFreq(Double cpuFreq) {
		this.cpuFreq = cpuFreq;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Boolean getHasScreen() {
		return hasScreen;
	}

	public void setHasScreen(Boolean hasScreen) {
		this.hasScreen = hasScreen;
	}

	@Override
	public String toString() {
		return "PersonalPC [id=" + id + ", ramMemory=" + ramMemory + ", cpu=" + cpu + ", graphicCard=" + graphicCard
				+ ", cpuFreq=" + cpuFreq + ", brand=" + brand + ", model=" + model + ", hasScreen=" + hasScreen + "]";
	}
    
    
   
}
