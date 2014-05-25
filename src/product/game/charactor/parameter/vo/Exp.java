package product.game.charactor.parameter.vo;

public class Exp implements CharactorParameter{

	private final int exp;
	public Exp(int exp) {
		this.exp = exp;
	}
	@Override
	public int getValue() {
		return exp;
	}
	
	@Override
	public String toString() {
		return "経験値:"+exp;
	}

}
