package com.crossasyst.designpattern.strategy.provider.eating;

import com.crossasyst.designpattern.strategy.interfaces.Eating;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Eatingcereal implements Eating
{

	public void eat()
	{
		log.info("Eating Fish");
	}

}
