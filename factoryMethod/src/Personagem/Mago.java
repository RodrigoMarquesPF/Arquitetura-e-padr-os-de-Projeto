package Personagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Mago implements Personagem {
	private int forca;
	private int agilidade;
	private int inteligencia;
	private List <String> habilidades;
	
	public Mago() {
        classePersonagem();
        escolherHabilidades();
        abilidadePersonagem();
        equipamentoPersonagem();
    }
	
	
	@Override
	public void classePersonagem() {
		System.out.println("Mago selecionado");
		gerarStatusRandom();
		System.out.println("Stats do Mago:");
        System.out.println("Forca: " + forca);
        System.out.println("Agilidade: " + agilidade);
        System.out.println("Inteligencia: " + inteligencia);
		
	}

	@Override
	public void abilidadePersonagem() {
		System.out.println("Mago possui essas habilidades: " + habilidades);
		
	}

	@Override
	public void equipamentoPersonagem() {
		System.out.println("Mago equipou cajado");
		
	}
	
	private void gerarStatusRandom() {
		Random  random = new Random();
		
		forca = random.nextInt(41) + 10;
		
		agilidade = random.nextInt(21) + 20;
		
		inteligencia = random.nextInt(51) + 80;
		
	}
	
	private void escolherHabilidades() {
		habilidades = new ArrayList<>();
		habilidades.add("Bola de Fogo");
		habilidades.add("Proteção das chamas");
		habilidades.add("Orbe vulcanico");
		habilidades.add("Meteoro");
		habilidades.add("Desintegrar");
		
		Collections.shuffle(habilidades);
		habilidades = habilidades.subList(0, 3);
		
	}
	

}