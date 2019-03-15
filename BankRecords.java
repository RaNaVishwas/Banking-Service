package lab4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Vishwas
 *  This class utilizes the abstract methods declared in the abstract class client and generates client record from the csv file.
 */
public class BankRecord extends Client {
	static BankRecord[] bankObject_lab = new BankRecord[600];
	
	// creating a array list doing a list inside a list
	protected static List<List<String>> arr_ay_lab3 = new ArrayList<>();
	// instance variables
	private String id_lab3;
	private int age_lab3;
	private String sex_lab3;
	private String region_lab3;
	private double income_lab3;
	private String married_lab3;
	private int children_lab3;
	private String car_lab3;
	private String save_act_lab3;
	private String current_act_lab3;
	private String mortgage_lab3;
	private String pep_lab3;
	
	public String getMarried_lab3() {
		return married_lab3;
	}

	public void setMarried_lab3(String married) {
		this.married_lab3 = married;
	}

	public int getChildren_lab3() {
		return children_lab3;
	}

	public void setChildren_lab3(int children) {
		this.children_lab3 = children;
	}

	public String getCar_dat_lab() {
		return car_lab3;
	}

	public void setCar_dat_lab(String cars_lab3) {
		this.car_lab3 = cars_lab3;
	}

	public String getSave_account_lab3() {
		return save_act_lab3;
	}

	public void setSave_account_lab3(String save_acccount_lab3) {
		this.save_act_lab3 = save_acccount_lab3;
	}

	public String getCurrent_account_lab() {
		return current_act_lab3;
	}

	public void setCurrent_account_lab3(String current_act) {
		this.current_act_lab3 = current_act;
	}

	public String getMort_gage_lab3() {
		return mortgage_lab3;
	}

	public void setMort_gage_lab3(String mort_gage_lab3) {
		this.mortgage_lab3 = mort_gage_lab3;
	}

	public String getPep_lab3() {
		return pep_lab3;
	}

	public void set_Pep_lab3(String pep_lab3) {
		this.pep_lab3 = pep_lab3;
	}