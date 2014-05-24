package product.game.charactor.parameter;

import java.util.ArrayList;
import java.util.HashMap;

import product.game.charactor.parameter.vo.CharactorParameter;

public class Status {
//	HashMap<String, CharactorParameter> charactorParameter;
	ArrayList<CharactorParameter> charactorParameters;
	
	public Status(ArrayList<CharactorParameter> charactorParameter){
		// TODO ディフェンシブにする
		this.charactorParameters = charactorParameter;
	}
	
	/**
	 * キャラクタのパラメータオブジェクトを取得する
	 * @param name 
	 * @return 存在しないnameを指定したらnullを返す
	 */
	public CharactorParameter get(String name){
		for(CharactorParameter cp : charactorParameters){
			if(cp.getClass().equals(name)) return cp;
		}
		// TODO nullを返しちゃうのをなんとかしたい
		return null;
	}
	
	public ArrayList<CharactorParameter> get(){
		return charactorParameters;
	}
	
	
	
//	private Level level;
//	private Exp exp;
//	private Hp hp;
//	private Stamina stamina;
//	private Power power;
//	private Dex dex;
//	private Critical critical;	
//	private Range range;
//	
	
	
	


}
