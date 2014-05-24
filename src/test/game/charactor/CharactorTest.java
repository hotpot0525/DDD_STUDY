package test.game.charactor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

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
import product.game.charactor.vo.Charactor;

public class CharactorTest {
	@Test
	public void キャラクターの作成(){
		Charactor c = createCharactor();
		assertNotNull(c);
	}

	private Charactor createCharactor() {
		ArrayList<CharactorParameter> status = new ArrayList<CharactorParameter>();
		status.add(new Hp(100));
		status.add(new Critical(100));
		status.add(new Dex(100));
		status.add(new Exp(100));
		status.add(new Level(100));
		status.add(new Power(100));
		status.add(new Range(100));
		status.add(new Stamina(100));
		Charactor c = new Charactor(new Status(status));
		return c;
	}
	
	@Test
	public void 必須ステータスの保持(){
		Charactor c = createCharactor();
		Status paramList = c.getStatus();
		assertEquals("８項目", 8, paramList.get().size());
		for(CharactorParameter param : paramList.get()){
			checkNotNull(param);
		}

	}
	
	
	private void checkNotNull(Object object){
		assertNotNull(object);
	}

	

}
