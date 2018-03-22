Feature: Magentys web

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