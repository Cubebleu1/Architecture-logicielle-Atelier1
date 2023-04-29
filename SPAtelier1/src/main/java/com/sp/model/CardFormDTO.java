package com.sp.model;

public class CardFormDTO {
	private User user;
	private String name;
	private String familyName;
	private int comments;
	private String description;
	private String imgPath;
	private String familyPath;
	private int hp;
	private int energy;
	private int defence;
	private int attack;
	
	public CardFormDTO(User u, String name, String fmlyName, int c, String desc, String imgP, String fmlyp, int hp, int energy, int def,int atk) {
		this.setUser(u);
		this.setName(name);
		this.setFamilyName(fmlyName);
		this.setComments(c);
		this.setImgPath(imgP);
		this.setFamilyPath(fmlyp);
		this.setDescription(desc);
		this.setAttack(atk);
		this.setDefence(def);
		this.setEnergy(energy);
		this.setHp(hp);
	}
	
	public CardFormDTO() {
		this(new User(), "", "", 0, "", "", "", 0, 0, 0, 0);
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public int getComments() {
		return comments;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getFamilyPath() {
		return familyPath;
	}

	public void setFamilyPath(String familyPath) {
		this.familyPath = familyPath;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	
}
