//package crazyeights;

/**
 * Card interface
 * @authors Krisztián Köves, Brendon Boldt
 * @date 9/15/2014
 */

public interface ICard {
  public Rank getRank();
  public Suit getSuit();
  
  public enum Rank {
    Ace, Two, Three,
    Four, Five, Six, Seven,
    Eight, Nine, Ten,
    Jack, Queen, King;
  }
  
  public enum Suit {
    Clubs, Hearts, Spades, Diamonds;
  }
}