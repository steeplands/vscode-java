Ich habe mir dein Skriptum **FSST – Softwareentwicklung mit Java** angesehen. Besonders relevant sind die Abschnitte:

- **Seiten 217–220:** Vererbung, Oberklassen und Unterklassen
- **Seiten 253–257:** Abstrakte Klassen und Methoden, am Beispiel von Zylindern
- **Seiten 260–263:** Interfaces, am Beispiel geometrischer Flächen und Zylinder
- **Seiten 264 ff.:** Polymorphismus

Die folgenden drei Übungen orientieren sich am Aufbau und Schwierigkeitsgrad der Aufgabenstellungen im Skriptum. Sie sind als eigenständige Programmieraufgaben formuliert und werden schrittweise anspruchsvoller.



# **Übungsbeispiel 1 – Fahrzeugverwaltung**



Schwierigkeitsgrad: Einfach

Vererbung · Abstract · OOP



**Aufgabenstellung**

Erstelle ein Java-Programm zur Verwaltung verschiedener Fahrzeuge. Es sollen unterschiedliche Fahrzeugtypen verwaltet werden können, die gemeinsame Eigenschaften besitzen, sich aber in bestimmten Funktionen unterscheiden.

**1. Basisklasse Fahrzeug**

Erstelle eine abstrakte Klasse `Fahrzeug` mit folgenden Attributen:

- `marke: String`
- `modell: String`
- `baujahr: int`
- `geschwindigkeit: double`

Implementiere:

- Einen Konstruktor zur Initialisierung aller Attribute.
- Getter für sämtliche Attribute.
- `beschleunigen(double wert)`: Erhöht die Geschwindigkeit.
- `bremsen(double wert)`: Verringert die Geschwindigkeit. Die Geschwindigkeit darf nicht negativ werden.
- Eine abstrakte Methode `berechneVerbrauch()`.

**2. Unterklasse Auto**

Erstelle die Klasse `Auto`, welche von `Fahrzeug` erbt.

Zusätzliches Attribut:

\- `verbrauchPro100km: double`

Implementiere:

- Einen passenden Konstruktor.
- Die Methode `berechneVerbrauch()`, welche den Verbrauch pro 100 km zurückgibt.

**3. Unterklasse Motorrad**

Erstelle die Klasse `Motorrad`, welche ebenfalls von `Fahrzeug` erbt.

Zusätzliches Attribut:

\- `hubraum: int`

Implementiere:

- Einen passenden Konstruktor.
- Die Methode `berechneVerbrauch()`. Der Verbrauch soll anhand des Hubraums berechnet werden:

\\[ Verbrauch = \frac{hubraum}{100} \\]

**4. Testprogramm**

Erstelle eine Klasse `Main`, in welcher:

1. Ein Auto und ein Motorrad erstellt werden.
2. Beide Fahrzeuge beschleunigt werden.
3. Die Geschwindigkeit und der berechnete Verbrauch ausgegeben werden.
4. Beide Objekte über eine Variable vom Typ `Fahrzeug` angesprochen werden.

**Zusatzaufgabe:** Erstelle ein Array vom Typ `Fahrzeug`, in dem mehrere unterschiedliche Fahrzeuge gespeichert werden. Gib für jedes Fahrzeug den Verbrauch aus.
