public class Cliente {

	public static void main(String[] args) {
		Milkshake m1 = new BaseMilkshakeMorango();
		Biscoito bis1 =  new Biscoito(m1);
		Chocolate cho1 = new Chocolate(bis1);
		Frutas fru1 = new Frutas(cho1);
		CaldaDeChocolate cal1 = new CaldaDeChocolate(fru1);
		cal1.montar();
		System.out.println("Total do milkshake mais os adicionais: R$ " + cal1.preco() );
		System.out.println("");
		
		Milkshake m2 = new BaseMilkshakeChocolate();
		Biscoito bis2 =  new Biscoito(m2);
		CaldaDeChocolate cal2 = new CaldaDeChocolate(bis2);
		cal2.montar();
		System.out.println("Total do milkshake mais os adicionais: R$ " + cal2.preco());
		System.out.println("");
		
		Milkshake m3 = new BaseMilkshakeMorango();
		CaldaDeChocolate cal3 = new CaldaDeChocolate(m3);
		cal3.montar();
		System.out.println("Total do milkshake mais os adicionais: R$ " + cal3.preco());
		System.out.println("");
		
		Milkshake m4 = new BaseMilkshakeChocolate();
		m4.montar();
		System.out.println("Total do milkshake mais os adicionais: R$ " + m4.preco());
		

	}

}
