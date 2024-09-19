Algoritmo Suma_Y_Doble
    Definir num, suma, doble Como Entero
    suma <- 0
	
    Escribir "Introduce un número menor que 100: "
    Leer num
	
    Si num >= 100 Entonces
        Escribir "Error: El número debe ser menor que 100."
    SiNo
        
        Para i <- 1 Hasta num Con Paso 1 Hacer
            suma <- suma + i
        FinPara
		
        doble <- 2 * suma
		
        Escribir "El doble de la suma de los números entre 1 y ", num, " es: ", doble
    FinSi
FinAlgoritmo
