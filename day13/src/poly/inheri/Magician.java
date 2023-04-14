package poly.inheri;

public class Magician {
	
		private String id;
		private int hp;
		private int atk;
		private int def;
		private int exp;
		
		// 생성자를 만들어주세요. id만 입력받고
		// 나머지는 체력은 20, 공격력 3, 방어력 1로 고정됩니다.
		
		

		public Magician(String id) {
			this.id = id;
			this.hp = 20;
			this.atk = 2;
			this.def = 0;
			this.exp = 0;
		}
		
		public void showStatus() {
			System.out.println("아이디 :" + this.id);
			System.out.println("체력 :" + this.hp);
			System.out.println("공격력 :" + this.atk);
			System.out.println("방어력 :" + this.def);
			System.out.println("획득경험치 :" + this.exp);
			System.out.println("---------------------");
			
		}
		
		public void hunt(Monster monster) {
			// 죽은 몬스터는 교전 불가 및 종료
			
			// 죽은 몬스터가 다음공격에 죽으면 플레이어에게 경험치 부여
			
			// 몬스터가 다음 공격에 죽지는 않으면 반격해 플레이어 체력 차감
			if(monster.isMonsterInactive()) {
				showMonsterAlreadyDeadMessage(monster.getName());;
				return;
			}
			if(monster.isInactiveAfterNextAttack(atk)) {
				monster.setDamagedHp(atk);
				showMonsterNowDeadMessage(monster.getName());
				gainMonsterExp(monster.getExp());
			}else {
				monster.setDamagedHp(atk);
				setHpAfterMonsterAttack(monster.getAtk());
				showMonsterCounterAttackMessage(monster.getName());
			}
}
		public void castFirebll(Monster monster) {
			
			if(monster.isMonsterInactive()) {
				showMonsterAlreadyDeadMessage(monster.getName());;
				return;
			}
			if(monster.isInactiveAfterNextAttack(atk)) {
				monster.setFirballDmgHp(atk);
				showMonsterNowDeadMessage(monster.getName());
				gainMonsterExp(monster.getExp());
			}else {
				monster.setFirballDmgHp(atk);
				setHpAfterMonsterAttack(monster.getAtk());
				showMonsterCounterAttackMessage(monster.getName());	
		}
		}
		
		
		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
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


		public int getExp() {
			return exp;
		}


		public void setExp(int exp) {
			this.exp = exp;
		}
		public void gainMonsterExp(int monsterExp) {
			this.exp += monsterExp;
		}
			
		// 상단 Warrior 체력을 차감하는 로직을 메서드로 분리 및 재정의
		public void setHpAfterMonsterAttack(int monsterAtk) {
			int realdamage = (monsterAtk - this.def);
			if (realdamage < 0) {
				realdamage = 1;
			}
			this.hp -= realdamage;
			
		}
		
		public void showMonsterAlreadyDeadMessage(String monsterName) {
			System.out.println(monsterName + "(이)가 이미 죽었습니다.");
		}
		
		public void showMonsterNowDeadMessage(String monsterName) {
			System.out.println(monsterName + "(이)가 죽었습니다.");
		}
		
		public void showMonsterCounterAttackMessage(String monsterName) {
			System.out.println(monsterName + "(이)가 반격 했습니다.");
		}


	
}

