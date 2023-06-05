package pe.edu.idat.dsw1L11;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
	private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		Country lunes = new Country();
		lunes.setName("lunes");
		lunes.setCapital("Monday");

		countries.put(lunes.getName(), lunes);


		Country martes = new Country();
		martes.setName("martes");
		martes.setCapital("Tuesday");

		countries.put(martes.getName(), martes);

		Country miercoles = new Country();
		miercoles.setName("miercoles");
		miercoles.setCapital("Wednesday");

		countries.put(miercoles.getName(), miercoles);

		Country jueves = new Country();
		jueves.setName("jueves");
		jueves.setCapital("Thursday");

		countries.put(jueves.getName(), jueves);

		Country viernes = new Country();
		viernes.setName("viernes");
		viernes.setCapital("Friday");

		countries.put(viernes.getName(), viernes);

		Country sabado = new Country();
		sabado.setName("sabado");
		sabado.setCapital("Saturday");

		countries.put(sabado.getName(), sabado);

		Country domingo = new Country();
		domingo.setName("domingo");
		domingo.setCapital("Sunday");

		countries.put(domingo.getName(), domingo);
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The day of the week name must not be null");
		return countries.get(name);
	}
    
}