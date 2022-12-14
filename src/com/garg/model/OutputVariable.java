package com.garg.model;

public class OutputVariable {
	private double intrinsicValue;
	private double intrinsicValueLower;
	private double intrinsicValueUpper;
	private double conservativeIntrinsicValue;

	public double getIntrinsicValue() {
		return intrinsicValue;
	}

	public void setIntrinsicValue(double intrinsicValue) {
		this.intrinsicValue = intrinsicValue;
	}

	public double getIntrinsicValueLower() {
		return intrinsicValueLower;
	}

	public void setIntrinsicValueLower(double intrinsicValueLower) {
		this.intrinsicValueLower = intrinsicValueLower;
	}

	public double getIntrinsicValueUpper() {
		return intrinsicValueUpper;
	}

	public void setIntrinsicValueUpper(double intrinsicValueUpper) {
		this.intrinsicValueUpper = intrinsicValueUpper;
	}

	public double getConservativeIntrinsicValue() {
		return conservativeIntrinsicValue;
	}

	public void setConservativeIntrinsicValue(double conservativeIntrinsicValue) {
		this.conservativeIntrinsicValue = conservativeIntrinsicValue;
	}

	@Override
	public String toString() {
		return "Conclusion - [intrinsicValue=" + intrinsicValue + ", intrinsicValueLower=" + intrinsicValueLower
				+ ", intrinsicValueUpper=" + intrinsicValueUpper + ", conservativeIntrinsicValue="
				+ conservativeIntrinsicValue + "]";
	}
}
