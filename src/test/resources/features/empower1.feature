Feature: empower website

  Scenario: eMpower Sign in and sign out
    When I open empower website
    Then I empowerSign in
    And I entered into Ordermang
    Then I empowerSign out
