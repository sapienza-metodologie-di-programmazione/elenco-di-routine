# L.8.2 Elenco di routine

Creare una classe contenente un elenco di `java.util.function.Function` da **Stringa** a **Intero**.

La classe deve implementare l'interfaccia `Function<String, List<Integer>>` e quindi il metodo `List<Integer> apply(String string)`. 

Il metodo `apply` dovrà restituire una lista di interi, ciascuno dei quali è il risultato di una delle funzioni nell'elenco applicata al parametro `string`  _(di seguito alcuni esempi)_ .

> **NOTA**:
> avete libertà sulle scelte progettuali, ma dovete implementare i metodi richiesti nella classe `Main` per passare i test

## Funzioni da implementare e esempi

I metodi da implementare nella classe `Main` sono

- `lunghezza()`: deve **ritornare un'istanza** il cui metodo `apply()` 
    - calcola la lunghezza della stringa

```java
"ciao" -> [4]
"come va?" -> [8]
```

- `contaY()`: deve **ritornare un'istanza** il cui metodo `apply()` 
    - calcola la lunghezza della stringa 
    - conta il numero di occorrenze del carattere `'y'` nella stringa

```java
"ciao" -> [4, 0]
"come va?" -> [8, 0]
"yyyy" -> [4, 4]
"xyz" -> [3, 1]
```


- `interoDaStringa()`: deve **ritornare un'istanza** il cui metodo `apply()` 
    - calcola la lunghezza della stringa
    - conta le occorrenze del carattere `'y'` nella stringa
    - converte la stringa in intero _(cosa fareste se la stringa fosse "123ciao"?)_ 

```java
"12345" -> [5, 0, 12345]
"999" -> [3, 0, 999]
```


- `somma()`: deve **ritornare un'istanza** il cui metodo `apply()` 
    - calcola la lunghezza della stringa
    - conta le occorrenze del carattere `'y'` nella stringa
    - converte la stringa in intero
    - calcola la somma dei caratteri

```java
"12345" -> [5, 0, 12345, 15]
"999" -> [3, 0, 999, 27]
```





