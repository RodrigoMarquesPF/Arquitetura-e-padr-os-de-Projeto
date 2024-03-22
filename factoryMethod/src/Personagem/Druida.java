package Personagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Druida implements Personagem {
	private int forca;
	private int agilidade;
	private int inteligencia;
	private List <String> habilidades;
	
	public Druida() {
        classePersonagem();
        escolherHabilidades();
        abilidadePersonagem();
        equipamentoPersonagem();
        
    }
	
	
	@Override
	public void classePersonagem() {
		System.out.println("Druida selecionado");
		gerarStatusRandom();
		System.out.println("Stats do Druida:");
        System.out.println("Forca: " + forca);
        System.out.println("Agilidade: " + agilidade);
        System.out.println("Inteligencia: " + inteligencia);
		
	}

	@Override
	public void abilidadePersonagem() {
		System.out.println("Druida possui essas habilidades: " + habilidades);
		
	}

	@Override
	public void equipamentoPersonagem() {
		System.out.println("Druida equipou Foice");
		
	}
	
	private void gerarStatusRandom() {
		Random  random = new Random();
		
		forca = random.nextInt(41) + 50;
		
		agilidade = random.nextInt(41) + 10;
		
		inteligencia = random.nextInt(41) + 50;
		
	}
	

	
	private void escolherHabilidades() {
		habilidades = new ArrayList<>();
		habilidades.add("Convocar familiar");
		habilidades.add("Forma de homem-urso");
		habilidades.add("Grito de guerra");
		habilidades.add("Redemoinho");
		habilidades.add("Invocar totem de espinho");
		
		Collections.shuffle(habilidades);
		habilidades = habilidades.subList(0, 3);
		
	}

}