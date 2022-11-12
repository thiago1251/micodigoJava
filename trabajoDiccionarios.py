estudiante = {}
estudianteAgregar={}
notas = []

print("---------------------------------------------------------------")
while True:
 print ("Selecciona una opción...")
 print ("\t1 - Añadir estudiantes")
 print ("\t2 - Agregar")
 print ("\t3 - Eliminar")
 print ("\t4 - Modificar")
 print ("\t5 - Ver Estudiante")
 print ("\t6 - Ver mejor estudiante")
 print ("\t7 - Ver peor estudiante")
 print ("\t8 - Promedios listado")

 try:
  option = int(input("Ingrese el número de la opción escogida: "))
 except:
  option=-1
 if option == 1:
  contador = int(input('CUANTOS ESTUDIANTES DESEA INGRESAR'))
  for num in range(contador):
   name = input('INGRESE EL NOMBRE(S) DEL ESTUDIANTES')
   apellido = input('INGRESE LOS APELLIDO(S) DEL ESTUDIANTES')
   codigo = input('INGRESE EL CODIGO DEL ESTUDIANTES')

   nota1=int(input("Ingrese calificacion 1:"))
   nota2=int(input("Ingrese calificacion 2:"))
   nota3=int(input("Ingrese calificacio  3:"))

   estudiante[codigo] = {name,apellido,nota1,nota2,nota3}
   notas.append(nota1)
   notas.append(nota2)
   notas.append(nota3)
  print(estudiante)
  print(notas)
 if option == 2:
  name1 = input('INGRESE EL NOMBRE(S) DEL ESTUDIANTES')
  apellido1 = input('INGRESE LOS APELLIDO(S) DEL ESTUDIANTES')
  codigo1 = input('INGRESE EL CODIGO DEL ESTUDIANTES')
  notas1=float(input("Ingrese calificacion 1:"))
  notas2=float(input("Ingrese calificacion 2:"))
  notas3=float(input("Ingrese calificacio: 3:"))
  notas.append(nota1)
  notas.append(nota2)
  notas.append(nota3)
  estudianteAgregar[codigo1] = {name1,apellido1,notas1,notas2,notas3}
  estudiante.update(estudianteAgregar)
  for clave,estudiantes in estudiante.items():
    print (clave,':',estudiantes)


 if option == 3:
  print(estudiante)
  eliminar = input('INGRESE EL CODIGO DEL ESTUDIANTE QUE DESEA ELIMINAR')
  del estudiante[eliminar]
  print(estudiante)
 if option == 4:
  print(estudiante)
  modificar = input('INGRESE EL CODIGO DEL ESTUDIANTE QUE DESEA MODIFICAR')
  name3 = input('INGRESE EL NOMBRE(S) DEL ESTUDIANTES')
  apellido3 = input('INGRESE LOS APELLIDO(S) DEL ESTUDIANTES')
  codigo3 = input('INGRESE EL CODIGO DEL ESTUDIANTES')
  notas13=float(input("Ingrese calificacion 1:"))
  notas23=float(input("Ingrese calificacion 2:"))
  notas33=float(input("Ingrese calificacio: 3"))

  estudiante[modificar] = {name3,apellido3,notas13,notas23,notas33}
  print(estudiante)

 if option == 5:
  ver = input('INGRESE EL CODIGO DEL ESTUDIANTE QUE DESEA VER')
  print(estudiante[ver])
 if option == 6:
  n=3
  output=[notas[i:i + n]
  for i in range(0, len(notas), n)]
  print(output)
