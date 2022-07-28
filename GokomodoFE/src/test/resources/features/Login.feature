Feature: Login

  Scenario Outline: As a buyer want to login gokomodo page
    Given As a buyer already on gokomodo page
    When As a buyer input '<email>'
    And buyer input '<password>'
    And buyer click login button
    Then As a user should be redirect to main gokomodo page

    Examples: SCENARIO OUTLINE DATA
      | email                    | password |
      | nausee1@mail.com        | Kodomo10 |

