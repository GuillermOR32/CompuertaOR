Algoritmo Adivina_Numero
	intentos<-10
	num_secreto<- azar(100)+1
	Escribir "Adivine el número (de 1 a 100):"
	leer num_ingresado
	Mientras num_secreto<>num_ingresado y intentos>1 Hacer
		si num_secreto>num_ingresado Entonces
			Escribir "Muy bajo"
		SiNo
			Escribir "Muy alto"
		FinSi
		intentos<-intentos-1
		Escribir "Le quedan",intentos,"intentos:"
		Leer num_ingresado
	FinMientras
	si num_secreto=num_ingresado Entonces
		Escribir "Exacto! Usted adivino en ",11-intentos,"intentos."
	SiNo
		Escribir "El número era: ",num_secreto
	FinSi
FinAlgoritmo
