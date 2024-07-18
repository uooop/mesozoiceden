package com.mesozoiceden;

public class Dinosaur {
	private String dinoName; // 공룡 이름
	private int dinoAge; // 공룡 나이
	private double dinoWeight; // 공룡 몸무게
	private String dinoDiet; // 공룡 식성
	private String dinoSpecies;
    
    // 생성자 여기에 값 추가하면 아래 상속 받은 클래스 생성자도 수정 해야됨
    public Dinosaur(String dinoName, int dinoAge, double dinoWeight, String dinoDiet, String dinoSpecies) {
    	this.dinoName = dinoName;
    	this.dinoAge = dinoAge;
    	this.dinoWeight = dinoWeight;
    	this.dinoDiet = dinoDiet;
    	this.dinoSpecies = dinoSpecies;
    }

    // 해당 공룡 이름 얻기
    public String getDinoName() {
        return dinoName;
    }
    // 해당 공룡 나이 얻기
    public int getDinoAge() {
        return dinoAge;
    }
    // 해당 공룡 몸무게 얻기
    public double getDinoWeight() {
        return dinoWeight;
    }
    // 해당 공룡 식성 얻기
    public String getDinoDiet() {
        return dinoDiet;
    }
    public String getDinoSpecies() {
        return dinoSpecies;
    }
    
    // 해당 공룡 이름 얻기
    public void setDinoNaem(String dinoName) {
        this.dinoName = dinoName;
    }
    // 해당 공룡 나이 얻기
    public void setDinoAge(int dinoAge) {
        this.dinoAge = dinoAge;
    }
    // 해당 공룡 몸무게 얻기
    public void setDinoWeight(double dinoWeight) {
        this.dinoWeight = dinoWeight;
    }
    // 해당 공룡 식성 얻기
    public void setDinoDiet(String dinoDiet) {
        this.dinoDiet = dinoDiet;
    }
    
    

   
}

//모사사우루스
class Mosasaurus extends Dinosaur {
	// 생성자
	public Mosasaurus(String dinoName, int dinoAge, double dinoWeight, String dinoDiet, String dinoSpecies) {
		super(dinoName, dinoAge, dinoWeight, dinoDiet, dinoSpecies);
	}
	
}

//프테라노돈
class Pteranodon extends Dinosaur {
	// 생성자
	public Pteranodon(String dinoName, int dinoAge, double dinoWeight, String dinoDiet, String dinoSpecies) {
		super(dinoName, dinoAge, dinoWeight, dinoDiet, dinoSpecies);
	}
}

//스피노사우루스
class Spinosaurus extends Dinosaur {
	// 생성자
	public Spinosaurus(String dinoName, int dinoAge, double dinoWeight, String dinoDiet, String dinoSpecies) {
		super(dinoName, dinoAge, dinoWeight, dinoDiet, dinoSpecies);
	}
}

//트리케라톱스
class Triceratops extends Dinosaur {
	// 생성자
	public Triceratops(String dinoName, int dinoAge, double dinoWeight, String dinoDiet, String dinoSpecies) {
		super(dinoName, dinoAge, dinoWeight, dinoDiet, dinoSpecies);
	}
}

//티라노사우루스
class Tyrannosaurus extends Dinosaur {
  // 생성자
  public Tyrannosaurus(String dinoName, int dinoAge, double dinoWeight, String dinoDiet, String dinoSpecies) {
      super(dinoName, dinoAge, dinoWeight, dinoDiet, dinoSpecies);
  }
}

