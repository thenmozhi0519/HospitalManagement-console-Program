# Mini Hospital Management System (Java)

## Overview

This is a simple console-based Hospital Management System implemented in Java. It demonstrates basic Object-Oriented Programming (OOP) concepts such as classes, objects, encapsulation, and method organization. The system manages doctors, patients, ward allocation, and billing using in-memory data structures.

## Features

* Add and view doctors (preloaded)
* Add and view patients
* Automatically assign a doctor based on disease
* Assign wards to patients
* Generate and view bills
* Menu-driven console interface

## Technologies Used

* Java
* ArrayList (for data storage)
* Scanner (for user input)

## System Design

The system is divided into five main classes:

### 1. Doctor

* Stores doctor details (ID, name, specialization)
* Contains logic to assign a doctor based on disease
* Displays doctor list

### 2. Patient

* Stores patient details (ID, name, disease, doctor ID)
* Links to doctor using doctorId
* Displays patient list

### 3. Ward

* Stores ward details (ward ID, type, patient ID)
* Links to patient using patientId
* Displays ward assignments

### 4. Bill

* Stores billing details (bill ID, patient ID, amount)
* Links to patient using patientId
* Displays billing records

### 5. HospitalManagement (Main Class)

* Controls the overall program flow
* Contains menu system
* Handles user input and method calls

## Data Relationships

* One doctor can treat many patients
* Each patient is assigned one doctor
* Each patient can be assigned a ward
* Each patient has a bill

Relationships are maintained using IDs:

* doctorId connects Doctor and Patient
* patientId connects Patient with Ward and Bill

## Program Flow

1. Program starts
2. Predefined doctors are added
3. Menu is displayed
4. User selects an option
5. Corresponding method is executed
6. Data is stored in ArrayLists
7. Results are displayed

## How to Run

1. Compile the program:
   javac HospitalManagement.java

2. Run the program:
   java HospitalManagement

## Sample Menu

1. Add Patient
2. View Patients
3. View Doctors
4. Add Ward
5. View Wards
6. Add Bill
7. View Bills
8. Exit

## Example Usage

* Add a patient by entering ID, name, and disease
* System assigns a doctor automatically
* Assign ward using patient ID
* Generate bill using patient ID
* View stored records anytime

## Key Concepts Demonstrated

* Class and Object design
* Static methods and variables
* ArrayList usage
* Method separation and modular design
* Menu-driven programming

## Future Enhancements

* Database integration (MySQL)
* GUI interface
* Multiple doctor assignment
* Appointment scheduling
* Input validation

## Conclusion

This project provides a clear and simple implementation of a hospital management system suitable for beginners. It focuses on clean structure, modular design, and easy understanding, making it useful for exams and basic project demonstrations.
