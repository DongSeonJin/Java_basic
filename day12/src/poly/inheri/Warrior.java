package poly.inheri;

public class Warrior {
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	// 생성자를 만들어주세요. id만 입력받고
	// 나머지는 체력은 20, 공격력 3, 방어력 1로 고정됩니다.
	
	public Warrior(String id) {
		this.id = id;
		this.hp = 3;
		this.atk = 3;
		this.def = 1;
		this.exp = 0;
	}
	
	//캐릭터 상태가 조회 가능한 showStatus()를 만들어보겠습니다.
	//이 메서드는 멤버변수정보를 콘솔에 찍어줍니다.
	public void showStatus() {
		System.out.println("아이디 :" + this.id);
		System.out.println("체력 :" + this.hp);
		System.out.println("공격력 :" + this.atk);
		System.out.println("방어력 :" + this.def);
		System.out.println("획득경험치 :" + this.exp);
		System.out.println("---------------------");
		
	}
	
	// 파라미터로 모든 몬스터의 부모인 Monster를 선언하면
	// 다형성 원리에 의해서 상속받은 모든 몬스터가 대입 가능합니다.
	public void hunt(Monster monster) {
		// 죽은 몬스터는 교전 불가 및 종료
		
		// 죽은 몬스터가 다음공격에 죽으면 플레이어에게 경험치 부여
		
		// 몬스터가 다음 공격에 죽지는 않으면 반격해 플레이어 체력 차감
		if(!monster.isMonsterActive()) {
			System.out.println(monster.getName() + "(이)가 이미 죽었습니다.");
			return;
		}
		if(!monster.isAttackedMonsterActive(atk)) {
			monster.setDamagedHp(atk);
			System.out.println(monster.getName() + "(이)가 죽었습니다.");
			this.exp += monster.getExp();
		}else {
			monster.setDamagedHp(atk);
			this.hp -= monster.getAtk();
			System.out.println("반격 당했습니다.");
		}
		
		
	}
}
