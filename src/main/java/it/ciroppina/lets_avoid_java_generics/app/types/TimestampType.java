package it.ciroppina.lets_avoid_java_generics.app.types;

import java.sql.Timestamp;

public class TimestampType implements IType {

	private Timestamp _value;
	
	public TimestampType(Timestamp value) {
		this._value=value;
	}
	
	@Override
	public Timestamp getValue() {
		return this._value != null ? this._value : null;
	}

}
