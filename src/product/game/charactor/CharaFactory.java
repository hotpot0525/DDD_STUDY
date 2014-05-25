package product.game.charactor;

import java.util.ArrayList;

import product.game.charactor.cclass.rank.vo.Beginner;
import product.game.charactor.cclass.vo.Warrior;
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
		ArrayList<CharactorParameter> status = baseParam(new ArrayList<CharactorParameter>(), 100);
		return new Charactor(new Status(status), new Warrior(), new Beginner());
	}

	private static ArrayList<CharactorParameter> baseParam(ArrayList<CharactorParameter> status, int totalPoint) {
		int level = 1;
		int exp = 0;
		int hp = (int) (Math.random()*totalPoint+1)+1;totalPoint-=hp;
		int stamina = (int) (Math.random()*totalPoint)+1;totalPoint-=stamina;
		int power = (int) (Math.random()*totalPoint)+1;totalPoint-=power;
		int dex = (int) (Math.random()*totalPoint)+1;totalPoint-=dex;
		int cri = (int) (Math.random()*totalPoint)+1;totalPoint-=cri;
		int range = 1;

		
		status.add(new Level(level));
		status.add(new Exp(exp));		
		status.add(new Hp(hp));
		status.add(new Stamina(stamina));
		status.add(new Power(power));
		status.add(new Dex(dex));
		status.add(new Critical(cri));
		status.add(new Range(range));
		
		return status;
	}
	


}
