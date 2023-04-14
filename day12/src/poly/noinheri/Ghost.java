package poly.noinheri;

public class Ghost {
	
	private int hp;
	private int atk;
	private int def;
	
	// 체력 5, 공격력 1, 방어 0
	public Ghost() {
		this.hp = 7;
		this.atk = 4;
		this.def = 0;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	public boolean isMonsterActive() {
		return hp > 0 ? true : false;
	}
	
	// 공격받은뒤에 살아있는지 죽었는지 체크
	public boolean isAttackedMonsterActive(int userAtk) {
		return hp - userAtk > 0 ? true : false;
	}
	
	public void setDamagedHp(int userAtk) {
		this.hp = this.hp - (userAtk - this.def);
	}
	

}
