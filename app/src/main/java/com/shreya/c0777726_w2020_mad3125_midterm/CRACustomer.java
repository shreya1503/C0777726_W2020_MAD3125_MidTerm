package com.shreya.c0777726_w2020_mad3125_midterm;

import android.os.Parcel;
import android.os.Parcelable;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class CRACustomer implements Parcelable
{
    private String sinNumber;
    private String firstName;
    private String lastName;
    private String fullName;
    private String personGender;
    private Date dateOfBirth, filingTaxDate;
    private double fedTax, provTax;
    private double rrspCarryForward;
    private double grossIncome;
    private double rrspContribution;
    private double totalEI;
    private double totalTaxableAmount;
    private double totalTaxPaid;


    public CRACustomer(String sinNumber, String firstName, String lastName, String personGender, double grossIncome, double rrspContribution)
    {
        this.sinNumber = sinNumber;
        this.firstName = firstName;
        this.personGender = personGender;
        this.grossIncome = grossIncome;
        this.rrspContribution = rrspContribution;

    }

    public String getSinNumber() {
        return sinNumber;
    }

    public void setSinNumber(String sinNumber) {
        this.sinNumber = sinNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFull_name() {
        return getFirstName()+getLastName();
    }

    public void setFull_name(String full_name) {
        this.fullName = full_name;
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getFilingTaxDate() {
        return filingTaxDate;
    }

    public void setFilingTaxDate(Date filingTaxDate) {
        this.filingTaxDate = filingTaxDate;
    }

    public double getFedTax() {
        return fedTax;
    }

    public void setFedTax(double fedTax) {
        this.fedTax = fedTax;
    }

    public double getProvTax() {
        return provTax;
    }

    public void setProvTax(double provTax) {
        this.provTax = provTax;
    }

    public double getRrspCarryForward() {
        return rrspCarryForward;
    }

    public void setRrspCarryForward(double rrspCarryForward) {
        this.rrspCarryForward = rrspCarryForward;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public double getRrspContribution() {
        return rrspContribution;
    }

    public void setRrspContribution(double rrspContribution) {
        this.rrspContribution = rrspContribution;
    }

    public double getTotalEI() {
        return totalEI;
    }

    public void setTotalEI(double totalEI) {
        this.totalEI = totalEI;
    }

    public double getTotalTaxableAmount() {
        return totalTaxableAmount;
    }

    public void setTotalTaxableAmount(double totalTaxableAmount) {
        this.totalTaxableAmount = totalTaxableAmount;
    }

    public double getTotalTaxPaid() {
        return totalTaxPaid;
    }

    public void setTotalTaxPaid(double totalTaxPaid) {
        this.totalTaxPaid = totalTaxPaid;
    }


}
