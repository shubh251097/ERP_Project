Feature: Automating Checkboxes of RCA website

  @tag
  Scenario: Check checkboxes are selecting or not
    Given I open browser with valid url
    Then I click on checkbox1
    And I click on checkbox2
    And I click on checkbox3
    Then I should see checkbox selected or not
    And Close the browser
