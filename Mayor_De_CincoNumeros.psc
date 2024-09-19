Algoritmo Mayor_De_CincoNumeros
		Definir num, mayor Como Entero
		mayor <- -999999  
		Para i <- 1 Hasta 5 Con Paso 1 Hacer
			Escribir "Introduce un número: "
			Leer num
			Si num > mayor Entonces
				mayor <- num
			FinSi
		FinPara
		
		Escribir "El número mayor es: ", mayor

FinAlgoritmo
