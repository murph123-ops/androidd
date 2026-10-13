Sklep internetowy — Java

1. Opis projektu

Projekt przedstawia prosty sklep internetowy napisany w języku Java. Program działa w konsoli i umożliwia wyświetlanie dostępnych produktów, dodawanie ich do koszyka oraz obliczanie łącznej wartości zakupów.

Projekt został wykonany w celu wykorzystania podstaw programowania obiektowego, w szczególności klas, obiektów, dziedziczenia i polimorfizmu.

2. Struktura projektu

Projekt składa się z czterech plików źródłowych:

* Produkt.java — klasa bazowa zawierająca nazwę i cenę produktu. Udostępnia konstruktor, metody pobierające dane oraz metodę wyświetlającą informacje o produkcie.
* Elektronika.java — klasa dziedzicząca po klasie Produkt. Przechowuje dodatkowo okres gwarancji w miesiącach.
* Ubranie.java — klasa dziedzicząca po klasie Produkt. Przechowuje dodatkowo rozmiar ubrania.
* Sklep.java — główna klasa programu zawierająca metodę main(). Odpowiada za menu, listę produktów, obsługę koszyka i obliczanie sumy zakupów.

3. Funkcjonalności

Program umożliwia:

1. Wyświetlanie wszystkich dostępnych produktów.
2. Wyświetlanie szczegółowych informacji o produktach.
3. Dodawanie produktów do koszyka na podstawie ich identyfikatora.
4. Sprawdzanie poprawności wybranego identyfikatora.
5. Wyświetlanie zawartości koszyka.
6. Obliczanie łącznej wartości produktów w koszyku.
7. Zakończenie działania programu.

4. Zastosowane zagadnienia z Javy

W projekcie wykorzystano:

* klasy i obiekty,
* dziedziczenie (extends),
* konstruktory,
* enkapsulację,
* polimorfizm i nadpisywanie metod (@Override),
* listy dynamiczne (ArrayList),
* pobieranie danych od użytkownika (Scanner),
* instrukcje warunkowe (if),
* instrukcję wyboru (switch),
* pętle (for, do while),
* metody i pola klas.

5. Przykładowe produkty

W sklepie znajdują się następujące produkty:

Produkt	Cena	Dodatkowe informacje
Słuchawki	149,99 zł	Gwarancja 24 miesiące
Mysz	79,99 zł	Gwarancja 12 miesięcy
Koszulka	49,99 zł	Rozmiar M
Bluza	119,99 zł	Rozmiar L

6. Obsługa programu

Po uruchomieniu programu wyświetla się menu:

1. Wyświetl produkty
2. Dodaj produkt do koszyka
3. Wyświetl koszyk
4. Zakończ zakupy
Użytkownik wybiera odpowiednią opcję, wpisując jej numer. Program wykonuje wybraną operację i wyświetla odpowiedni komunikat.
