package product.game.charactor.parameter.vo;

public class Power implements CharactorParameter{

	private final int power;
	public Power(int power) {
		this.power = power;
	}
	@Override
	public int getValue() {
		return power;
	}

}
