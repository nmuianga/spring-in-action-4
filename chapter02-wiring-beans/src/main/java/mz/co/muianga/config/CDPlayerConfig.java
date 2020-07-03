package mz.co.muianga.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mz.co.muianga.soundsystem.CDPlayer;
import mz.co.muianga.soundsystem.CompactDisc;
import mz.co.muianga.soundsystem.MediaPlayer;
import mz.co.muianga.soundsystem.SgtPeppers;

/**
 * @author Nilvandro Muianga, Jul 3, 2020
 *
 */
@Configuration
public class CDPlayerConfig {
	
	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	
	@Bean
	public MediaPlayer cdPlayer() {
		return new CDPlayer(sgtPeppers());
	}

}
