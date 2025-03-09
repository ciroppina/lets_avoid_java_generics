package it.ciroppina.lets_avoid_java_generics.app.types;

public class LongType implements IType {

	private Long _value;
	
	public LongType(Long value) {
		this._value=value;
	}
	
	@Override
	public Long getValue() {
		return this._value != null ? this._value : 0l;
	}

}
