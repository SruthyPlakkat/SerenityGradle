Feature: Calendar Date Selection

  Scenario Outline: User navigates and selects dates in the calendar
    Given the calendar is open
    When the user navigates to the month "<Month>"
    Then the calendar should allow navigation up to 6 months ahead
    When the user selects a valid date "<ValidDate>"
    Then the date should be selected smoothly without errors
    When the user attempts to select an invalid date "<InvalidDate>"
    Then the system should provide clear feedback on invalid selection

  Examples:
    | Month      | ValidDate | InvalidDate |
    | January    | 15        | 32          |
    | February   | 10        | 30          |
    | March      | 20        | 35          |
    | April      | 25        | 31          |
    | May        | 5         | 40          |
    | June       | 18        | 33          |