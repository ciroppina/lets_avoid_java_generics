package it.ciroppina.lets_avoid_java_generics.app;

import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import it.ciroppina.lets_avoid_java_generics.app.types.BigDecimalType;
import it.ciroppina.lets_avoid_java_generics.app.types.DateType;
import it.ciroppina.lets_avoid_java_generics.app.types.DoubleType;
import it.ciroppina.lets_avoid_java_generics.app.types.IType;
import it.ciroppina.lets_avoid_java_generics.app.types.IntegerType;
import it.ciroppina.lets_avoid_java_generics.app.types.LongType;
import it.ciroppina.lets_avoid_java_generics.app.types.StringType;
import it.ciroppina.lets_avoid_java_generics.app.types.TimeType;
import it.ciroppina.lets_avoid_java_generics.app.types.TimestampType;

public class WithoutAnyGenericFactory {

	public List<IType> creaListaDIVariTypes() {
		List<IType> results= new ArrayList<>();
		results.add(new StringType("1,2,3,5,8,13,21,34,55"));
		results.add(new BigDecimalType(new BigDecimal(1235813.213455d)));
		results.add(new DoubleType(1235813.213455d));
		results.add(new LongType(1235813213455l));
		results.add(new IntegerType(1235813219));
		results.add(new TimestampType(new Timestamp(new Date().getTime())));
		results.add(new DateType(new Date()));
		results.add(new TimeType(new Time(new Date().getTime())));
		
		return results;
	}

}
