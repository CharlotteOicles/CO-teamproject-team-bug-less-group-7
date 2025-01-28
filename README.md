# Bug Jump
Bug Jump is a 2D platformer game starring a prey mantis. The prey mantis must find food for its family. But, to get food, the prey mantis must overcome many obstacles(hard jumps) and enemies(beatle, flower, worm, and spider).

The prey mantis can obtain a melee/handheld weapon to kill the enemies, and collect colletables(hearts, and stars) to assist them through battle.
Atleast one star is required to complete a level (there are a total of 8 levels)

Comp 55 Revival Project:

My plan for the Comp 55 Revival project was to change the image retrieval methods for EnemyType and CollectableType, which were enums that assigned types to objects of the Enemy and Collectable classes respectively. They used a switch case and toString method to assign types to images, which had the consequence of hard coding the image paths and making it less efficient. I used a constructor and changed the toString method to get the image path directly.
If you're wondering why this commit is so recent and why I'm speaking in the past tense, it's because I was silly and didn't check if I had the most up-to-date Readme file on my branch before pushing, so while I pushed my functional code, I also erased the Readme edits I made two days ago. If I recall correctly, the pseudocode looked something like this:

Declare Enum
	Constructor that pairs collectible types to their respective image paths while declaring the types
	
	ImagePath variable declaration

  Method to assign image path to paired type

  Image path getter
    
  Static variable that chooses type

  ToString method that returns type and image path
