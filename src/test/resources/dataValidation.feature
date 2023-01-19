Feature: Coin Market Cap data validation

  Scenario Outline: Filtering UI and extracting data for comparison
    Given user goes to the website
    And user filters to show twenty rows of data
    And user captures row contents, name and price
    When user clicks on Filter
    And user filters by Algorithm
    And user clicks on Add filter
    And user toggle's on Mineable
    And User selects cryptocurrency and selects coin
    And user selects price and inputs "<min_price>" & "<max_price>"
    Then user applies all the filters
    And user verifies the contents with previously captured contents
    Examples:
      | min_price | max_price |
      | 100       | 10000     |
