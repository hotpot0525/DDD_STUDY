package product.game.charactor.parameter.vo;

public class Range implements CharactorParameter{

	private final int range;
	
	public Range(int range) {
		this.range = range;
	}
	
	@Override
	public int getValue() {
		return range;
	}

}
