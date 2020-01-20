# Bitácora #

## Detalles de Cambios ##
~~~ 
- Se reemplazaron todos los números mágicos
- Se cambio un Setting que siempre da lo mismo.
- Se cambio el "fori" por un "for item", para mejor legibilidad del código
- Se quitaron algunos ifs anidados
- Se invirtieron las condiciones de los ifs para mejor legibilidad
- Se aplicó extrajeron métodos para reutilizaciones y mejor legibilidad
- Se invirtieron ifs por switchs permitiendo visualizar el comportamiento por item.getName() quedando dos
- Se duplico el código para ver el comportamiento de cada item.getName(), volviendo un solo switch. 
- Se extrajeron en métodos el comportamiento por cada item.getName() 
- Se separó el comportamiento de SulfurasHandOfRagnaros de los demás ítems normales, para que no exista validaciones de exclusión, y el código sea más legible.
- Se agregó la nueva funcionalidad solicitada, para ítems CONJURED, y se descomentaron los test de esta funcionalidad
- Se sacaron todos los métodos a una clase que Representa todas las categorías de Ítems, y se separó las constantes en una interface
- Se crearon clases para las categorías conocidas, moviendo la lógica a cada una de ellas
- Se agregó una categoría por defecto, se agregó una nueva Interface Qualitable
- Se agregaron los test para cada una de las categorías.
- Se encapsularon las validaciones para no repetir código
- Se encapsularon los métodos algunas partes del código para prevenir código duplicado
- Se invirtieron las condiciones de los ifs para mejor legibilidad
- Se creó una clase ItemCategoryFactory que es la encargada de crear los objetos Categoría de acuerdo al item.getName()
- Se agregó una Clase ItemValidator que contiene todos los métodos para validar un item
- Se agregó la dependencia de lombok en el pom, y se refactorizó la clase Item
~~~

## Detalles de Smells encontrados ##

- Números mágicos
- Métodos Largos
- Clase Larga
- Secuencia de Ifs anidados
- Operaciones aritméticas innecesarias


## Principios SOLID que no se han respetado

- S – Single Responsibility Principle (SRP)
~~~
No se tenía definida una responsalidad unica por clase, ya que había un solo método que se encargaba de todo
~~~

- O – Open/Closed Principle (OCP)
~~~
No existía el concepto de OpenClosed porque para hacer un cambio se tendría que haber refactorizado la clase principal GildedRose.
~~~

- I – Interface Segregation Principle (ISP)
~~~
No se segregaron las Categorías, para definir los comportamientos de cada una
~~~

