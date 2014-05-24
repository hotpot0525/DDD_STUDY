package product.game.charactor.parameter.vo;

public class Critical implements CharactorParameter{

	private final int critical;
	
	public Critical(int critical) {
		this.critical = critical;
	}
	
	@Override
	public int getValue() {
		return critical;
	}

}
