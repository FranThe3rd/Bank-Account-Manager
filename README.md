# Simple Bank Class Explanation

The `Bank` class represents a simple bank account with basic operations like checking account information, balance, deposit, and withdrawal. It also generates an email for the customer and provides a simple command-line user interface for interacting with the bank account.

## Class Variables

- `customerID`: An integer representing the unique customer ID.
- `name`: A string representing the name of the customer.
- `allowance`: A double representing the initial allowance (balance) in the account.

## Constructor `Bank(int customerID, String name, double allowance)`

- Initializes the bank account with the given customer ID, name, and initial allowance.
- Displays a greeting message to the customer and waits for a short time before proceeding to the `run_transaction()` method.

## Method `run_transaction()`

- Displays a menu of banking operations and waits for user input.
- Handles user input and performs corresponding actions based on the selected option.
- Continues to display the menu until the user chooses to exit.

## Method `menu()`

- Displays the main menu options for different banking operations.

## Method `email_creator()`

- Generates and returns an email address for the customer based on their name and a random number.

## Method `random_ethnicity()`

- Returns a random ethnicity from a predefined array of ethnicities.

## Method `account_info()`

- Displays the account information for the customer, including name, generated email, customer ID, and ethnicity.

## Method `balance_info()`

- Displays the current account balance.

## Method `withdraw()`

- Allows the user to withdraw an amount from their account balance.

## Method `deposit()`

- Allows the user to deposit an amount into their account balance.

## Getter and Setter Methods

- Getter methods (`getCustomerID()`, `getName()`, `getAllowance()`) return the respective class variables.
- Setter methods (`setCustomerID(int customerID)`, `setName(String name)`, `setAllowance(double allowance)`) set new values for the class variables.

