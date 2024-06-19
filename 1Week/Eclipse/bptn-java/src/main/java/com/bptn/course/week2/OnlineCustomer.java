package com.bptn.course.week2;

// Complete the OnlineCustomer class below to inherit from Customer
public class OnlineCustomer extends Customer // complete line
{
   String email ;

   // add constructor
   public OnlineCustomer(String name, String address, String email) {
       super(name, address);
       this.email = email;    
   }

   // override toString method of superclass
   public String toString() {
       return super.toString() + "\nemail: " + email;
   }

}
