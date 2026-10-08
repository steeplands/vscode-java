3x3 Feld
abwechselndes setzen eines 'X' oder 'O'
sollte es einem Spieler gelingen 3 seiner Zeichen in einer Linie anzuordnen, horizontal, vertical oder diagonal
wenn alle Felder gefüllt sind, und line 3 nicht erfüllt ist, Patt

Spielfeld erstellen (anfangs leer)
Spieler setzen abwechselnd Symbole 
Bei jedem Spielfeld 

```mermaid
---
title: TicTacToe
---

classDiagram
    class TicTacToe {
        - board: Board
        - player1: Player
        - player2: Player
        - currentPlayer: Player

        + TicTacToe()


        + play() void
        - init() void
        - setStone()void
        - hasPlayerWon()boolean
        - isDraw()boolean
        - changePlayer()void
    }
    
    class Board {
        - board: Field[][]
    }
```

UMLet

```mermaid
---
title: TicTacToe
---

classDiagram
    note "From Duck till Zebra"
    Animal <|-- Duck
    note for Duck "can fly<br>can swim<br>can dive<br>can help in debugging"
    Animal <|-- Fish
    Animal <|-- Zebra
    Animal : +int age
    Animal : +String gender
    Animal: +isMammal()
    Animal: +mate()

    class Duck{
        +String beakColor
        +swim()
        +quack()
    }

    class Fish{
        -int sizeInFeet
        -canEat()
    }

    class Zebra{
        +bool is_wild
        +run()
    }
```
