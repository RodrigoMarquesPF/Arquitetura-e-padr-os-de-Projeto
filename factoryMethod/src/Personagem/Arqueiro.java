package Personagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Arqueiro implements Personagem {
	private int forca;
	private int agilidade;
	private int inteligencia;
	private List <String> habilidades;
	
	public Arqueiro() {
        classePersonagem();
        escolherHabilidades();
        abilidadePersonagem();
        equipamentoPersonagem();
    }

	@Override
	public void classePersonagem() {
		System.out.println("Arqueiro selecionado");
		gerarStatusRandom();
		System.out.println("Stats do Arqueiro:");
        System.out.println("Forca: " + forca);
        System.out.println("Agilidade: " + agilidade);
        System.out.println("Inteligencia: " + inteligencia);
		
	}

	@Override
	public void abilidadePersonagem() {
		System.out.println("Arqueiro possui essas habilidades: " + habilidades);
		
	}

	@Override
	public void equipamentoPersonagem() {
		System.out.println("Arqueiro equipou arco e aljava");
		
	}
	
	private void gerarStatusRandom() {
		Random  random = new Random();
		
		forca = random.nextInt(41) + 30;
		
		agilidade = random.nextInt(61) + 70;
		
		inteligencia = random.nextInt(31) + 30;
		
	}
	
	private void escolherHabilidades() {
		habilidades = new ArrayList<>();
		habilidades.add("Disparo poderoso");
		habilidades.add("Multidisparo");
		habilidades.add("Chamariz");
		habilidades.add("Chuva de flechas");
		habilidades.add("Bomba de fumaca");
		
		Collections.shuffle(habilidades);
		habilidades = habilidades.subList(0, 3);
		
	}

}
