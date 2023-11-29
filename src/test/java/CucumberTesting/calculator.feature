Feature: Calculator
    As a user
    I want to perform basic arithmetic operations
    So that I can calculate mathematical expressions

    Scenario: Add two numbers
        Given I have entered 6 into the calculator
        And I have entered 7 into the calculator
        When I Press add
        Then the result should be 13 on the screen.

    Scenario: Subtract two numbers
        Given I have entered 10 into the calculator
        And I have entered 5 into the calculator
        When I Press subtract
        Then the result should be 5 on the screen