package it.ciroppina.lets_avoid_java_generics.app.types;

public class StringType implements IType {

	String _value="";
	public StringType(String value) {
		this._value=value;
	}
	
	@Override
	public String getValue() {
		return this._value == null ? "" : this._value; 
	}
}
