huespedes={101:'Juan Valdes', 105:'Paquita la del Barrio', 202: 'Mariana Pajon'}
#Se declaran los valores en el diccinario, sus claves y atributos


print (huespedes) #Imprime los valores del diccionario
print (huespedes.items()) #Imprime los valores separados con la persona (atributo) y su habitación(clave)

print (huespedes.keys()) #Imprime las claves
for key in huespedes:
    print (key) #Imprime las claves saltando una linea

print (huespedes.values()) #Imprime los atributos
for key in huespedes:
    print (huespedes[key]) #Imprime cada atributo en lineas diferentes
print()

for habitacion in huespedes:
    print (habitacion,':',huespedes[habitacion]) #Imprime clave : atributo en lineas separadas
print()
for habitacion,huesped in huespedes.items():
    print (habitacion,':',huespedes[key]) #Imprime las clave y el último atributo en lineas diferentes 
for indice, key in enumerate(huespedes):
    print (indice+1,key,huespedes[key]) #Imprime las claves ennumeradas y el atributo
print()

print (huespedes[105]) #Imprime el atributto pertenciente a la clve especificada
print (huespedes.get(105)) #imprime el valos de la clave

print ('====================================')

huespedes[102]='Fanny Lu'
huespedes[107]='Don Omar'
print(huespedes.setdefault('109','Luis Miguel'))
print(huespedes)
 #añade  un nuevo elemnto en el diccionario


for huesped in huespedes.items():
    print (habitacion,':',huesped) #Imprime las nuevas claves y atributos
print()

registroshoy={201:'Vicente Fernandez',301:'Pepe Guardiola'}
huespedes.update(registroshoy) #Incluye los nuevos elementos en el diccionario
for habitacion, huesped in huespedes.items():
    print (habitacion,':',huesped) #Imprime la lista de claves y atributos entera
print()

print ('====================================')

huespedes[107]='Ricky Martin'
print (huespedes) #Imprime las claves y atributos

print ('====================================')


del huespedes[102] #elimina el atributo de la clave 102
huespedes.pop(202) #Elimina del diccionario el atributo de la clave 202
print(huespedes) #Imprime la lista actualizada

print ('====================================')

copia1=huespedes.copy()
print ('copia1: ',copia1) #Copia los valores del diccionario
copia2={}
copia2.update(huespedes) #Inserta los valores del diccionario en el String
print ("copia2: ",copia2)

print ('====================================')

lista=[2,5,7,1]
diccio=dict.fromkeys(lista,"xxx") #Agrega "xxx" a cada uno de los elementos
print(diccio)

print ('====================================')
inventario={"plata": (500,2500), 'cartera' : ["Cedula","Moneda","Boletas"],'mecato':'Detodito','dias':1}
print (inventario) #Se crea un diccionario y se imprime
inventario["cartera"].sort()
print(inventario) #Mueve el valor "cartera" a el primer lugar
inventario["cartera"].remove("Moneda")
print(inventario) #Del diccionario "cartera" se remueve el valor "Moneda"
print(inventario.get("plata")[0]) #Se imprime el primer valor del diccionario "plata"
