package com.Customer_CRUD.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="customer")
public class Customer {

		@Id
		
		@Column(name="id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		
		@NotNull
		@Column(name="first_name")
		private String firstName;
		
		@NotNull
		@Column(name="last_name")
		private String lastName;
		
		@NotNull
		@Column(name="email")
	    private String Email;

		
		
		
		
		


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}

		public Customer(String firstName, String lastName, String Email) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.Email = Email;
		}

		public Customer() {
			super();
		}

		@Override
		public String toString() {
			return "Customer_CRUD_Entity [firstName=" + firstName + ", lastName=" + lastName + ", Email=" + Email + "]";
		}
		
		
	    
		
		
	

	
	
	
	
}
