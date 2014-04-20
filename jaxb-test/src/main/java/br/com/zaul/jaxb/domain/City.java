package br.com.zaul.jaxb.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="cidade")
@XmlAccessorType(XmlAccessType.FIELD)
public class City {
	
	@XmlElement(name="nome")
	private String name;
	
	@XmlElement(name="melhorTimeDeFutebol")
	private String bestSoccerTeam;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBestSoccerTeam() {
		return bestSoccerTeam;
	}

	public void setBestSoccerTeam(String bestSoccerTeam) {
		this.bestSoccerTeam = bestSoccerTeam;
	}
	
	

}
