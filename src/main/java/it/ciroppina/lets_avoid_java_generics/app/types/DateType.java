package it.ciroppina.lets_avoid_java_generics.app.types;

import java.util.Date;

public class DateType implements IType {

	private Date _value;
	
	public DateType(Date value) {
		this._value=value;
	}
	
	@Override
	public Date getValue() {
		return this._value != null ? this._value : null;
	}

}
