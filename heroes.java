public class heroes {

	public static void main(String[] args) {
		SwordMan saber = new SwordMan("亞拉岡", 1, 0);
		ArrowMan archer = new ArrowMan("勒苟拉斯", 1, 0);
		System.out.println("英雄名" + saber.getName() + "，等級是" + saber.getLevel() + "，經驗值是" + saber.getExp());
		System.out.println("會用的技能如下:");
		saber.setAttackSkills(new SwordAttack());
		saber.setDefendSkills(new HeavySheild());
		saber.setMoveSkills(new Walk());
		saber.attack();
		saber.defend();
		saber.move();
		System.out.println("\n英雄名" + archer.getName() + "，等級是" + archer.getLevel() + "，經驗值是" + archer.getExp());
		System.out.println("會用的技能如下:");
		archer.setAttackSkills(new ArrowAttack());
		archer.setDefendSkills(new WoodSheild());
		archer.setMoveSkills(new Run());
		archer.attack();
		archer.defend();
		archer.move();
	}

}

interface IAttackSkills {
	void attack();
}

interface IDefendSkills {
	void defend();
}

interface IMoveSkills {
	void move();
}

class SwordAttack implements IAttackSkills {
	@Override
	public void attack() {
		System.out.println("揮劍");
	}
}

class ArrowAttack implements IAttackSkills {
	@Override
	public void attack() {
		System.out.println("放弓箭");
	}
}

class HeavySheild implements IDefendSkills {
	@Override
	public void defend() {
		System.out.println("用重盾防禦");
	}
}

class WoodSheild implements IDefendSkills {
	@Override
	public void defend() {
		System.out.println("用木盾防禦");
	}
}

class Walk implements IMoveSkills {
	@Override
	public void move() {
		System.out.println("走路");
	}
}

class Run implements IMoveSkills {
	@Override
	public void move() {
		System.out.println("跑步");
	}
}

class Hero {
	private IAttackSkills attackSkills;
	private IDefendSkills defendSkills;
	private IMoveSkills moveSkills;
	protected String name;
	protected int level;
	protected double exp;

	public Hero() {
		this("David", 1, 0);
	}

	public void setAttackSkills(IAttackSkills attackSkills) {
		this.attackSkills = attackSkills;
	}

	public void setDefendSkills(IDefendSkills defendSkills) {
		this.defendSkills = defendSkills;
	}

	public void setMoveSkills(IMoveSkills moveSkills) {
		this.moveSkills = moveSkills;
	}

	protected void attack() {
		attackSkills.attack();
	}

	protected void defend() {
		defendSkills.defend();
	}

	protected void move() {
		moveSkills.move();
	}

	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public double getExp() {
		return exp;
	}
}

class ArrowMan extends Hero {
	public ArrowMan(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
}

class SwordMan extends Hero {
	public SwordMan(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
}
