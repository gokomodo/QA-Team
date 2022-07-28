Feature: Forget password

  Scenario Outline: As a buyer want to forget password
    Given As a buyer already on login gokomodo page
    When As a buyer click forget password lint text
    And As a buyer input '<email2>' on text field
    And As a buyer click Atur ulang kata sandi button
    Then As a buyer should be redirect to cek email anda page

    Examples: Forget pass. Test
      | email2           |  |  |
      | nausee1@mail.com |  |  |