package test.game.charactor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import product.game.charactor.CharaFactory;
import product.game.charactor.Charactor;
import product.game.charactor.parameter.Status;
import product.game.charactor.parameter.vo.CharactorParameter;

public class CharactorTest {
	@Test
	public void キャラクターの作成(){
		Charactor c = createCharactor();
		assertNotNull(c);
	}

	private Charactor createCharactor() {
		Charactor c = CharaFactory.createCharactor();
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
