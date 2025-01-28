package BugJumpApplication;

public enum CollectableType {
	HEART("/Images/heart.png"),
    STAR("/Images/star.png"),
    CHEESE("/Images/cheese.png"),
    HANDHELD("/Images/handheld.png"),
    MELEE("/Images/melee.png"),
    NONE("n/a");
	
	private final String imagePath;

    CollectableType(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }
    
    public static CollectableType getType(int num) {
        if (num < 0 || num >= values().length) {
            return NONE;
        }
        return values()[num];
    }
	
}