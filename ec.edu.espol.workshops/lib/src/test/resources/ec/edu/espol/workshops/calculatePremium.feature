Feature: Calculate the insurance prime of the customer

	Scenario: Customer with 85 years old
	Given age is 85
	When calculate the insurance premium
	Then I should be told -1
	
	Scenario Outline: Customer with "<age>"
	Given age is "<age>"
	When calculate the insurance premium
	Then I should be told "<answer>"
	
	Examples:
	|age	|	answer|
	|85		|	-1	   |

		
Feature: Calculate the insurance prime of the customer2

	Scenario: Customers is a woman with 22 years old
	Given genre is "F", age is 22
	When calculate the insurance premium
	Then I should be told 300
	
	Scenario Outline: Customers is a "<genre>" with "<age>"
	Given genre is "<genre>", age is "<age>"
	When calculate the insurance premium
	Then I should be told "<answer>"
	
	Examples:
	|age	|	genre	|	answer|
	|22		|	  F		|	300	   |
	|50		|	  F		|	200	   |
	
Feature: Calculate the insurance prime of the customer3

	Scenario: Customer is a single man with middle-aged
	Given marital status is "NOT MARRIED", 45<age<65, genre is "M" 
	When calculate the insurance premium
	Then I should be told 400
	
	Scenario Outline: Customer with "<age>"
	Given marital status is "<maritalStatus>", "<age>" , genre is "<genre>" 
	When calculate the insurance premium
	Then I should be told "<answer>"
	
	Examples:
	|age	|	maritalStatus  |	genre	|	answer|
	|50		|	  NOT MARRIED  |	M		|	 400  |
	|22		|	  NOT MARRIED  |	M		|	2000  |
	|50		|	      MARRIED  |	M		|	 200  |
	|22		|	      MARRIED  |	M		|	 300  |
	
	