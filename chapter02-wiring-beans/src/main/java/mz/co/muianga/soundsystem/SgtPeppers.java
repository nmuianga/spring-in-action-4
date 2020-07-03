package mz.co.muianga.soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author Nilvandro Muianga, Jul 3, 2020
 *
 */
@Component
public class SgtPeppers implements CompactDisc {
	
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
