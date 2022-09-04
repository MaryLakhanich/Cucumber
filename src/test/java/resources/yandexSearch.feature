Feature: Yandex search
  Scenario: Search Yandex for TeachMeSkills
    Given Word for search is "TechMeSkills"
    When I enter search word
    And I press search button
    Then First result contains search word in title


  Scenario: Verify search results count
    Given Word for search is "TechMeSkills"
    When I enter search word
    And I press search button
    Then There are 10 results present