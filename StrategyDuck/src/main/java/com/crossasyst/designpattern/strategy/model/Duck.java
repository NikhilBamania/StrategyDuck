package com.crossasyst.designpattern.strategy.model;

import com.crossasyst.designpattern.strategy.interfaces.Eating;
import com.crossasyst.designpattern.strategy.interfaces.Moving;
import com.crossasyst.designpattern.strategy.interfaces.Quacking;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class Duck
{
	private Eating eating;
	private Moving moving;
	private Quacking quacking;

	public void eat()
	{
		if (eating != null)
		{
			eating.eat();
		}
		else
		{
			log.info("Please inject Eating implementation");
		}
	}

	public void move()
	{

		if (moving != null)
		{
			moving.move();
		}
		else
		{
			log.info("Please inject Moving implementation");
		}
	}

	public void quack()
	{

		if (quacking != null)
		{
			quacking.quack();
		}
		else
		{
			log.info("Please inject Quacking implementation");
		}
	}

	public void canFly()
	{

		if (moving != null)
		{
			moving.canFly();
		}
		else
		{
			log.info("Please inject Moving implementation");
		}
	}
}
