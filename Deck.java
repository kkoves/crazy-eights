/**
 * Deck Class
 * Uses ArrayList class to make a standard 52-card deck.
 * @authors Krisztián Köves, Brendon Boldt
 * @date 9/29/2014
 */

import java.util.ArrayList;
import java.util.Random;

public class Deck {
  ArrayList<Card> cards;
  ArrayList<Card> discards;
  
  Card.Suit discardsuit;
  Card.Rank discardrank;
  
  Random rand;
  
  public Deck() {
    cards = new ArrayList<Card>();
    discards = new ArrayList<Card>();
    rand = new Random(0);
    
    for(Card.Rank r : Card.Rank.values()) {
      for(Card.Suit s : Card.Suit.values())
        cards.add(new Card(r,s));
    }
    
    shuffle();
  }
  
  public void shuffle() {
    for(int i=0; i < cards.size(); i++)
    {
      Card temp = cards.get(i);
      int r = rand.nextInt(cards.size());
      cards.set(i, cards.get(r));
      cards.set(r, temp);
    }
  }
  
  public Card draw() {
    if(!cards.isEmpty())
      return cards.remove(cards.size()-1); //remove() returns card removed, return that as end result
    else {
      while(discards.size() > 1) //transfer discards (except head of discards) into deck
      {
        cards.set(i,discards.remove(0));
      }
      shuffle(); //re-shuffle after transferring discards into deck
      return null;
    }
  }
  
  public void discard(Card card) {
    discards.add(card);
    setDiscardSuit(card.getSuit());
    discardrank = card.getRank();
  }
  
  public Card.Rank getDiscardRank() {
    return discardrank;
  }
  
  public Card.Suit getDiscardSuit() {
    return discardsuit;
  }
  
  public void setDiscardSuit(Card.Suit s) {
    discardsuit = s;
  }
  
  @Override
  public String toString() {
    String s = "";
    
    s = s + "Deck has " + cards.size() + " cards.\n";
    
    for(int i = 0; i < 10; ++i)
      s = s + (i+1) + ". " + cards.get(i) + "\n";
    
    s = s + "\nDiscard pile has " + discards.size() + " cards.\n";
    if(discards.size() > 0)
       s = s + "Top card of discard pile: " + discards.get(discards.size()-1);
    
    return s;
  }
  
  public static void main(String[] args) {
    Deck d = new Deck();
    d.shuffle();
    d.discard(d.draw());
    System.out.println(d);
  }
}