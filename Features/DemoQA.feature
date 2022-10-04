Feature: fetaure to test Student Registration Form functionality

  Scenario: Check Student Registration Form is successful with credentials
    Given browser is open
    And user is on the Student Registration Form
    When user enters text in First name, last name, Email Text box
    And user clicks on the Gender Check box
    When user enters text in Mobile Number Text box
    When user enters text in the date of birth Text box
    And user hits the hobbies checkbox
    And user uploads the picture
    When user enters text in Current Address TextBox
    And user hits Submit button
    Then user hits close button
