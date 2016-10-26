package com.jaruiz.springtutorial.chapter01;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jaruiz.springtutorial.chapter01.contents.Instrument;
import com.jaruiz.springtutorial.chapter01.contents.MusicBand;
import com.jaruiz.springtutorial.chapter01.contents.Musician;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringChapter01Config.class)
public class SpringChapter01JavaConfigTests {

	@Autowired
	private MusicBand musicBand;
	
	@Test
	public void contextLoads() {
		assertNotNull(musicBand);
		List<Musician> musicians = musicBand.getMusicians();
		System.out.println(musicians);
		assertTrue(musicians != null && musicians.size() == 5);
		for (Musician m : musicians) {
			Instrument i = m.getInstrument();
			assertNotNull(i);
			assertTrue(m.getName().equalsIgnoreCase(i.getName()));
		}
	}
	
		

}
