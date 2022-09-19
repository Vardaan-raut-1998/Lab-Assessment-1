package com.greatlearning.model;

public class Employee 
{
  String firstName,lastName;
  public Employee(String firstname,String lastname)
  {	this.firstName=firstname;
	this.lastName=lastname;
  }
     public String getFirstName()
    {   return firstName;
    }
     public String getLastName()
    {   return lastName;
    }
}
