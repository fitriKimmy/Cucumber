Feature: Final Bill Calculation

@ScenarioOutlineExample
Scenario Outline: Customer Bill Amount Calculation
Given I have Customer
And user enter initial amount as <InitialBillAmount>
And sales tax rate is <TaxRate> percent
Then final bill amount calculate is <CalculatedBillAmount>
Examples:
	|	InitialBillAmount	| TaxRate	| CalculatedBillAmount	|
	| 100								| 10			|110										|
	| 200								| 8				|216										|
	
	