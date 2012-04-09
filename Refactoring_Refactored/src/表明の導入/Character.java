package •\–¾‚Ì“±“ü;

public abstract class Character
{
    public abstract void Move();
  
    public static void Move(Character character)
    {
        if (character != null)
        {
            character.Move();
        }
    }
}