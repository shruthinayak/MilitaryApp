package com.usaa.militaryranks.classes;

import java.util.List;

public class Defence {
	private String name;
	private String logo;
	private List<Ranks> ranks;
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public List<Ranks> getRanks() {
		return ranks;
	}
	public void setRanks(List<Ranks> ranks) {
		this.ranks = ranks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
