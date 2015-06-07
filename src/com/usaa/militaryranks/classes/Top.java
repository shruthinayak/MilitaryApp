package com.usaa.militaryranks.classes;

public class Top {
	Defence army;
	Defence marines;
	Defence airForce;
	Defence navy;
	Defence coastGuard;
	
	public Defence getArmy() {
		return army;
	}
	public void setArmy(Defence army) {
		this.army = army;
	}
	public Defence getMarines() {
		return marines;
	}
	public void setMarines(Defence marines) {
		this.marines = marines;
	}
	public Defence getAirForce() {
		
		return airForce;
	}
	public void setAirForce(Defence airForce) {
		this.airForce = airForce;
	}
	public Defence getNavy() {
		
		return navy;
	}
	public void setNavy(Defence navy) {
		navy.setName("Navy");
		this.navy = navy;
	}
	public Defence getCoastGuard() {
		return coastGuard;
	}
	public void setCoastGuard(Defence coastGuard) {
		this.coastGuard = coastGuard;
	}
	
}
