package com.service.hello;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author rahul535
 *
 */
@XmlRootElement
public class Student {
	private int RollNo;
	private String Name;
	private String Date_Of_Birth;
	private int Physics;
	private int Chemistry;
	private int Mathematics;
	
	
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return RollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the date_Of_Birth
	 */
	public String getDate_Of_Birth() {
		return Date_Of_Birth;
	}
	/**
	 * @param date_Of_Birth the date_Of_Birth to set
	 */
	public void setDate_Of_Birth(String date_Of_Birth) {
		Date_Of_Birth = date_Of_Birth;
	}
	/**
	 * @return the marks in physics
	 */
	public int getPhysics() {
		return Physics;
	}
	/**
	 * @param physics the  marks in physics to set
	 */
	public void setPhysics(int physics) {
		Physics = physics;
	}
	/**
	 * @return the  marks in chemistry
	 */
	public int getChemistry() {
		return Chemistry;
	}
	/**
	 * @param chemistry the  marks in chemistry to set
	 */
	public void setChemistry(int chemistry) {
		Chemistry = chemistry;
	}
	/**
	 * @return the  marks in mathematics
	 */
	public int getMathematics() {
		return Mathematics;
	}
	/**
	 * @param mathematics the  marks in mathematics to set
	 */
	public void setMathematics(int mathematics) {
		Mathematics = mathematics;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", RollNo=" + RollNo + ", Date_Of_Birth=" + Date_Of_Birth + ", Physics="
				+ Physics + ", Chemistry=" + Chemistry + ", Mathematics=" + Mathematics + "]";
	}
	
	
}
