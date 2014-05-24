package product.game.charactor.parameter.vo;

public class Stamina implements CharactorParameter{
	
	private final int stamina;
	
	public Stamina(int stamina) {
		this.stamina = stamina;
	}

	@Override
	public int getValue() {
		return stamina;
	}
	

}
