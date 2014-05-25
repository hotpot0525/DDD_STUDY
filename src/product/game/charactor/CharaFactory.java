package product.game.charactor;

import java.util.ArrayList;

import product.game.charactor.parameter.Status;
import product.game.charactor.parameter.vo.CharactorParameter;
import product.game.charactor.parameter.vo.Critical;
import product.game.charactor.parameter.vo.Dex;
import product.game.charactor.parameter.vo.Exp;
import product.game.charactor.parameter.vo.Hp;
import product.game.charactor.parameter.vo.Level;
import product.game.charactor.parameter.vo.Power;
import product.game.charactor.parameter.vo.Range;
import product.game.charactor.parameter.vo.Stamina;

public class CharaFactory {

	public static Charactor createCharactor() {
		ArrayList<CharactorParameter> status = new ArrayList<CharactorParameter>();
		status.add(new Hp(100));
		status.add(new Critical(100));
		status.add(new Dex(100));
		status.add(new Exp(100));
		status.add(new Level(100));
		status.add(new Power(100));
		status.add(new Range(100));
		status.add(new Stamina(100));
		return new Charactor(new Status(status));
	}

}
