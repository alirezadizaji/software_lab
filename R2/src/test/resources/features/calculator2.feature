@tag
Feature: Calculator

  Scenario: operate given number
    Given one input and opt, 4 and sqr
    When I finish operating
    Then the result would be 2

  Scenario Outline: operate given number
    Given one input and opt, <input> and <opt>
    When I finish operating
    Then the result would be <result>

    Examples:
      | input   | opt   | result |
      | 4       | rvs   | 0.25   |
      | 4       | sqr   | 2      |
      | 0.25    | sqr   | 0.5    |
      | 0.25    | rvs   | 4      |
      | 0.33333 | rvs   | 3      |