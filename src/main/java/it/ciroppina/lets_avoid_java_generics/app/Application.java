package it.ciroppina.lets_avoid_java_generics.app;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("it.ciroppina")
public class Application {

	public static void main(String[] args)  {
		SpringApplication.run(Application.class, args);
		
		// TESTs
		String result = null;
		WithoutAnyGenericFactory factory = new WithoutAnyGenericFactory();
		
		try {
			List<Object> lista = factory.creaListaDIVariTypes();
			for (Object o : lista) {
				Class<?> clazz = Class.forName( o.getClass().getCanonicalName());
				String v = clazz.toGenericString();
				System.out.println("type is: " +v);
				// trying to cast
			    System.out.println("value is: " +(o.getClass().cast(o)) );
			}
		} catch(Throwable t) {
			result = t.getLocalizedMessage();
			System.err.println("\n\t Exception result: " +(result==null ? "null" : result) +"\n");
		}
	}

}
