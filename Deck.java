/**
 * Deck Class
 * Uses ArrayList class to make a standard 52-card deck.
 * @authors Krisztián Köves, Brendon Boldt
 * @date 9/29/2014
 */

import java.util.ArrayList;

public class Deck {
  ArrayList<Card> cards;
  
  public Deck() { 
    cards = new ArrayList<Card>();
    
    for(Card.Rank r : Card.Rank.values()) {
      for(Card.Suit s : Card.Suit.values())
        cards.add(new Card(r,s));
    }
  }
  
  @Override
  public String toString() {
    String s = "";
    
    for(int i = 0; i < 10; ++i)
      s = s + (i+1) + ". " + cards.get(i) + "\n";
    
    return s;
  }
  
  public static void main(String[] args) { 
    Deck d = new Deck();
    System.out.println(d);
  }
}