/**
 * Card Class
 * Class to represent a playing card, implements ICard interface
 * @authors Kriszti�n K�ves, Brendon Boldt
 * @date 9/29/2014

public class Card implements ICard {
  Rank rank;
  Suit suit;
  
  public static void main(String[] args) { 
    System.out.println(new Card(Card.Rank.Ace,Card.Suit.Spades));
    System.out.println(new Card(Card.Rank.Jack,Card.Suit.Diamonds));
    System.out.println(new Card(Card.Rank.Two,Card.Suit.Clubs));
  }
  
  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }
  
  public Rank getRank() {
    return this.rank;
  }
  
  public Suit getSuit() {
    return this.suit;
  }
       
  @Override
  public String toString() {
    return rank + " of " + suit;
  } 
}