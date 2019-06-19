package com.chahar.generics;

public class IDemoGenericImpl implements IDemoGeneric<String, Integer> {

	@Override
	public Integer doSomeOperation(String t) {
		return Integer.parseInt(t);
	}

	@Override
	public String doReverseOperation(Integer t) {
		return t.toString();
	}

}
