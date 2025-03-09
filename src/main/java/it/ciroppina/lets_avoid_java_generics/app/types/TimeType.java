package it.ciroppina.lets_avoid_java_generics.app.types;

import java.sql.Time;

public class TimeType implements IType {

	private Time _value;
	
	public TimeType(Time value) {
		this._value=value;
	}
	
	@Override
	public Time getValue() {
		return this._value != null ? this._value : null;
	}

}
