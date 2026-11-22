Ich habe mir dein Skriptum **FSST – Softwareentwicklung mit Java** angesehen. Besonders relevant sind die Abschnitte:

- **Seiten 217–220:** Vererbung, Oberklassen und Unterklassen
- **Seiten 253–257:** Abstrakte Klassen und Methoden, am Beispiel von Zylindern
- **Seiten 260–263:** Interfaces, am Beispiel geometrischer Flächen und Zylinder
- **Seiten 264 ff.:** Polymorphismus

Die folgenden drei Übungen orientieren sich am Aufbau und Schwierigkeitsgrad der Aufgabenstellungen im Skriptum. Sie sind als eigenständige Programmieraufgaben formuliert und werden schrittweise anspruchsvoller.



# **Übungsbeispiel 3 – Tierparkverwaltung**



Schwierigkeitsgrad: Anspruchsvoll

OOP · Vererbung · Abstract · Interfaces · Polymorphismus



**Aufgabenstellung**

Ein Tierpark möchte seine Tiere digital verwalten. Jedes Tier besitzt allgemeine Eigenschaften und Fähigkeiten. Je nach Tierart unterscheiden sich jedoch bestimmte Verhaltensweisen.

**1. Abstrakte Klasse Tier**

Erstelle eine abstrakte Klasse `Tier` mit folgenden Attributen:

- `name: String`
- `alter: int`
- `gewicht: double`

Implementiere:

- Einen Konstruktor zur Initialisierung aller Attribute.
- Getter für sämtliche Attribute.
- `fressen(double menge)`: Erhöht das Gewicht um die angegebene Menge.
- Eine abstrakte Methode `lautGeben()`.
- Eine Methode `getInformation()`, welche alle Eigenschaften des Tieres als String zurückgibt.

**2. Interfaces**

Erstelle zwei Interfaces:

`Schwimmfaehig`

\- `schwimmen()`: Gibt eine Meldung aus, dass das Tier schwimmt.

`Flugfaehig`

\- `fliegen()`: Gibt eine Meldung aus, dass das Tier fliegt.

**3. Unterklassen**

Erstelle folgende Klassen:

**Hund**

- Erbt von `Tier`.
- Implementiert `lautGeben()`.
- Gibt als Laut beispielsweise „Wuff!“ zurück.

**Vogel**

- Erbt von `Tier`.
- Implementiert `Flugfaehig`.
- Implementiert `lautGeben()`.
- Gibt als Laut beispielsweise „Piep!“ zurück.

**Fisch**

- Erbt von `Tier`.
- Implementiert `Schwimmfaehig`.
- Implementiert `lautGeben()`.
- Gibt als Laut beispielsweise „Blubb!“ zurück.

**Ente**

- Erbt von `Tier`.
- Implementiert sowohl `Flugfaehig` als auch `Schwimmfaehig`.
- Implementiert `lautGeben()`.

**4. Klasse Tierpark**

Erstelle eine Klasse `Tierpark`, welche mehrere Tiere verwalten kann.

Attribute:

\- `tiere: Tier[]`

Implementiere folgende Methoden:

- `tierHinzufuegen(Tier tier)`: Fügt ein Tier zum Tierpark hinzu.
- `alleTiereAusgeben()`: Gibt die Informationen aller Tiere aus.
- `alleTiereLautGeben()`: Ruft für jedes Tier die Methode `lautGeben()` auf.
- `alleSchwimmendenTiere()`: Gibt alle Tiere aus, die das Interface `Schwimmfaehig` implementieren.
- `alleFliegendenTiere()`: Gibt alle Tiere aus, die das Interface `Flugfaehig` implementieren.

**5. Testprogramm**

Erstelle eine Klasse `Main`, in welcher:

1. Ein Hund, ein Vogel, ein Fisch und eine Ente erstellt werden.
2. Alle Tiere dem Tierpark hinzugefügt werden.
3. Alle Tiere ausgegeben werden.
4. Alle Tiere ihre jeweiligen Laute von sich geben.
5. Alle schwimmfähigen Tiere ausgegeben werden.
6. Alle flugfähigen Tiere ausgegeben werden.

**Zusatzaufgabe:** Erstelle eine Methode `bewegeTier(Tier tier)`, welche abhängig davon, welche Interfaces das Tier implementiert, die entsprechenden Methoden aufruft.

# **Vergleich der drei Übungen**

| Thema                     | Übung 1 | Übung 2 | Übung 3 |
| ------------------------- | ------- | ------- | ------- |
| Klassen und Objekte       | ✓       | ✓       | ✓       |
| Konstruktoren             | ✓       | ✓       | ✓       |
| Getter                    | ✓       | ✓       | ✓       |
| Vererbung (`extends`)     | ✓       | ✓       | ✓       |
| Abstract-Klassen          | ✓       | ✓       | ✓       |
| Abstract-Methoden         | ✓       | ✓       | ✓       |
| Interfaces (`implements`) | –       | ✓       | ✓       |
| Mehrere Interfaces        | –       | ✓       | ✓       |
| Polymorphismus            | ✓       | ✓       | ✓       |
| Arrays mit Objekten       | ✓       | –       | ✓       |
| `instanceof`              | –       | –       | ✓       |

## **Meine Empfehlung zur Bearbeitungsreihenfolge**

1. **Übung 1:** Konzentriere dich auf Vererbung, Konstruktoren und abstrakte Methoden.
2. **Übung 2:** Übe insbesondere die Trennung zwischen abstrakten Klassen und Interfaces sowie das Implementieren mehrerer Interfaces.
3. **Übung 3:** Versuche, die verschiedenen Konzepte selbstständig zu kombinieren. Besonders wichtig ist hier der Umgang mit Polymorphismus und `instanceof`.

**Wichtiger Hinweis:** Ich habe bewusst keine Lösungen beigefügt. Die Aufgaben sind so formuliert, dass du sie wie eine FSST-Schularbeit selbstständig implementieren kannst. Die dritte Aufgabe verlangt bereits eine Kombination der wesentlichen Konzepte aus dem entsprechenden Skriptum.