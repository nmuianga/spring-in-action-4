package mz.co.muianga.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import mz.co.muianga.soundsystem.CompactDisc;

/**
 * @author Nilvandro Muianga, Jul 3, 2020
 *
 */
@Configuration
@ComponentScan (basePackageClasses = {CompactDisc.class})
public class CDPlayerConfig {

}
