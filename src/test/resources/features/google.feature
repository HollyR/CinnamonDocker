Feature: Google search

  @complete
  Scenario: Search for Magentys website
    Given I am on Google home page
    When I search for "Magentys" website
    Then I should see Magentys in the result list