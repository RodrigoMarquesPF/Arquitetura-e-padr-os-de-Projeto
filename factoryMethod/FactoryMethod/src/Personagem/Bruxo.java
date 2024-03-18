package Personagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Bruxo implements Personagem {
	private int forca;
	private int agilidade;
	private int inteligencia;
	private List <String> habilidades;
	
	public Bruxo() {
        classePersonagem();
        escolherHabilidades();
        abilidadePersonagem();
        equipamentoPersonagem();
        
    }
	
	
	@Override
	public void classePersonagem() {
		System.out.println("Bruxo selecionado");
		gerarStatusRandom();
		System.out.println("Stats do Guerreiro:");
        System.out.println("Forca: " + forca);
        System.out.println("Agilidade: " + agilidade);
        System.out.println("Inteligencia: " + inteligencia);
		
	}

	@Override
	public void abilidadePersonagem() {
		System.out.println("Bruxo possui essas habilidades: " + habilidades);
		
	}

	@Override
	public void equipamentoPersonagem() {
		System.out.println("Bruxo equipou cetro");
		
	}
	
	private void gerarStatusRandom() {
		Random  random = new Random();
		
		forca = random.nextInt(51) + 30;
		
		agilidade = random.nextInt(41) + 20;
		
		inteligencia = random.nextInt(31) + 80;
		
	}
	

	
	private void escolherHabilidades() {
		habilidades = new ArrayList<>();
		habilidades.add("Chama fantasma");
		habilidades.add("Convocar esqueletos");
		habilidades.add("Selo da morte");
		habilidades.add("Aura de decadencia");
		habilidades.add("Fissura Ctonica");
		
		Collections.shuffle(habilidades);
		habilidades = habilidades.subList(0, 3);
		
	}

}
