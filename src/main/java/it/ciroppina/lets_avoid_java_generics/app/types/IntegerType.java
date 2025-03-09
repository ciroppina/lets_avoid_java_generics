package it.ciroppina.lets_avoid_java_generics.app.types;

public class IntegerType implements IType {

	private Integer _value;
	
	public IntegerType(Integer value) {
		this._value=value;
	}
	
	@Override
	public Integer getValue() {
		return this._value != null ? this._value : 0;
	}

}
