package com.jaruiz.springtutorial.chapter01.contents;

import org.springframework.stereotype.Component;

@Component
public class Instrument {

	private String name;

	/**
	 * @param name
	 */
	public Instrument(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instrument [name=" + name + "]";
	}

	public String getName() {
		return name;
	}	
}
