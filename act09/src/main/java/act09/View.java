package act09;

import com.mrjaffesclass.apcs.messenger.*;
import javax.swing.JLabel;

public class View extends javax.swing.JFrame implements MessageHandler {

  private final Messenger mvcMessaging;
  private final JLabel[] cards;
  /**
   * Creates a new view
   * @param messages mvcMessaging object
   */
  public View(Messenger messages) {
    mvcMessaging = messages;   // Save the calling controller instance
    initComponents();           // Create and init the GUI components
    cards = new JLabel[9]; 
  }
  /**
   * Initialize the model here and subscribe
   * to any required messages
   */
  public void init() {

  }
  
  /**
   * The model must implement messageHandler so the Model can process
   * messages sent from the View.  messagePayload can be any object, but
   * it must be cast into the expected class.
   * @param messageName
   * @param messagePayload 
   */
  @Override
  public void messageHandler(String messageName, Object messagePayload) {
    switch(messageName) {
            
      default: {
        
      }
    }
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        card1 = new javax.swing.JLabel();
        card2 = new javax.swing.JLabel();
        card3 = new javax.swing.JLabel();
        card4 = new javax.swing.JLabel();
        card5 = new javax.swing.JLabel();
        card6 = new javax.swing.JLabel();
        card7 = new javax.swing.JLabel();
        card8 = new javax.swing.JLabel();
        card9 = new javax.swing.JLabel();
        cardsLeft = new javax.swing.JLabel();
        clearAllBtn = new javax.swing.JButton();
        directionsLabel = new javax.swing.JLabel();
        gamesPlayed = new javax.swing.JLabel();
        gamesWon = new javax.swing.JLabel();
        newGameBtn = new javax.swing.JButton();
        numberOfCardsLabel = new javax.swing.JLabel();
        numberOfGamesPlayedLabel = new javax.swing.JLabel();
        numberOfGamesWonLabel = new javax.swing.JLabel();
        playBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("cards");

        card1.setText("card1");
        card1.setName("0"); // NOI18N

        card2.setText("card2");
        card2.setName("1"); // NOI18N

        card3.setText("card3");
        card3.setName("2"); // NOI18N

        card4.setText("card4");
        card4.setName("3"); // NOI18N

        card5.setText("card5");
        card5.setName("4"); // NOI18N

        card6.setText("card6");
        card6.setName("5"); // NOI18N

        card7.setText("card7");
        card7.setName("6"); // NOI18N

        card8.setText("card8");
        card8.setName("7"); // NOI18N

        card9.setText("card9");
        card9.setName("8"); // NOI18N

        cardsLeft.setText("cardLeft");

        clearAllBtn.setText("Clear all");
        clearAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllBtnActionPerformed(evt);
            }
        });

        directionsLabel.setText("Click to select a card; click again to de-select");

        gamesPlayed.setText("gamesPlayed");

        gamesWon.setText("gamesWon");

        newGameBtn.setText("New game");
        newGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameBtnActionPerformed(evt);
            }
        });

        numberOfCardsLabel.setText("Number of cards left in the deck:");

        numberOfGamesPlayedLabel.setText("Number of games played:");

        numberOfGamesWonLabel.setText("Number of games won:");

        playBtn.setText("Play");
        playBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(directionsLabel)
                .addGap(125, 125, 125))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(card6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                                .addComponent(card7)
                                .addGap(99, 99, 99)
                                .addComponent(card8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(playBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clearAllBtn)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(card1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(card2)
                                .addGap(79, 79, 79)
                                .addComponent(card3)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(card4)
                                .addGap(80, 80, 80))
                            .addComponent(cardsLeft)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(card9)
                                .addComponent(newGameBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(card5)))
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(numberOfGamesPlayedLabel)
                    .addComponent(numberOfGamesWonLabel)
                    .addComponent(numberOfCardsLabel))
                .addGap(75, 75, 75)
                .addComponent(gamesPlayed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(390, Short.MAX_VALUE)
                    .addComponent(gamesWon)
                    .addGap(151, 151, 151)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(directionsLabel)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(card1)
                    .addComponent(card2)
                    .addComponent(card4)
                    .addComponent(card5)
                    .addComponent(card3))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(card6)
                    .addComponent(card7)
                    .addComponent(card9)
                    .addComponent(card8))
                .addGap(51, 51, 51)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearAllBtn)
                    .addComponent(newGameBtn)
                    .addComponent(playBtn))
                .addGap(32, 32, 32)
                .addComponent(numberOfCardsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardsLeft)
                .addGap(19, 19, 19)
                .addComponent(numberOfGamesWonLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberOfGamesPlayedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gamesPlayed))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(420, Short.MAX_VALUE)
                    .addComponent(gamesWon)
                    .addGap(67, 67, 67)))
        );

        card1.getAccessibleContext().setAccessibleName("0");
        card2.getAccessibleContext().setAccessibleName("1");
        card4.getAccessibleContext().setAccessibleName("3");
        card5.getAccessibleContext().setAccessibleName("4");
        card5.getAccessibleContext().setAccessibleDescription("");
        card6.getAccessibleContext().setAccessibleName("5");
        card7.getAccessibleContext().setAccessibleName("6");
        card7.getAccessibleContext().setAccessibleDescription("");
        card8.getAccessibleContext().setAccessibleName("7");
        card9.getAccessibleContext().setAccessibleName("8");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playBtnActionPerformed

    private void clearAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearAllBtnActionPerformed

    private void newGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newGameBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel card1;
    private javax.swing.JLabel card2;
    private javax.swing.JLabel card3;
    private javax.swing.JLabel card4;
    private javax.swing.JLabel card5;
    private javax.swing.JLabel card6;
    private javax.swing.JLabel card7;
    private javax.swing.JLabel card8;
    private javax.swing.JLabel card9;
    private javax.swing.JLabel cardsLeft;
    private javax.swing.JButton clearAllBtn;
    private javax.swing.JLabel directionsLabel;
    private javax.swing.JLabel gamesPlayed;
    private javax.swing.JLabel gamesWon;
    private javax.swing.JButton newGameBtn;
    private javax.swing.JLabel numberOfCardsLabel;
    private javax.swing.JLabel numberOfGamesPlayedLabel;
    private javax.swing.JLabel numberOfGamesWonLabel;
    private javax.swing.JButton playBtn;
    // End of variables declaration//GEN-END:variables

    /**
   * *********** FOR TESTING ONLY -- DO NOT CHANGE OR REMOVE ***********
   */
  public Object get(String prop) {
    switch (prop) {
      case "card1": return card1;
      case "card2": return card2;
      case "card3": return card4;
      case "card4": return card4;
      case "card5": return card5;
      case "card6": return card6;
      case "card7": return card7;
      case "card8": return card8;
      case "card9": return card9;
      case "cards": return cards;
      case "cardsLeft": return cardsLeft;
      case "clearAllBtn": return clearAllBtn;
      case "directionsLabel": return directionsLabel;
      case "gamesPlayed": return gamesPlayed;
      case "gamesWon": return gamesWon;
      case "newGameBtn": return newGameBtn;
      case "numberOfCardsLabel": return numberOfCardsLabel;
      case "numberOfGamesPlayedLabel": return numberOfGamesPlayedLabel;
      case "numberOfGamesWonLabel": return numberOfGamesWonLabel;
      case "playBtn": return playBtn;
      default: return null;
    }
  }
    
}
