🔥 Desafío Salarial: El Controlador de Nómina
Contexto:

Eres parte del escuadrón de élite que mantiene en orden los datos de una empresa donde algunos empleados parecen creer que los sueldos negativos son una realidad alterna válida. Tu misión (sí, aceptada) es desarrollar un sistema robusto que no se deje engañar por errores humanos ni por cifras ilógicas.

🎯 Tu objetivo:
Crear un programa en Java que ayude a controlar la nómina de 10 empleados, validando cada paso como un auténtico vigilante de la lógica.


🧠 Requisitos de la misión:
🗣️ Pide amablemente (o no tan amablemente) el sueldo de cada empleado.

💡 Spoiler: Si el sueldo es negativo o cero... no lo aceptes. Devuélvelo al inframundo y vuelve a preguntar.

🧮 Si el sueldo está en el rango entre $100 y $300, cuenta ese sueldo como un guerrero del equilibrio.

💥 Sí, incluye el $100 y el $300. Los extremos también tienen derechos.

🚀 Si el sueldo es mayor a $300, márcalo como un sueldo VIP.

💰 Suma todos los sueldos ingresados en una variable double.

🎨 Pero al final, imprímelo bonito usando float... así la gerencia no se asusta con demasiados decimales.

🧾 Al final de la jornada, reporta:

Cuántos sueldos entraron en el rango de la justicia ($100 - $300).

Cuántos sueldos VIP superaron los $300.

El total acumulado, convertido a float como quien pone perfume antes de entregar el informe.
ESta es la optimización del codigo remal.
primero:
 cambie variables, despues revise donde estaban lo errores de esas variables y con System.out.println para arreglar y mejor los codigos para que el cerrar el Scanner cerramos el input, cambie los datos de tt, s1, ss que estaba en int para Double. Nuevos cambios de variable para que este más entendible el codigo.

Segundo:
Utilice scanner para que pueda ingresar el sueldo de los empleados y iniciale en cero para que se vaya incrementando en el for, el system.out.Prinlt para escribir lo que piden, utilice condicionales para las cosas que píden