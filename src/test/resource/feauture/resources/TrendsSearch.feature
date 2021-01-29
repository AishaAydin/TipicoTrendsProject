@trends
Feature: As a user,I should be able to compare two terms in trends.google.com

  Scenario: User should be able compare "Selenium WebDriver" and "Javascript WebDriverIO" from compare page.

    Given user is on the main page
    When  user enter "Selenium WebDriver" on search box
    Then  user navigates to Explore page
    And   user enter "Javascript WebDriverIO" to the +Compare field
    Then  user should be on Compare page
    And   user select filters
    And   user select compare by metro
    Then  user verify percentual ratio