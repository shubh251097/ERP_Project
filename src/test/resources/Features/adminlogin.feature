@tag
Feature: Admin Login
  I want to use this template to validate Admin Login

  @tag1
  Scenario: Check Admin Login with valid credentials
    Given I open browser with valid url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    Then I should see login page
    When I enter username as "Admin"
    And I enter password as "admin123"
    And I click on Login Button
    Then I should see Admin module
    When I click on Logout
    Then I should see Login page
    When I close browser

  @tag2
  Scenario Outline: Check Admin Login with invalid inputs.
    Given I open browser with valid url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    Then I should see login page
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I click on Login Button
    Then I should see error message
    When I close browser
    And I click logout

    Examples: 
      | username | password |
      | Admin    | abc123   |
      | abc123   | admin123 |
      | xyz234   | abcd12   |
