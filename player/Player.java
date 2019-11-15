package environment;
import javax.swing.*;
import java.awt.*;
public class Player extends JComponent {

	// Instance Variables
	private static final long serialVersionUID = 1L;
	double damage;
	double power;
	int total_air_juggle;
	int current_combo;
	int x_pos, y_pos;
	int player_width;
	int player_height;
	int drop_rate;
	int pointOfContact_bottom_left = x_pos + player_height;
	
	/**
	 * No argument constructor for the player.
	 */
	public Player() {
		damage = 0;
		power = 1.0;
		total_air_juggle = 0;
		current_combo = 0;
		drop_rate = 1;
		player_width = 60;
		player_height = 80;
		x_pos = 200;
		y_pos = 400;
	}
	
	// This is for future use to add custom players.
//	public Player(double power, int player_width, int player_height ,int drop_rate) {
//		this.power = power;
//		this.player_width = player_width;
//		this.player_height = player_height;
//		this.drop_rate = drop_rate;
//		damage = 0;
//		x_pos = 200;
//		y_pos = 400;
//	}
	
	/**
	 * @return the current damage level of the player.
	 */
	public double getDamage() {
		return damage;
	}

	/**
	 * This allows for the alteration to the damage level.
	 * @param damage this is the damage level of the player.
	 */
	public void setDamage(double damage) {
		this.damage = damage;
	}

	/**
	 * @return the current power level of the player.
	 */
	public double getPower() {
		return power;
	}

	/**
	 * This allows for the alteration to the power level.
	 * @param power this is the power level of the power.
	 */
	public void setPower(double power) {
		this.power = power;
	}

	/**
	 * @return the amount of air juggle combos that the player has made.
	 */
	public int getTotal_air_juggle() {
		return total_air_juggle;
	}

	/**
	 * This allows for the alteration to the total air juggle counter.
	 * @param total_air_juggle provides a counter for the total air juggle.
	 */
	public void setTotal_air_juggle(int total_air_juggle) {
		this.total_air_juggle = total_air_juggle;
	}

	/**
	 * @return The number of consecutive combos a user has.
	 */
	public int getCurrent_combo() {
		return current_combo;
	}

	/**
	 * This allows for the alteration to the current combo variable.
	 * @param current_combo the previous combo amount.
	 */
	public void setCurrent_combo(int current_combo) {
		this.current_combo = current_combo;
	}

	/**
	 * @return the x position of the character.
	 */
	public int getX_pos() {
		return x_pos;
	}

	/**
	 * This allows for the alteration to the x_position.
	 * @param x_pos the x position for the character.
	 */
	public void setX_pos(int x_pos) {
		this.x_pos = x_pos;
	}
	
	public void update_right() {
		this.x_pos = x_pos + 1;
		super.repaint();
	}

	/**
	 * @return the y position of the character.
	 */
	public int getY_pos() {
		return y_pos;
	}

	/**
	 * This allows for the alteration to the y_position.
	 * @param y_pos the y position for the character.
	 */
	public void setY_pos(int y_pos) {
		this.y_pos = y_pos;
	}

	/**
	 * @return the width of the player.
	 */
	public int getPlayer_width() {
		return player_width;
	}

	/**
	 * This allows for alteration to the players width
	 * @param player_width the players width.
	 */
	public void setPlayer_width(int player_width) {
		this.player_width = player_width;
	}

	/**
	 * @return the height of the player.
	 */
	public int getPlayer_height() {
		return player_height;
	}

	/**
	 * This allows for the alteration to the players height.
	 * @param player_height the height of the player.
	 */
	public void setPlayer_height(int player_height) {
		this.player_height = player_height;
	}

	/**
	 * @return the current drop rate value of the character.
	 */
	public int getDrop_rate() {
		return drop_rate;
	}

	/**
	 * This allows for the alteration to the drop rate.
	 * @param drop_rate the drop rate of the player.
	 */
	public void setDrop_rate(int drop_rate) {
		this.drop_rate = drop_rate;
	}

	/**
	 * @return the point of contact on the bottom left.
	 */
	public int getPointOfContact_bottom_left() {
		return pointOfContact_bottom_left;
	}

	/**
	 * This allows for a calculation of the point of contact on the bottom left.
	 * @param pointOfContact_bottom_left the point of contact for the bottom left.
	 */
	public void setPointOfContact_bottom_left(int pointOfContact_bottom_left) {
		this.pointOfContact_bottom_left = pointOfContact_bottom_left;
	}

	/**
	 * This allows for the graphics to be drawn onto the screen.
	 */
	public void paintComponent(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(x_pos, y_pos, player_width, player_height);
	}
	
}
