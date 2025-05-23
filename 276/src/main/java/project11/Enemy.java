package project11;

/**
 * Enemy class to extend GameObject
 */
public abstract class Enemy extends GameObject {
    /**
     * Damage value
     */
    protected int damage;

    /**
     * Make an enemy which extends GameObject
     * @param x X Coordinate of Enemy
     * @param y Y Coordinate of Enemy
     * @param damage Damage value
     * @param typeId Holds enemy id
     */
    public Enemy(int x, int y, int damage, int typeId) {
        super(x, y, true, typeId);
        this.damage = damage;
    }

    /**
     * Abstract method to set the difficulty of the enemy
     * @param difficulty Difficulty 
     */
    public abstract void setDifficulty(int difficulty);
    
    /**
     * Get X value
     * @return x X value
     */
    public int getX() {
        return x;
    }
    /**
     * Get Y value
     * @return y Y value
     */
    public int getY() {
        return y;
    }
    /**
     * Set X value
     * @param x X value
     */
    public void setX(int x) {
        this.x = x;
    }
    /**
     * Set Y value
     * @param y Y value
     */
    public void setY(int y) {
        this.y = y;
    }
    /**
     * Get damage value
     * @return damage Damage value
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Moves the enemy towards the player depending on the players position and obstacle collision
     * @param player Player object
     */
public void moveTowardsPlayer(Player player) {
    int playerX = player.getX();
    int playerY = player.getY();

    int deltaX = playerX - this.x;
    int deltaY = playerY - this.y;

    if (Math.abs(deltaX) > Math.abs(deltaY)) {
        // Try horizontal movement first
        if (deltaX > 0) {
            this.x++; // Move right
        } else {
            this.x--; // Move left
        }
    } else {
        // Try vertical movement
        if (deltaY > 0) {
            this.y++; // Move down
        } else {
            this.y--; // Move up
        }
    }
}

}
