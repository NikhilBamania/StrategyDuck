package com.crossasyst.designpattern.strategy.provider.moving;

import com.crossasyst.designpattern.strategy.interfaces.Moving;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MovingWalkFly implements Moving
{

	public boolean canFly()
	{
		return true;
	}

	public void move()
	{
		log.info("Walking anf Flying");
	}

}
