Feature: Booking search

  Scenario Outline: Validation of hotels rating
    Given Keyword for search is "<keyword>"
    When User navigates to booking.com
    And User enters key word
    And User clicks search button
    Then Search result with "<expected hotel name>" in title is on the first page
    And Hotel has rating "<expected rating>"
    Examples:
      | keyword               | expected hotel name   | expected rating |
      | Nikos Studios Alykes  | Nikos Studios Alykes  | 7.2             |
      | Palatino Hotel        | Palatino Hotel        | 8.5             |
      | Phoenix Hotel         | Phoenix Hotel Taichung| 8.1             |