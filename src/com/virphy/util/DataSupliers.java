package com.virphy.util;

import org.testng.annotations.DataProvider;

public class DataSupliers {
 
      @DataProvider(name="StudentDetails")
  public Object[][] StudentDetails() {
    return new Object[][] {
      new Object[] { 202, "Ravi from Hyderabad" },
      new Object[] { 203, "Sanseep from Kurnool" },
      new Object[] { 204, "Raghu from Kurnool" },
      new Object[] { 203, "Dileep from Nellore" },
    };
  }
  @DataProvider(name="EmployeesDetails")
  public Object[][] EmployeesDetails() {
    return new Object[][] {
      new Object[] { 500564, "Ravi Delloitte" },
      new Object[] { 500565, "Sanseep NTTD" },
      new Object[] { 500566, "Raghu Wipro" },
      new Object[] { 500567, "Dileep Capegemini" },
    };
  }
  @DataProvider
  public Object[][] CustomersDetails() {
    return new Object[][] {
      new Object[] { 10001, "Ravi Airtel" },
      new Object[] { 10001, "Sanseep BSNL" },
      new Object[] { 10001, "Raghu Jio" },
      new Object[] { 10001, "Dileep Idea" },
    };
  }
}
