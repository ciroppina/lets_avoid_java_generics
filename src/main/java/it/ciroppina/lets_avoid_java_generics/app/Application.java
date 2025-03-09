package it.ciroppina.lets_avoid_java_generics.app;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import it.ciroppina.lets_avoid_java_generics.app.types.IType;

@SpringBootApplication
@ComponentScan("it.ciroppina")
public class Application {

	public static void main(String[] args)  {
		SpringApplication.run(Application.class, args);
		
		// TESTs
		String result = null;
		WithoutAnyGenericFactory factory = new WithoutAnyGenericFactory();
		
		try {
			List<IType> lista = factory.creaListaDIVariTypes();
			for (IType o : lista) {
				//Class<?> clazz = Class.forName( o.getClass().getCanonicalName());
				//String v = clazz.toGenericString();
				System.out.println("type is: " +o.getClass().getCanonicalName());
				// trying to cast
			    System.out.println("\t value is: " +o.getClass().cast(o).getValue() );
			}
		} catch(Throwable t) {
			result = t.getLocalizedMessage();
			System.err.println("\n\t Exception result: " +(result==null ? "null" : result) +"\n");
		}
	}

}
