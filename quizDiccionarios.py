rios={'Amazonas':'Colombia','Nilo':'Egipto','Bravo':'Mexico','Missipi':'E.E.U.U.','Orinoco':'Venezuela'}
for i in rios:
    print ('El',i,'pasa por:',rios[i])
print()
print ('====================================')
for key in rios:
    print (key)
print ('====================================')
for i in rios:
    print (rios[i])
print()
print ('___________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________')
print ('Glosario')
palabras={'Sintaxis':'La sintaxis de un lenguaje de programación se define como el conjunto de reglas que deben seguirse al escribir el código fuente de los programas para considerarse como correctos para ese lenguaje de programación. Los elementos básicos constructivos de un programa son: Palabras reservadas (propias de cada lenguaje).'
                     ,'Compilador':'Un compilador es un programa informático que traduce todo el código fuente de un proyecto de software a código máquina antes de ejecutarlo. Solo entonces el procesador ejecuta el software, obteniendo todas las instrucciones en código máquina antes de comenzar',
          'IDE':'Un IDE (Entorno de Desarrollo Integrado) es una herramienta de software que proporciona un entorno de programación completo para los desarrolladores de software. Este conjunto de herramientas es utilizado para ayudar al desarrollo de software desde un mismo techo.',
          'Palabras Reservadas':'En los lenguajes informáticos, una palabra reservada es una palabra que tiene un significado gramatical especial para ese lenguaje y no puede ser utilizada como un identificador de objetos en códigos del mismo, como pueden ser las variables.',
          'Lenguaje de programacion':'Un lenguaje de programación es un lenguaje de computadora que los programadores utilizan para comunicarse y para desarrollar programas de software, aplicaciones, páginas webs, scripts u otros conjuntos de instrucciones para que sean ejecutadas por los ordenadores.'}
for i in palabras:
    print ('El significado de',i,'es:',palabras[i])
print()
