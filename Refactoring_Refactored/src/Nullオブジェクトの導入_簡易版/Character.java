package Nullオブジェクトの導入_簡易版;

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