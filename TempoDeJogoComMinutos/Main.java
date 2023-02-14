package TempoDeJogoComMinutos;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal= sc.nextInt();
		
		
		
		int horas = horaFinal-horaInicial;
		int minutos = minutoFinal-minutoInicial;
		String retorno = "";
		
		if(horas >= 1 && minutos >=0) {
			retorno = "O JOGO DUROU "+horas+" HORA(S) E "+minutos+" MINUTO(S)";
		}else if( horas == 0 & minutos == 0) {
			retorno = "O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)";
		}else if(horas == 0 && minutos > 0) {
			retorno = "O JOGO DUROU 0 HORA(S) E "+minutos+" MINUTO(S)";
		}else if( minutos < 0 && horas == 1) {
			horas = 0;
			minutos = 60-minutoInicial+minutoFinal;
			retorno = "O JOGO DUROU "+horas+ " HORA(S) E "+minutos+" MINUTO(S)";

		}else if(horas < 0 && minutos == 0 ) {
			horas = 24-horaInicial+horaFinal;
			retorno = "O JOGO DUROU "+horas+ " HORA(S) E 0 MINUTO(S)";
		}else if(horas < 0 && minutos > 0 ) {
			horas = 24-horaInicial+horaFinal;
			retorno = "O JOGO DUROU "+horas+ " HORA(S) E "+minutos+" MINUTO(S)";
		}else if(horas < 0 && minutos < 0 ) {
			horas = 24-horaInicial+horaFinal;
			minutos = 60-minutoInicial+minutoFinal;
			
			if(minutoInicial > minutoFinal) {			
				horas -= 1;
			}
			retorno = "O JOGO DUROU "+horas+ " HORA(S) E "+minutos+" MINUTO(S)";
		}else if(horas > 0 && minutos < 0) {
			minutos = 60-minutoInicial+minutoFinal;
			horas -=1;
			
			
			retorno = "O JOGO DUROU "+horas+ " HORA(S) E "+minutos+" MINUTO(S)";
			
		}else if(horas == 0 && minutos < 0) {
			horas = 23;
			minutos = 60-minutoInicial+minutoFinal;
			
			retorno = "O JOGO DUROU "+horas+ " HORA(S) E "+minutos+" MINUTO(S)";
			
		}
		
		
		System.out.println(retorno);
		
		
		sc.close();
		
		
		
	}
}
		
	
	
	
	



