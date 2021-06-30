package com.crossasyst.designpattern.strategy.provider.quacking;

import com.crossasyst.designpattern.strategy.interfaces.Quacking;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuackingNormal implements Quacking
{

	public void quack()
	{
		log.info("Quacking..");
	}

}
