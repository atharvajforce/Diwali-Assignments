package com.demo.beans;

public class Number {

private int n;

public Number() {
	super();
}

public Number(int n) {
	super();
	this.n = n;
}

public int getN() {
	return n;
}

public void setN(int n) {
	this.n = n;
}

@Override
public String toString() {
	return "Number [n=" + n + "]";
}


}
