/*
 * operazioni_file.h
 *
 *  Created on: 07 dic 2016
 *      Author: Matteo
 */

#ifndef OPERAZIONI_FILE_H_
#define OPERAZIONI_FILE_H_


BOOL separatore_f(char carattere);
void lettura_parola();
int stampa(int ); 

typedef struct{
	int valore;
	char lettera;
}codice;
void proceduramirko(codice); //procedura che inizializza la struttura codice con 0 e A

void marco();
void domanda();





#endif /* OPERAZIONI_FILE_H_ */
