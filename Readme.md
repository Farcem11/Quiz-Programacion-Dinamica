##Instituto Tecnológico de Costa Rica
##(TEC)

##Escuela de computación

##Curso: Análisis de algoritmos

##Quiz programacion dinamica

##Profesor: Mauricio Rojas

##Estudiante: Fabian Arce Molina

##2013012811

##23/Octubre/2014
___
	1) Se escojieron los algoritmos de la mochila y el de cambio de monedas.
___
##Problema de la mochila:
___

> Consiste en que se tiene una mochila con una capacidad maxima para poder meter objetos, estos tienen un peso y un valor, la capacidad de la mochila se limita solo por el peso de los objetos.
___
> Se busca tomar la mayor cantidad de objetos y meterlos en la mochila de forma que se obtenga la mayor ganacia posible.
___
> El caso base o trivial seria si solo hay un objeto y este cabe en la mochila, es decir solo se toma y asi se llega a la solucion optima.
___
###Compilar:
        //Se crea una mochila, recibe de parametro la capacidad maxima de la mochila (la cantidad de peso que puede soportar).
        Mochila mochila = new Mochila(4);
        //Se crean los objetos, recibe de parametros el valor y el peso respectivamente.
        Objeto Jugo = new Objeto(8,1);
        Objeto Mapa = new Objeto(7,2);
        Objeto Botella = new Objeto(11,3);
        //Se crea una lista de objetos y se insertan los objetos creados
        ArrayList<Objeto> ListaDeObjetos = new ArrayList();
        ListaDeObjetos.add(Jugo);
        ListaDeObjetos.add(Mapa);
        ListaDeObjetos.add(Botella);
        //Se llama al algoritmo de programacion dinamica, recibe de parametros la mochila y la lista de objetos
        Algoritmo(mochila, ListaDeObjetos);
        //Retorna una matriz con las soluciones suboptimas y la optima en la posicion Matriz[Cantidad dde objetos][Capacidad de la mochila]
___
##Problema de la moneda:
___

> Consiste en que se tiene un conjunto de monedas y un cambio, hay que tomar la del comjunto de monedas un grupo de monedas donde su suma sea igual al cambio solicitado.
___
> El caso base seria cuando haya una moneda, en el cojunto de monedas, que tenga el mismo valor que el cambio, entonces solo bastaria en tomar esa moneda y el problema ya estaria resuelto.
___

> Se busca saber cuantas posibilidades hay que puedan resolver ese problema, por ejemplo: 
___
> Para un cambio de 4 y un conjunto de monedas = {1,2,3} se tienen 4 soluciones: {1,1,1,1},{1,1,2},{2,2},{1,3}, por lo tanto retorna un 4.
___
>Para un camio de 10 y un conjunto de monedas = {2, 3, 5, 6}, se tienen 5 soluciones: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5}, {5,5}, por lo tanto retorna un 5.
___
###Compilar:
        //Se crea el conjunto de monedas
        Moneda moneda1 = new Moneda(2);
        Moneda moneda2 = new Moneda(3);
        Moneda moneda3 = new Moneda(5);
        Moneda moneda4 = new Moneda(6);
        //Se meten en una lista
        ArrayList<Moneda> ListaDeMonedas = new ArrayList<>();
        ListaDeMonedas.add(moneda1);
        ListaDeMonedas.add(moneda2);
        ListaDeMonedas.add(moneda3);
        ListaDeMonedas.add(moneda4);
        //Se procede a llamar al algoritmo de programacion dinamica, recibe de parametros el conjunto de monedas y el cambio. 
        Algoritmo(ListaDeMonedas, 10));
        //Retorma el numero de soluciones posibles que se pueden crear en donde tomando grupos del conjunto de monedas su suma sea igual a el cambio.
___

