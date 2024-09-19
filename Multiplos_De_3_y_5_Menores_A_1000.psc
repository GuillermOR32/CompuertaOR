Algoritmo Multiplos_De_3_y_5_Menores_A_1000
    Definir contador Como Entero
    contador <- 0
	
    Para i <- 1 Hasta 999 Con Paso 1 Hacer
        Si (i % 3 = 0) Y (i % 5 = 0) Entonces
            contador <- contador + 1
        FinSi
    FinPara
	
    Escribir "La cantidad de múltiplos de 3 y 5 menores a 1000 es: ", contador
FinAlgoritmo
