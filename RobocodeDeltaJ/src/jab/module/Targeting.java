package jab.module;

import robocode.util.Utils;

/**
 * Targeting
 * 
 * @author jabier.martinez
 */
public class Targeting extends Part {

	public Module bot;

	public Targeting(Module bot) {
		this.bot = bot;
	}

	public void target() {
		if (bot.enemy != null) {
			double enemyX = bot.enemy.x;
			double enemyY = bot.enemy.y;
			double theta = Utils.normalAbsoluteAngle(Math.atan2(enemyX - bot.getX(), enemyY - bot.getY()));
			bot.setTurnGunRightRadians(Utils.normalRelativeAngle(theta - bot.getGunHeadingRadians()));
		}
	}

}
