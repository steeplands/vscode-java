Ich habe mir dein Skriptum **FSST – Softwareentwicklung mit Java** angesehen. Besonders relevant sind die Abschnitte:

- **Seiten 217–220:** Vererbung, Oberklassen und Unterklassen
- **Seiten 253–257:** Abstrakte Klassen und Methoden, am Beispiel von Zylindern
- **Seiten 260–263:** Interfaces, am Beispiel geometrischer Flächen und Zylinder
- **Seiten 264 ff.:** Polymorphismus

Die folgenden drei Übungen orientieren sich am Aufbau und Schwierigkeitsgrad der Aufgabenstellungen im Skriptum. Sie sind als eigenständige Programmieraufgaben formuliert und werden schrittweise anspruchsvoller.




# **Übungsbeispiel 2 – Elektronische Geräte**



Schwierigkeitsgrad: Mittel

Interfaces · Abstract · Vererbung



**Aufgabenstellung**

Ein Elektronikgeschäft möchte verschiedene elektronische Geräte verwalten. Alle Geräte besitzen gemeinsame Eigenschaften. Manche Geräte können außerdem aufgeladen werden, andere können Daten speichern.

**1. Abstrakte Klasse ElektronischesGeraet**

Erstelle eine abstrakte Klasse `ElektronischesGeraet` mit folgenden Attributen:

- `hersteller: String`
- `modell: String`
- `preis: double`
- `eingeschaltet: boolean`

Implementiere:

- Einen Konstruktor zur Initialisierung aller Attribute.
- Getter für sämtliche Attribute.
- `einschalten()`: Schaltet das Gerät ein.
- `ausschalten()`: Schaltet das Gerät aus.
- Eine abstrakte Methode `getBeschreibung()`, welche eine Beschreibung des Geräts zurückgibt.

**2. Interface Ladbar**

Erstelle ein Interface `Ladbar` mit folgenden Methoden:

- `aufladen(int prozent)`: Erhöht den Akkustand.
- `getAkkustand()`: Gibt den aktuellen Akkustand zurück.

**3. Interface Speicherbar**

Erstelle ein Interface `Speicherbar` mit folgenden Methoden:

- `speichern(String datei)`: Speichert eine Datei.
- `getFreierSpeicher()`: Gibt den freien Speicherplatz in GB zurück.

**4. Unterklasse Smartphone**

Erstelle die Klasse `Smartphone`.

- Erbt von `ElektronischesGeraet`.
- Implementiert `Ladbar` und `Speicherbar`.

Zusätzliche Attribute:

- `akkustand: int`
- `speicher: int`
- `belegterSpeicher: int`

Implementiere alle notwendigen Methoden.

Beim Speichern einer Datei soll der belegte Speicher entsprechend erhöht werden. Es darf nicht mehr Speicher belegt werden, als tatsächlich vorhanden ist.

**5. Unterklasse Notebook**

Erstelle die Klasse `Notebook`.

- Erbt von `ElektronischesGeraet`.
- Implementiert ebenfalls `Ladbar` und `Speicherbar`.

Zusätzliche Attribute:

- `akkustand: int`
- `speicher: int`
- `belegterSpeicher: int`

Implementiere alle notwendigen Methoden.

**6. Testprogramm**

Erstelle eine Klasse `Main`, in welcher:

1. Ein Smartphone und ein Notebook erstellt werden.
2. Beide Geräte eingeschaltet werden.
3. Der Akkustand durch Aufladen verändert wird.
4. Auf beiden Geräten Dateien gespeichert werden.
5. Die Beschreibung, der Akkustand und der freie Speicherplatz ausgegeben werden.

**Zusatzaufgabe:** Erstelle eine Methode, welche ein beliebiges Objekt vom Typ `Ladbar` entgegennimmt und dieses um 10 % auflädt. Die Methode soll sowohl mit einem Smartphone als auch mit einem Notebook funktionieren.

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