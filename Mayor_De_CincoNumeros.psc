Algoritmo Mayor_De_CincoNumeros
		Definir num, mayor Como Entero
		mayor <- -999999  
		Para i <- 1 Hasta 5 Con Paso 1 Hacer
			Escribir "Introduce un n�mero: "
			Leer num
			Si num > mayor Entonces
				mayor <- num
			FinSi
		FinPara
		
		Escribir "El n�mero mayor es: ", mayor

FinAlgoritmo
