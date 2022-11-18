package generation.italy.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Catalogue {

//	Repo
//
//	java-inheritance-shop
//	Package
//
//	generation.italy.shop
//	Todo
//
//	Creare la classe Prodotto che gestisce i prodotti dello shop. Un prodotto è caratterizzato da:
//
//	    codice (numero intero)
//	    nome
//	    marca
//	    prezzo
//	    iva
//
//	Usate opportunamente i livelli di accesso (public, private), i costruttori,
//	i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
//	il codice prodotto sia accessibile solo in lettura
//	gli altri attributi siano accessibili sia in lettura che in scrittura
//	il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva formattato
//
//	Lo shop gestisce diversi tipi di prodotto:
//	Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
	
//	Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
	
//	Cuffie, caratterizzate dal colore e se sono wireless o cablate Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto
//	nella stesura delle classi che gestiscono i vari sotto tipi di prodotto
//
//	BONUS
//	Create una classe Catalogo con metodo main, in cui chiedete all’utente
//	di valorizzare un catalogo di prodotti con dati inseriti tramite scanner.
//	Durante la richiesta di valorizzazione chiedete:
//	se sta inserendo un o Smarphone o un Televisore o Cuffie
//	e in base alla scelta dell’utente utilizzate il costruttore opportuno.
//	Al termine dell’inserimento stampate il catalogo
//	(fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("you are inserting a Smartphone or a Television or Headphones? ");
		String userAnswer = sc.nextLine();
		
		System.out.println(userAnswer);
		
		if (userAnswer.toLowerCase().equals("smartphone")) {
			
			Smartphone[] arraySmartphone = new Smartphone[3];
			
			
			for (int x = 0; x < arraySmartphone.length; x++) {
				
				System.out.println("Insert the name of your smartphone: ");
				String name = sc.nextLine();
				
				System.out.println("Insert the description of your smartphone: ");
				String description = sc.nextLine();			
				
				System.out.println("Insert the price of your smartphone: ");
				int price = sc.nextInt();
				
				System.out.println("Insert the ram of your smartphone: ");
				int ram = sc.nextInt();
				
				Smartphone userPhone = new Smartphone(name, description, price, ram);
				
				System.out.println(userPhone);
			}
		}
		
		if (userAnswer.toLowerCase().equals("television")) {
			System.out.println("hello");
		}
		
		if (userAnswer.toLowerCase().equals("headphones")) {
			System.out.println("hola");
		}
	}
}