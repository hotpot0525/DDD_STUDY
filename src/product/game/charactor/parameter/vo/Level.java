package product.game.charactor.parameter.vo;

public class Level implements CharactorParameter{

	private final int level;
	
	public Level(int level) {
		this.level = level;
	}
	
	@Override
	public int getValue() {
		return level;
	}
	
	@Override
	public String toString() {
		return "レベル:"+level;
	}

}
