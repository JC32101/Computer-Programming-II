package classSamples.polymorphism.SearchingAndSorting;

public class Player {
	private final String name;
	private int XP;
	
	public Player(String n, int xp) {
		name = n;
		XP = xp;
	}
	
	public String getName() {
		return name;
	}
	
	public int getXP() {
		return XP;
	}
	
	public void setXP(int xp) {
		XP = xp;
	}
	
	public boolean equals(Object o) {
		return (this.name.equals(((Player) o).getName()));
	}
	
	public String toString() {
		return "Name: " + name + "\nXP: " + XP;
	}
	
	public int compareTo(Player p) {
		int result = 0;

		if (name.equals(p.getName()))
			result = name.compareTo(p.getName());
		return result;
	}
}
