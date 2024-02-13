# Třídy, objekty a JavaBeany

## Cvičení

Vždy po implementaci každého bodu si ověřte, že vám kód správně funguje. Tj. nejen, že setter ekceptuje správnou hodnotu, ale také že se vypíše chyba, když se pokusíte nastavit špatnou hodnotu.

1. Do třídy `Osoba` přidejte properties typu `String` pro soukromý a pracovní e-maily (nazvěte je třeba `soukromyEmail` a `pracovniEmail`). Obě vlastnosti budou pro čtení i zápis, tj. budou mít getter i setter.
1. Vytvořte třídu `Adresa`.
1. Přidejte do třídy `Adresa` čtyři vlastnosti, všechny typu `String`:
  * `ulice` (do této property se budou ukládat i čísla domu)
  * `castObce`
  * `obec`
  * `psc` (typ by mohl být i číslo, ale počítejme s tím, že chceme vždy právě 5 číslic a na začítku teoreticky mohou být nuly)
1. Pro všechny vlastnosti ve třídě `Adresa` vytvořte gettery a settery.
1. Settery upravte tak, aby kontrolovaly, že `ulice`, `obec` a `psc` nesmí být `null` a nesmí to být prázdný `String`. Pokud je zadaná hodnota chybná, vypište chybu do konzole a field ve třídě ponechte bezezměny.
1. U PSČ navíc zkontrolujte, že délka textu je přesně 5 znaků (budeme brát v úvahu jen PSČ bez mezer).
1. Do třídy `Osoba` přidejte vlastnost `adresa` typu `Adresa`, vlastnost bude určená pro čtení i zápis.
1. *Bonus*: Při nastavování PSČ (setter `Adresa.setPsc()`) ověřte také to, že PSČ obsahuje jenom číslice. K tomu se bude hodit třída [java.util.regex.Pattern](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/regex/Pattern.html).

## Dokumentace (JavaDoc)
* [java.lang.String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html)
* [java.util.Objects](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Objects.html)
