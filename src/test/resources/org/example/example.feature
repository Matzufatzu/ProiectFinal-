Feature: An example

  Scenario: The example
    Given I am on the main page
    When the email value of "tester@test.com" is inputted
    And the submit button is clicked
    Then the newsletter confirmation pop-up appears

  Scenario: Valid email Governamental
    Given  I am on the main page
    When  the email value of "tester@gov.uk" is inputted
    And the submit button is clicked
    Then the newsletter confirmation pop-up appears

   Scenario: Valid email RO
    Given I am on the main page
    When the email value of "tester@test.ro" is inputted
    And the submit button is clicked
     Then the newsletter confirmation pop-up appears

   Scenario: Start the Enrollment
    Given I am on the main page
    When I click enrollment button
     Then Personal information page is open

   Scenario: Start the What you'll learn
    Given I am on the main page
    When I click what you'll learn
     Then the learn the fundamentals appears

   Scenario:  Start the Questions
    Given I am on the main page
    When I click questions
     Then the frequently asked questions appears

   Scenario: Start the ReadMoreLearnFundamentals
    Given I am on the main page
    When I click read more learn fundamentals
     Then the fundamentals page opens

  Scenario: Enrollment for personal information with valid data
    Given I am on the enrolment page
    When the first name is populated with the value of "Iuliana"
    When the last name is populated with the value of "Humeniuc"
    When the username is populated with the value of"Iuliana"
    When the password is populated with the value of"DeiAndre"
    When the confirm password is populated with the value of"DeiAndre"
    When next personal information is clicked
    Then the contact information is open

  Scenario: Enrollment for personal information with invalid name
    Given I am on the enrolment page
    When the first name is populated with the value of "5678!@##$%"
    When the last name is populated with the value of "Humeniuc"
    When the username is populated with the value of"Iuliana"
    When the password is populated with the value of"DeiAndre"
    When the confirm password is populated with the value of"DeiAndre"
    When next personal information is clicked
    Then the contact information is open

  Scenario: Enrollment when no fields are filled in
    Given I am on the enrolment page
    When the first name is populated with the value of ""
    When the last name is populated with the value of ""
    When the username is populated with the value of""
    When the password is populated with the value of""
    When the confirm password is populated with the value of""
    When next personal information is clicked
    Then I remain on the personal information page

  Scenario: Contact Information with valid data
    Given I am on the contact information page
    When the email is populated with the value of"Lupascu@yahoo.com"
    When the phone is populated with the value of"0765064780"
    When the country is populated with the value of"Uganda"
    When the city is populated with the value of"Cucuietiidindeal"
    When the post code is populated with the value of"0000"
    When next contact information is clicked
    Then the course options appear






