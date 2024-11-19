package civsim;

import java.util.Random;

public class Event {

	private final int GOOD_EVENT_CHANCE = 30; //Percent chance 0-100
	private final int BAD_EVENT_CHANCE = 30;
	private final int NEUTRAL_EVENT_CHANCE = 35;
	private final int CIV_CHANCE = 5; //Chance of a civ appearing
	private int totalPercent = GOOD_EVENT_CHANCE + BAD_EVENT_CHANCE + NEUTRAL_EVENT_CHANCE + CIV_CHANCE; //Just in case percent not = 100
	private Civilization affectedCiv = new Civilization(null, null); //Internal copy of the affected civ to be returned upon modification
	private Random random = new Random();
	
	public Event() {
		
	}
	public Event(Civilization civ) {
		affectedCiv.setName(civ.getName());
		affectedCiv.setGov(civ.getGov());
		affectedCiv.setPopulation(civ.getPopulation());
		affectedCiv.setPopRate(civ.getPopRate());
		affectedCiv.setStability(civ.getStability());
		affectedCiv.setStabRate(civ.getStabRate());
	}
	public void setAffectedCiv(Civilization civ) {
		affectedCiv.setName(civ.getName());
		affectedCiv.setGov(civ.getGov());
		affectedCiv.setPopulation(civ.getPopulation());
		affectedCiv.setPopRate(civ.getPopRate());
		affectedCiv.setStability(civ.getStability());
		affectedCiv.setStabRate(civ.getStabRate());
	}
	public Civilization getCivData() {
		return affectedCiv;
	}
	
}
