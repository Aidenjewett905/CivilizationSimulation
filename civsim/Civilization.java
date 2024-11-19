package civsim;

public class Civilization {

	private String name = null;
	private String govType = null;
	private int population = 0;
	private int popRate = 0; //Yearly increase/decrease in population, base 0 (Stable)
	private double stability = 50;
	private double stabRate = 0.0; //Yearly increase/decrease in stability, base 0 (Stable)
	
	public Civilization(String name, String govType) {
		this.name = name;
		this.govType = govType;
	}
	public Civilization(String name, String govType, int population) {
		this.name = name;
		this.govType = govType;
		this.population = population;
	}
	public Civilization(String name, String govType, double stability) {
		this.name = name;
		this.govType = govType;
		this.stability = stability;
	}
	public Civilization(String name, String govType, int population, double stability) {
		this.name = name;
		this.govType = govType;
		this.population = population;
		this.stability = stability;
	}
	public Civilization(Civilization civ) {
		name = civ.getName();
		govType = civ.getGov();
		population = civ.getPopulation();
		popRate = civ.getPopRate();
		stability = civ.getStability();
		stabRate = civ.getStabRate();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGov() {
		return govType;
	}
	public void setGov(String govType) {
		this.govType = govType;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getPopRate() {
		return popRate;
	}
	public void setPopRate(int popRate) {
		this.popRate = popRate;
	}
	public double getStability() {
		return stability;
	}
	public void setStability(double stability) {
		this.stability = stability;
	}
	public double getStabRate() {
		return stabRate;
	}
	public void setStabRate(double stabRate) {
		this.stabRate = stabRate;
	}
	public void setCivData(Civilization civ) {
		name = civ.getName();
		govType = civ.getGov();
		population = civ.getPopulation();
		popRate = civ.getPopRate();
		stability = civ.getStability();
		stabRate = civ.getStabRate();
	}
	
}
