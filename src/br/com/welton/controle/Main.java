package br.com.welton.controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

//		List<Integer> lista = new ArrayList<Integer>();
		List<Integer> lista = new LinkedList<Integer>();
		
		lista.add(1);
		lista.add(6);
		lista.add(5);
		lista.add(4);
		lista.add(1);
		lista.add(15);
		lista.add(4);
		lista.add(12);
		
//		for(int i = 0; i < lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}
		
		Collections.sort(lista);
	
		Collections.reverse(lista);
		
		for(int i: lista) {
			System.out.println(i);
		}
		
		
	}
}
