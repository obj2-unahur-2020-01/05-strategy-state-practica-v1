
## 1 - Maquina de gaseosas

Se solicita modelar con objetos el comportamiento de una máquina expendedora de gaseosas. La máquina solo vende un tipo de gaseosa y de un solo tamaño.
El funcionamiento de la máquina es simple, el cliente ingresa el dinero estipulado y presiona la palanca para obtener la bebida. La máquina sirve la bebida y, si corresponde, retorna el cambio.

En el diseño se debe tener en cuenta lo siguiente:

* Si el cliente presiona la palanca sin haber ingresado el dinero, la máquina no debe servir la bebida sino informale el precio de la misma.
* Si el cliente ingresa dinero pero no es suficiente, la maquina no debe servir la bebida sino informale el valor faltante.

Por otro lado, si la maquina no tiene bebidas disponibles:
* Si el cliente ingresa dinero, la máquina deberia devolver el dinero ingresado e informar que está sin stock al cliente.
* Si el cliente presiona la palanca, la máquina debería informar que está sin stock al cliente.

## 2 - Patos

Para una empresa de software que está desarrollando un software de simulación de Patos, se nos pide modelar en objetos el comportamiento de los distintos tipos de patos.

### Parte 1
Se sabe que los patos pueden  `parpar` (Emitir graznidos), `nadar` y como es un software de simulación se pueden `dibujar` en pantalla. Inicialmente vamos a tener en el simular 3 tipos de patos:

- `Patos Capuchinos`
- `Patos Cabeza negra`
- `Pato de Hule`

Ambos nadan de la misma forma, pero el `Pato de Hule` "parpa" de una forma diferente con respecto a los otros dos tipos de pato.

### Parte 2
Nos llega un requerimiento que no pide que los patos puedan `volar`. Hay que tener en cuenta la particularidad del `Pato de Hule` que no vuela, porque su alas no se mueven.

### Parte 3
Incorporamos al modelo otro tipo de Pato, el `Pato de Madera`. Estos patos no pueden `parpar` ni `volar`.

## 3 - Simulador de Autos

Se solicita modelar los componentes necesarios para desarrollar un software de simulador de autos.
Los autos tiene como atributos cantidad de combustible, kilometraje,  consumo y velocidad máxima y  tipo de conducción.
El tipo de conducción se pueden cambiar de tipo conducción indistintamente todas las veces que se desee.
Los tipos de conducción hacen que varien los atributos de un auto.

Los tipos posibles son:

* Ecológica
En este tipo de conducción el consumo el bajo, 16 km/l y la velocidad máxima es de 120 km/h.

* Deportiva
En este tipo de conducción el consumo el alta, 5 km/l y la velocidad máxima es de 180 km/h.

Los permiten avanzar indicandoles la cantidad de kilometros a recorrer. Al avanzar los autos deben:

- restar al combustible lo consumido para recorrer esos kilometros
- sumar los kilometros recorridos al kilometraje

En el caso de que el combustible no sea el sufuciente para recorrer los kilometros solicitados, el auto avanzare hasta donde le alcance el combustible, actualizara sus atributos según corresponde (combustible y kilometraje) e informara con un error que no pudo completa el recorrido solicitado.



