@web
Feature: Magentys website
	In order to ...
	As a ...
	I want to ...
	
  @complete
  Scenario: Search for Magentys website
    Given I am on Google home page
    When I search for "Magentys" website
    Then I should see Magentys in the result list

  @complete
  Scenario Outline: Open Magentys website
    Given I open browser
    When I navigate to "<webpage>"
    Then I should see Magentys website

    Examples:
      | webpage     |
      | http://www.magentys.io |
      | http://www.magentys.com|

    @complete
    Scenario: Share a blog
      Given I am on MagenTys home page
      When I select a blog
      Then I should be able to share it