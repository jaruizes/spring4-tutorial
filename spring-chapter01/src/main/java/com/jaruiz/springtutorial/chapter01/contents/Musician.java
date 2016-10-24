package com.jaruiz.springtutorial.chapter01.contents;

import org.springframework.stereotype.Component;

@Component
public class Musician {

	private String name;
	private Instrument instrument;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public String toString() {
		return "Musician [name=" + name + ", instrument=" + getInstrument() + "]";
	}
}
