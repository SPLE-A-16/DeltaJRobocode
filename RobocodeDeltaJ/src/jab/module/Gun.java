package jab.module;

import jab.module.Gun;
import robocode.Rules;
import robocode.Bullet;

/**
 * Gun
 * 
 * @author jab
 */
public class Gun extends Part {

	public Module bot;

	public Gun(Module bot) {
		this.bot = bot;
	}

	public void fire() {
		Bullet b = bot.setFire(1);
		bot.registerBullet(b);
	}

}
