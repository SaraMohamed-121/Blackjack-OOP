# BlackJack Game

## Overview

This project is a simplified version of Blackjack implemented in Java. The game supports up to 3 players and a dealer.
The objective is to get as close to 21 as possible without exceeding it. Players can choose to "Hit" or "Stand" during their turn,
while the dealer plays according to predefined rules.

## File Structure

- **Card.java**: Represents a card with attributes for suit, rank, and value.
- **Player.java**: Manages player details, including their hand, score, and status.
- **Game.java**: Handles game logic, including deck creation, card drawing, and score tracking.
- **BlackJack.java**: Contains the main function to initialize and run the game.

## Instructions

1. **Deck Creation & Initial Card Draw**
   - Create a deck of 52 cards.
   - Deal 2 cards to each player and the dealer.
   - Remove drawn cards from the deck.

2. **Player’s Turn**
   - Players choose to "Hit" or "Stand".
   - Update the player's score based on drawn cards.

3. **Dealer’s Turn**
   - The dealer draws cards until they either reach a score of 21, exceed the maximum player score, or bust.

4. **Game Outcome**
   - Determine the winner or if the game ends in a tie.

## Classes

- **Card**:
  - Attributes: `suit` (0-3), `rank` (0-12), `value` (1-10).
  - Methods: Constructor, Copy Constructor, Getters.

- **Player**:
  - Attributes: `name`, `score`, `cards` (array of 11 `Card` objects), `hasBlackjack` (optional), `hasLost` (optional).
  - Methods: Manage player details.

- **Game**:
  - Attributes: `players` (array of 4), `deck` (array of 52 `Card` objects), `maxScore`.
  - Methods: Generate deck, draw cards, set player information, update scores.

- **BlackJack**:
  - Main function to:
    - Initialize the deck and player details.
    - Manage players' turns.
    - Handle dealer's turn.
    - Determine and display the game result.

## GUI Integration

1. Place the `.java` files and images in the specified directories.
2. Initialize the GUI with:
   ```java
   GUI gui = new GUI();
