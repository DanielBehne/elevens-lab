package act07;

import com.mrjaffesclass.apcs.messenger.*;

/**
 * The model represents the data used by the Elevens game.
 */
public class Model implements MessageHandler {

  // Messaging system for the MVC
  private final Messenger mvcMessaging;

  // Game state variables
  // TO BE COMPLETED IN ACTIVITY 07
  Constants constants = new Constants();
  String[] RANKS = constants.RANKS;
  String[] SUITS = constants.SUITS;
  int[] POINT_VALUES = constants.POINT_VALUES;
  int BOARD_SIZE = constants.BOARD_SIZE;
  int YOU_WIN = constants.YOU_WIN;
  int YOU_LOSE = constants.YOU_LOSE;
  int IN_PLAY = constants.IN_PLAY;
  

  /**
   * Model constructor: Create the data representation of the program
   * @param messages Messaging class instantiated by the Controller for 
   *   local messages between Model, View, and controller
   */
  public Model(Messenger messages) {
    // This is for the messaging
    mvcMessaging = messages;    
  }
  
  /**
   * Initialize the model here and subscribe to any required messages
   */
  public void init() {
    // TO BE COMPLETED IN ACTIVITY 07
    Deck deck = new Deck(RANKS,SUITS,POINT_VALUES);
    Card[] board = new Card[9];
    boolean[] cardSelected = new boolean[9];
    
  }
  
 /**
   * The model must implement messageHandler so it can process
   * messages sent from the View.  messagePayload can be any object, but
   * it must be cast into the expected class.
   * @param messageName
   * @param messagePayload 
   */
  @Override
  public void messageHandler(String messageName, Object messagePayload) {
    switch (messageName) {
            
      default: {
        
      }
    }
  }
  
  /**
   * *********** FOR TESTING ONLY -- DO NOT CHANGE OR REMOVE ***********
   * Method to access private fields
   */
  public Object get(String prop) {
    switch (prop) {
      case "gameStatus": return gameStatus;
      case "deck":  return deck;
      case "board":  return board;
      case "cardSelected":  return cardSelected;
      case "validSelection": return validSelection;
      case "gameWon": return gameWon;
      case "gamesWon": return gamesWon;
      case "gamesPlayed": return gamesPlayed; 
      default: return null;
    }
  }
  
}
