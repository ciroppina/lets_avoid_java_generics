package it.ciroppina.lets_avoid_java_generics.app.types;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalType implements IType {

	private BigDecimal _value;
	
	public BigDecimalType(BigDecimal value) {
		this._value=value;
	}
	
	public BigDecimalType(double value) {
		this._value=new BigDecimal(value);
	}

	@Override
	public BigDecimal getValue() {
		return this._value != null ? this._value.setScale(6, RoundingMode.HALF_UP) //
			: new BigDecimal(0d);
	}

}
