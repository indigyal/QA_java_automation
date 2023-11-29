Feature: OrangeHRM Login Page

Scenario Outline: Login successful validation
        Given the user access the webdriver orangehrm login page
        When the user entered the correct "<username>" and "<password>"
        And the user clicks login button
        Then the user should see"<expectedMessage>"
#        And the user entered the wrong "<username>" and "<password>"
#        And the user click login button
#        Then the user should see the "<expectedMessage>"

#        Examples:
#                | username | password | expectedMessage |
#                | admin    | admin123 | Dashboard       |
#                | Admin    | admin123 | Invalid credentials |
