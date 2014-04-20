package br.com.zaul.jaxb;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.zaul.jaxb.domain.City;
import br.com.zaul.jaxb.domain.State;

public class JaxbTest {
	
	private static final String FILE_LOCATION = "./jaxb.xml";
	
	private static State state;
	
	@BeforeClass
	public static void setUp() {
		state = new State();
		state.setName("Minas Gerais");
		state.setCities(new ArrayList<City>());
		
		state.getCities().add(generateCity("Belo Horizonte", "Cruzeiro"));
		state.getCities().add(generateCity("Formiga", "Vila"));
	}
	
	private static City generateCity(String name, String bestSoccerTeam) {
		City city = new City();
		city.setName(name);
		city.setBestSoccerTeam(bestSoccerTeam);
		
		return city;
	}
	
	@Test
	public void testJaxbMarshallingAndUnmarshalling() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(State.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		marshaller.marshal(state, new File(FILE_LOCATION));
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		State state = (State) unmarshaller.unmarshal(new File(FILE_LOCATION));
		
		Assert.assertEquals("Minas Gerais", state.getName());
	}

}
