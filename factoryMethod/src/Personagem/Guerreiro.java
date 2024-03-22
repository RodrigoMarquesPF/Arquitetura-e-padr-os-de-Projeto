package Personagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Guerreiro implements Personagem {
	private int forca;
	private int agilidade;
	private int inteligencia;
	private List <String> habilidades;
	
	public Guerreiro() {
        classePersonagem();
        escolherHabilidades();
        abilidadePersonagem();
        equipamentoPersonagem();
        
    }
	
	
	@Override
	public void classePersonagem() {
		System.out.println("Guerreiro selecionado");
		gerarStatusRandom();
		System.out.println("Stats do Guerreiro:");
        System.out.println("Forca: " + forca);
        System.out.println("Agilidade: " + agilidade);
        System.out.println("Inteligencia: " + inteligencia);
		
	}

	@Override
	public void abilidadePersonagem() {
		System.out.println("Guerreiro possui essas habilidades: " + habilidades);
		
	}

	@Override
	public void equipamentoPersonagem() {
		System.out.println("Guerreiro equipou espada de uma mao e escudo");
		
	}
	
	private void gerarStatusRandom() {
		Random  random = new Random();
		
		forca = random.nextInt(61) + 70;
		
		agilidade = random.nextInt(41) + 30;
		
		inteligencia = random.nextInt(21) + 10;
		
	}
	

	
	private void escolherHabilidades() {
		habilidades = new ArrayList<>();
		habilidades.add("Golpe de Escudo");
		habilidades.add("Estocada");
		habilidades.add("Ira");
		habilidades.add("Clivagem");
		habilidades.add("Julgamento");
		
		Collections.shuffle(habilidades);
		habilidades = habilidades.subList(0, 3);
		
	}

}
