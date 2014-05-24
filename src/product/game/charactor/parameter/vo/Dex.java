package product.game.charactor.parameter.vo;

public class Dex implements CharactorParameter{

	private final int dex;
	
	public Dex(int dex) {
		this.dex = dex;
	}
	
	@Override
	public int getValue() {

		return dex;
	}

}
