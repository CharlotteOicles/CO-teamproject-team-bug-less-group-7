package BugJumpApplication;

public enum EnemyType {
	FLOWER("/Images/sunflower.png"),
	SPIDER("/Images/spider.png"),
	WORM("/Images/rightWorm.png"),
	BEETLE("/Images/rightBeetle.png"),
	NONE("n/a");
	
	private final String imagePath;
	
	EnemyType(String imagePath) {
        this.imagePath = imagePath;
    }
	
	public String getImagePath() {
        return imagePath;
    }
	
	public static EnemyType getType(int num) {
        if (num < 0 || num >= values().length) {
            return NONE;
        }
        return values()[num];
    }
}