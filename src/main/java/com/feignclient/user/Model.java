package com.feignclient.user;

import org.springframework.boot.autoconfigure.domain.EntityScan;


public class Model {

	
	public String country;
	public int cases ;
	public int todayCases ;
	public int deaths;
	public int todayDeaths ;
	public int recovered ;
	public int active ;
	public int critical;
	public int casePerOneMillion ;
	public int deathPerOneMillion;
	public int totalTests;
	public int testPerOneMillion;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getCases() {
		return cases;
	}
	public void setCases(int cases) {
		this.cases = cases;
	}
	public int getTodayCases() {
		return todayCases;
	}
	public void setTodayCases(int todayCases) {
		this.todayCases = todayCases;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	public int getTodayDeaths() {
		return todayDeaths;
	}
	public void setTodayDeaths(int todayDeaths) {
		this.todayDeaths = todayDeaths;
	}
	public int getRecovered() {
		return recovered;
	}
	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public int getCritical() {
		return critical;
	}
	public void setCritical(int critical) {
		this.critical = critical;
	}
	public int getCasePerOneMillion() {
		return casePerOneMillion;
	}
	public void setCasePerOneMillion(int casePerOneMillion) {
		this.casePerOneMillion = casePerOneMillion;
	}
	public int getDeathPerOneMillion() {
		return deathPerOneMillion;
	}
	public void setDeathPerOneMillion(int deathPerOneMillion) {
		this.deathPerOneMillion = deathPerOneMillion;
	}
	public int getTotalTests() {
		return totalTests;
	}
	public void setTotalTests(int totalTests) {
		this.totalTests = totalTests;
	}
	public int getTestPerOneMillion() {
		return testPerOneMillion;
	}
	public void setTestPerOneMillion(int testPerOneMillion) {
		this.testPerOneMillion = testPerOneMillion;
	}
	
	

}
