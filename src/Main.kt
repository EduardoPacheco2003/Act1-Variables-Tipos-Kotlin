
//Pacheco Cruz Eduardo 6NM61

fun main() {
    //1. Para un número decimal, qué tipo de dato se asigna por defecto? Imprimirlo.
    val decimal = 3.1415;
    println("El tipo de dato por defecto para un decimal es ${decimal::class.simpleName}");
    //2. Volver flotante a la variable decimal.
    var myFloat = decimal.toFloat();
    // O declaramos myFloat con 'f' al final para que sea flotante
    myFloat = 2.71f;

    println("El tipo de dato de myFloat ahora es un decimal es ${myFloat::class.simpleName}");
    //3. Declarar una variable const val con el valor de PI y
    // multiplicarla por 2 veces nuestra variable decimal para sacar el perímetro de un círculo
    val pi = 3.1415f;
    val perimetro = pi * 2 * myFloat;

    // 4. Para el ejemplo anterior, utilizar un String Template para imprimir el texto
    // El perímetro del círculo es: [resultado] siendo resultado nuestra variable perímetro.
    println("El perímetro del círculo es: $perimetro");
    /*
    * La ecuación de la pendiente se obtiene por la siguiente expresión:
    m = y2-y1/x2-x1
    5. Expresarla ahora con operadores.
    *6. Resolver el valor de la pendiente, tomando en cuenta que P1(4,3), P2(-3,-2)
    * */
    val x1 = 4;
    val y1 = 3;
    val x2 = -3;
    val y2 = -2;
    val m = (y2 - y1) / (x2 - x1);
    println("La pendiente es: $m");
    //7. Del ejercicio anterior, responder: ¿Por qué el resultado obtenido difiere del resultado esperado?
    // El resultado difiere del esperado porque la división de dos enteros siempre será un entero, por lo que el resultado
    // será truncado. Para obtener el resultado esperado, se debe convertir al menos uno de los valores a flotante.

    //8. Encontrar una solución para que se refleje el resultado.
    val m2 = (y2 - y1).toFloat() / (x2 - x1);
    println("La pendiente es: $m2 y es de tipo ${m2::class.simpleName}");
}