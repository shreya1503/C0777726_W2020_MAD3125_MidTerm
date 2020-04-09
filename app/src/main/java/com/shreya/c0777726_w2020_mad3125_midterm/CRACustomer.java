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

}
