package com.crossasyst.designpattern.strategy.provider.moving;

import com.crossasyst.designpattern.strategy.interfaces.Moving;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MovingWalkOnly implements Moving
{

	public boolean canFly()
	{
		return false;
	}

	public void move()
	{
		log.info("Walking...");
	}

}
