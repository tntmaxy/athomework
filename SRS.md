# Feladat
- Egy egyszerű meeting naptár implementálása Java nyelven.
- A feladat elkészítése során használj Mavent és Gitet.
- Az elkészült feladatot egy publikus Git repositoryba kérjük feltölteni.
- Amire nem tér ki a specifikáció a jelölt szabadon döntheti el, hogyan valósítja meg.

## Acceptance Criteria:
- Egy adott hétre lehessen lefoglalni minden hétköznap 09:00 - 17:00 közötti időpontot.\
Ezen intervallumon kívül nem lehet foglalni.
- Foglalni csak egésztől vagy féltől kezdődően lehet.\
Pl: 09:00 vagy 09:30.
- Legkisebb foglalható egység 30 perc vagy annak egész számú többszöröse.
- Maximum 3 óra foglalható.
- Nem lehet átlapolás a foglalások között.
- A feltételek nem teljesülése esetén hibaüzenet megjelenítése.

## Legalább az alábbi eseteket fedje le tesztekkel:
- Háromnál több órás foglalás.
- A foglalás nem 30 perc vagy annak többszöröse.
- A foglalás kívül esik a megadott intervallumon.
- Átlapolás történik.
- A foglalás nem egésztől vagy féltől kezdődik.
- Négy ember ugyanarra a napra két-két órát foglal átfedés nélkül.

## Extra feladatok:
- Teljes heti beosztás kiíratása.
- Lehessen kiírtatni a szabad órákat.
- Egy adott dátumra ÉÉ.HH.NN ÓÓ:PP lehessen megmondai, hogy ki foglalta.
- Spring Boot használata, REST interfész a foglaláshoz és a kiíratásokhoz.