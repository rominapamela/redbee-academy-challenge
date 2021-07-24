package com.redbee.academy.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ChallengeApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(ChallengeApplication.class, args);
		System.out.println();

		int nr1=2;
		int nr2=5;
		SumTwoNumbers suma = new SumTwoNumbers();
		System.out.println("La suma es: "+ suma.sum(nr1,nr2));

		List<Integer> numeros=new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(5);
		numeros.add(9);
		SumArrayNumbers sumaarray = new SumArrayNumbers();
		System.out.println("La suma de los elementos del vector es: "+ sumaarray.sum(numeros));

		Integer a=5;
		Integer b=3;
		Integer c=5;
		CompareNumbers compara = new CompareNumbers();
		System.out.println("El mayor entre " + a + ", "+ b + " y "+ c + " es: "+ compara.max(a,b,c));
		System.out.println();

		List<Integer> lista1=new ArrayList<Integer>();
		lista1.add(8);
		lista1.add(5);
		lista1.add(2);
		List<Integer> lista2=new ArrayList<Integer>();
		lista2.add(9);
		lista2.add(11);
		lista2.add(1);
		System.out.println("La lista 1 es: " + lista1);
		System.out.println("La lista 2 es: " + lista2);
		CompareArrayNumbers compararArrays = new CompareArrayNumbers();
		System.out.println("La lista con el maximo de ambas indices es: " + compararArrays.max(lista1,lista2));

	}

}
