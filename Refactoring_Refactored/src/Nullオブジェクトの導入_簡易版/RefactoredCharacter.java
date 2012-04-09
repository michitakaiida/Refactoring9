package Nullオブジェクトの導入_簡易版;

public abstract class RefactoredCharacter {
	    public abstract void Move();
	  
	    public static void Move(Character character)
	    {
	        character.Move();
	    }
	}
	  
