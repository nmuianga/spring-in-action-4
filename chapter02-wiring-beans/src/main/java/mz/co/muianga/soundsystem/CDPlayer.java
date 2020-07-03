package mz.co.muianga.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Nilvandro Muianga, Jul 3, 2020
 *
 */
@Component
public class CDPlayer implements MediaPlayer {
	
	private CompactDisc cd;

	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.play();
	}

}
