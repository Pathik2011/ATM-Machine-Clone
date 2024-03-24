**ATM Machine Clone Application**

---

**Project Overview:**

This project is a pure Java implementation of an ATM machine clone application. It is developed using NetBeans IDE and utilizes MySQL database managed with MySQL Workbench.

---

**Features:**

1. **User Authentication**: Users can authenticate themselves using their card number and PIN.

2. **Account Balance Inquiry**: Users can check their account balance.

3. **Cash Withdrawal**: Users can withdraw cash from their account.

4. **Cash Deposit**: Users can deposit cash into their account.

5. **Transaction History**: Users can view their transaction history.



---

**Requirements:**

- Java Development Kit (JDK)
- NetBeans IDE
- MySQL Database Server
- MySQL Workbench

---

**Setup Instructions:**

1. **Clone the Repository:**

2. **Import Project into NetBeans:**
- Open NetBeans IDE.
- Click on `File` -> `Open Project`.
- Navigate to the cloned repository directory and select the project.

3. **Set Up MySQL Database:**
- Open MySQL Workbench.
- Execute the SQL script to create the necessary tables and populate initial data.

```
create database bankmanagementsystem;
```
```
use bankmanagementsystem;
```
```
create table signup(formno varchar(20),name varchar(20), father_name varchar(20), dob varchar(20),gender varchar(20),email varchar(30), marital varchar(20), address varchar(50), city varchar(20), pin varchar(20), state varchar(25));         
```
```
create table signuptwo(formno varchar(20),religion varchar(20),category varchar(20),income varchar(20),education varchar(20),occupation varchar(20),pan varchar(20),aadhar varchar(20),seniorcitizen varchar(20),existingaccount varchar(20));
```
```
create table signupthree(formno varchar(20),accountType varchar(40), cardnumber varchar(25), pin  varchar(10), facility varchar(100));
```
```
create table login(formno varchar(20),cardnumber varchar(25), pin  varchar(10));
```
```
create table bank(pin varchar(10), date varchar(50), type varchar(20), amount varchar(20));
```
  

4. **Configure Database Connection:**
- Open the project in NetBeans.
- Navigate to the database configuration file (`DatabaseConnection.java` or similar).
- Modify the database connection settings (URL, username, password) to match your MySQL database configuration.

5. **Build and Run:**
- Build the project in NetBeans.
- Run the project.

---

**Usage:**

1. **User Authentication:**
- Enter account number and PIN when prompted.

2. **Main Menu:**
- Select desired operation from the menu options.

3. **Cash Withdrawal/Deposit:**
- Enter the amount to withdraw/deposit when prompted.

4. **Mini Statement:**
- show your last 5  transactions.

5. **Pin Change:**
- Change your pin.


---
<h1 align="center">
**IMAGES**
</h1>




<h3 align="center">
LOGIN PAGE
</h3>

---

<p align="center">
<img src="https://github.com/pathikdas2011/ATM-Machine-Clone/assets/41726148/0f1861f3-9cd9-479c-aa7e-943b97a3c98d" width="500" height="500">
</p>

---

<h3 align="center">
Application Form Page
</h3>

---

<p align="center">
<img src="https://github.com/pathikdas2011/ATM-Machine-Clone/assets/41726148/1dbb0aed-6851-4a6a-af4e-b5eba3716765" width="500" height="500">
</p>

---

<h3 align="center">
Main Screen
</h3>

---

<p align="center">
<img src="https://github.com/pathikdas2011/ATM-Machine-Clone/assets/41726148/1b46f503-8d1e-481e-ac6d-c99825d34f4d" width="500" height="500">
</p>

---

<h3 align="center">
Mini Statement
</h3>

---

<p align="center">
<img src="https://github.com/pathikdas2011/ATM-Machine-Clone/assets/41726148/8bf38726-83d0-444e-af8c-cf89e569739c" width="500" height="500">
</p>

---


**Contributing:**

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

---





**Acknowledgements:**

Special thanks to contributors and libraries used in this project.

---



**Disclaimer:**

This project is for educational purposes only. It does not replicate the full functionality or security measures of a real-world ATM system. Use at your own risk.
