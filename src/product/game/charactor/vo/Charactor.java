package product.game.charactor.vo;

import java.util.ArrayList;

import product.game.charactor.parameter.Status;
import product.game.charactor.parameter.vo.CharactorParameter;



public class Charactor {
	
	// キャラクターステータス
	private Status status;
	
	public Charactor(Status status){
		this.status = status;
	}
	
	public void getHp(){
		CharactorParameter hp = status.get("HP");
	}
	
	public Status getStatus() {
		return status;
	}


}
