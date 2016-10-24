package com.jaruiz.springtutorial.chapter01.contents;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MusicBand {
	
	private List<Musician> musicians;

	public List<Musician> getMusicians() {
		return musicians;
	}

	public void setMusicians(List<Musician> musicians) {
		this.musicians = musicians;
	}
}
