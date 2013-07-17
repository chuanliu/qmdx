package cn.cyh.book.model;

/**
 * Manuser entity. @author MyEclipse Persistence Tools
 */

public class Manuser implements java.io.Serializable {

	// Fields

	private Integer manuserId;
	private String manuserName;
	private String manuserPass;

	// Constructors

	/** default constructor */
	public Manuser() {
	}

	/** full constructor */
	public Manuser(String manuserName, String manuserPass) {
		this.manuserName = manuserName;
		this.manuserPass = manuserPass;
	}

	// Property accessors

	public Integer getManuserId() {
		return this.manuserId;
	}

	public void setManuserId(Integer manuserId) {
		this.manuserId = manuserId;
	}

	public String getManuserName() {
		return this.manuserName;
	}

	public void setManuserName(String manuserName) {
		this.manuserName = manuserName;
	}

	public String getManuserPass() {
		return this.manuserPass;
	}

	public void setManuserPass(String manuserPass) {
		this.manuserPass = manuserPass;
	}

}