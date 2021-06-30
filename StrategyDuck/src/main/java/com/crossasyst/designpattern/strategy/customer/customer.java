package com.crossasyst.designpattern.strategy.customer;

import com.crossasyst.designpattern.strategy.model.Duck;
import com.crossasyst.designpattern.strategy.provider.eating.EatingFish;
import com.crossasyst.designpattern.strategy.provider.eating.EatingNothing;
import com.crossasyst.designpattern.strategy.provider.eating.Eatingcereal;
import com.crossasyst.designpattern.strategy.provider.moving.MovingNothing;
import com.crossasyst.designpattern.strategy.provider.moving.MovingSkipFly;
import com.crossasyst.designpattern.strategy.provider.moving.MovingWalkSwimFly;
import com.crossasyst.designpattern.strategy.provider.quacking.QuackingNormal;
import com.crossasyst.designpattern.strategy.provider.quacking.QuackingNothing;
import com.crossasyst.designpattern.strategy.provider.quacking.Quackingloud;

public class customer
{

	public static void main(String[] args)
	{
		Duck rubberDuck = new Duck(new EatingNothing(), new MovingNothing(), new QuackingNothing());
		rubberDuck.canFly();
		rubberDuck.eat();
		rubberDuck.move();
		rubberDuck.quack();

		Duck SkippingDuck = new Duck(new Eatingcereal(), new MovingSkipFly(), new Quackingloud());
		SkippingDuck.canFly();
		SkippingDuck.eat();
		SkippingDuck.move();
		SkippingDuck.quack();

		Duck SwimmingDuck = new Duck(new EatingFish(), new MovingWalkSwimFly(), new QuackingNormal());
		SwimmingDuck.canFly();
		SwimmingDuck.eat();
		SwimmingDuck.move();
		SwimmingDuck.quack();
	}

}
