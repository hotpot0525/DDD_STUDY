package product.game.charactor.parameter.vo;

public class Hp implements CharactorParameter{

	private final int hp;
	
	public Hp(int hp) {
		this.hp = hp;
	}
	
	@Override
	public int getValue() {
		return hp;
	}

}
