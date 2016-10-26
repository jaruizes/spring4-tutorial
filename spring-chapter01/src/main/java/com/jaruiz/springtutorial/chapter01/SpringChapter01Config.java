package com.jaruiz.springtutorial.chapter01;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.jaruiz.springtutorial.chapter01.contents.Instrument;
import com.jaruiz.springtutorial.chapter01.contents.MusicBand;
import com.jaruiz.springtutorial.chapter01.contents.Musician;

@Configuration
public class SpringChapter01Config {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Instrument instrument(String name) {
		return new Instrument(name);
	}
	
	@Bean
	public Instrument guitar() {
		return new Instrument("guitar");
	}
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Musician musician(String name) {
		Musician m = new Musician();
		m.setName(name);
		m.setInstrument(instrument(name));
		return m;
	}
	
	@Bean
	public Musician guitarrist() {
		Musician m = musician("guitar");
		m.setInstrument(guitar());
		return m;
	}
	
	@Bean
	public MusicBand musicBand() {
		MusicBand mb = new MusicBand();
		List<Musician> musicians = new ArrayList<Musician>();
		musicians.add(musician("guitar"));
		musicians.add(musician("piano"));
		musicians.add(musician("trumpet"));
		musicians.add(musician("saxo"));
		musicians.add(guitarrist());
		mb.setMusicians(musicians);
		
		return mb;
	}	
	
	/*public static void main(String[] args) {
		SpringApplication.run(SpringChapter01Config.class, args);
	}*/
}
