#  Notes

[Download Amazon Correto 11](https://aws.amazon.com/es/corretto/)
[Amazon Corretto 11 Installation Instructions for Debian-Based and RPM-Based Linux Distributions](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/generic-linux-install.html)

[Download IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=linux)

Una vez instalado necesitamos asociar Java SDK con Intellij IDEA.

En intellij click on configure - structure for new projects.

Seleccionar Project, si no hay SDK darle en New y asociarlo con la carpeta donde se guardo el programa SDK en tu operation system

Luego ir a configuration -> settings. -> Editor -> General -> Autoimport:

seleccionar:

[X] add ambiguos imports on the fly
[X] Optimize imports on the fly.

Code Folding - Deseleccionar:
[ ] imports;
[ ] One-line-methods;
[ ] "Clousures";
[ ] Generic Constructure.

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