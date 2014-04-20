package br.com.zaul.jaxb.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="estado")
@XmlAccessorType(XmlAccessType.FIELD)
public class State {

	@XmlElement(name="nome")
	private String name;
	
	@XmlElementWrapper(name="cidades")
	@XmlElement(name="cidade")
	private List<City> cities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
}
