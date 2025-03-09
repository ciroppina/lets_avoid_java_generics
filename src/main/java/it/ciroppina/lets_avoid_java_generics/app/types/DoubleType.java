package it.ciroppina.lets_avoid_java_generics.app.types;

public class DoubleType implements IType {

	private Double _value;
	
	public DoubleType(Double value) {
		this._value=value;
	}
	
	@Override
	public Double getValue() {
		return this._value != null ? this._value : 0d;
	}

}
