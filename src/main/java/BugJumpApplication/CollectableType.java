package BugJumpApplication;

public enum CollectableType {
HEART,STAR,CHEESE,HANDHELD,MELEE,NONE;
	
	public CollectableType getType(int num) {
	
	switch(num)	{
		case 0:
			return CollectableType.HEART; 
		case 1:
			return CollectableType.STAR; 
		case 2:
			return CollectableType.CHEESE; 
		case 3:
			return CollectableType.HANDHELD; 
		case 4:
			return CollectableType.MELEE; 	
		}
	return NONE;
		
	}
	public String toString() {
		switch(this) {
			case HEART: return "/Images/heart.png";
			case STAR: return "/Images/star.png";
			case CHEESE: return "/Images/cheese.png";
			case HANDHELD: return "/Images/handheld.png";
			case MELEE: return "/Images/melee.png";
		}
		return "n/a";
	}
	
}

//this version adds a constructor in order to better access images from this enum, and also changes the switch case variable to a static variable
/*
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

    @Override
    public String toString() {
        return name().toLowerCase() + " (Image: " + imagePath + ")";
    }
}

*/