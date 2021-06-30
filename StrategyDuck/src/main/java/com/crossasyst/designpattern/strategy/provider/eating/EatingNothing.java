package com.crossasyst.designpattern.strategy.provider.eating;

import com.crossasyst.designpattern.strategy.interfaces.Eating;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EatingNothing implements Eating
{

	public void eat()
	{
		log.info("Can't Eat");
	}

}
