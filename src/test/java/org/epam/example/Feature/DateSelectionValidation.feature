Feature: Date Selection Validation

  Scenario: Verify Date Validation
    Given the user is on the date selection page
    When the user selects a date within the allowed range
    Then the system accepts the date without error
    When the user selects a date beyond the allowed range
    Then the system displays an error message indicating invalid date selection

  Scenario: Verify Date Selection Beyond Allowed Range
    Given the user is on the date selection page
    When the user attempts to select a date 7 months from today
    Then the system prevents selection and displays an error message

  Scenario: Verify Future Date Selection
    Given the user is on the date selection page
    When the user selects a date 3 months from today
    Then the selected date is highlighted and within allowed range
    When the user confirms the date selection
    Then the date input field displays the selected future date

  Scenario: Verify Date Selection for Today
    Given the user is on the date selection page
    When the user selects today's date from the calendar
    Then today's date is highlighted and selected
    When the user confirms the date selection
    Then the date input field displays today's date

  Scenario: Verify Calendar Interface Display
    Given the user is on the date selection page
    When the user clicks on the date input field
    Then the calendar interface is displayed