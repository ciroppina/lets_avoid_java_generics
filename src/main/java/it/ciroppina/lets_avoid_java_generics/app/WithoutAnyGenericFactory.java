package it.ciroppina.lets_avoid_java_generics.app;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WithoutAnyGenericFactory {

	public List<Object> creaListaDIVariTypes() {
		List<Object> results= new ArrayList<>();
		results.add(new String("1,2,3,5,8,13,21,34,55"));
		results.add(new BigDecimal("1235813.213455"));
		results.add(new Double(1235813.213455d));
		results.add(new Timestamp(new Date().getTime()));
		
		return results;
	}

}
