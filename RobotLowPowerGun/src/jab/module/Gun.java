package jab.module;

import jab.module.Gun;
import jab.module.Module;
import robocode.Rules;
import robocode.Bullet;
import jab.module.Gun;
import jab.module.Module;
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
		bot.registerBullet(bot.setFireBullet(1));
	}

}
