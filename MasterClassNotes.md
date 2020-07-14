#  Notes

[Download Amazon Correto 11](https://aws.amazon.com/es/corretto/)
[Amazon Corretto 11 Installation Instructions for Debian-Based and RPM-Based Linux Distributions](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/generic-linux-install.html)

[Download IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=linux)

Una vez instalado necesitamos asociar Java SDK con Intellij IDEA.

En intellij click on configure - structure for new projects.

Seleccionar Project, si no hay SDK darle en New y asociarlo con la carpeta donde se guardo el programa SDK en tu operation system

Luego en pantalla de inicio dar click en configuración -> Structure for new projects (Click in project) -> Cambiar no SDK por la versión de Java que amos a usar, si no aparece -> (click on new) -> buscar el folder de instalación. -> (Click on SDK) -> cambiar el name

Luego ir nuevamente en la pantalla de inicio a configuration -> settings (preference on MAC) -> Editor -> General -> Autoimport y seleccionar (check on):

[X] add ambiguos imports on the fly
[X] Optimize imports on the fly.

En la misma pestaña general ( click on ) Code Folding y Deseleccionar:
[ ] imports;
[ ] One-line-methods;
[ ] "Clousures";
[ ] Generic Constructure.

Fin de configuración.
---------------------
### Introducción Hello World.



En la estructura básica al crear un programa de java se usan las siguientes keywords.

**Access Modifier**: Define el scope del código. cómo por ejemplo *public*.

**Class**: se usa para definir una clase. 

**Hello**: Nombre de la clase.

**{}**: aquí va el cuerpo de la clase.

```java
public class  Hello {
}
```

**Main method**: Es el punto de entrada de todo programa de java. java busca ese método para correr el programa.

**{}**: En los metodos se conoce como Code block y define el bloque del metodo.

**Statement**: Comando completo para ser ejecutado construido con uno o varias expresiones. 

### Data Types.

Data types are Keywords in Java.

To define variable Define Data type + name + Asign(=) + value;

### Declaration Statement.

Used to define a ariable by indicting the data type, and the name, and optionally to set the variable to certain value.

### Expresion.

This is a construct that evaluates to a single value;

#### TIP:
SOUT in intellij is a short cut to System.out....

### Operators.

Perform Operations: `+ - / *`

### Primitive Types.

eight primitive data types:
`boolean, byte, chart, short, int, long, float, double`

#### INT

The max value of integer is 2147483647
The minimum value of integer is -2147483648
If you try to assign a superior value than the maximum or minimum of an integer it will cause an error;

When you try to add or subtract the number one, the hole number pass to be the oposite sign doubt the overflow or Underflow.

We can use underscore in numbers to do it more readable 2_147_483_647 (Apply in java versions over 6);

#### Byte and Short

Byte has a range of - 128 to 127. It was for optimization reasons but in this days the computers can manage complex memory sizes.

Byte in memory occupies 8 bits.
Short occupies 16 bits.
Integer occupies 32 bits.
Long occupies 64 bits!

Different data types using different size of memory.

### Casting in Java

Cast means to treat or convert a number from one type to another. We put the type we want the number to be in parenthesis like this:

```java 
(byte)(myMinByteValue / 2);
```

### Float and Double.

Float is a number with decimal point -> 3.14159
32 bits _ Single precision _ Range: 1.aE-45 to 3.4028234E+38
64 bits _ Double precision _ Range: 4.9E-324 to 1.7976931348623157E+308 (Much precise)

```java
 float myFloatValue = 5f; // you can put the f  or
 float myFloatValue = (float) 5; // write the casting word
```
The "f" word tells to java that it's a float number no matter the value in it.
```java
Double myDoubleValue = 6.765; // By default the decimal numbers are doubles
 ```

### Char

Only store one character more info in [🌎 unicode](https://unicode-table.com/) "U+0032"

Based in unicode, and take only two bytes. .😀.

### Boolean

Is a yes or no, 1 or 0, show or hide. ● ⦿

Only can store two values.

### Strings

Is not a primitive type, is a DATATYPE, it's actually a Class with a bit of favoritism.

Contains a sequence of characters.

Strings in Java are immutable. You can't change a String after it's created, instead, what happens is a new String is created.

### Operators and operand

Operator: Special Symbols.

Operand: any object that is maipulated by the operator.

Expression: formed by combining variables, literals, returns and operators.

int myValue = **[ 15 + 12 ]** _expression_

### If Statement

Basic structure
```if(boolean validation){ // code to execute }```

&& => And operator
|| => Or Operator

### Ternary operator

boolean color =  isRed ? true : false;

### Operator precedence and Operator Challenge

[Summary of Operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html)
[Java Operator Precedence Table](http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html)


 