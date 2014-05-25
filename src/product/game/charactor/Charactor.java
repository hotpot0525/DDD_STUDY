package product.game.charactor;

import product.game.charactor.cclass.rank.vo.Rank;
import product.game.charactor.cclass.vo.Career;
import product.game.charactor.parameter.Status;
import product.game.charactor.parameter.vo.CharactorParameter;



public class Charactor {
	
	// キャラクターステータス
	private Status status;
	// 職業
	private Career career;
	private Rank rank;
	
	Charactor(Status status, Career career, Rank rank){
		this.status = status;
		this.rank = rank;
		this.career = career;
	}
	
	public void getHp(){
		CharactorParameter hp = status.get("HP");
	}
	
	public Status getStatus() {
		return status;
	}
	


}
