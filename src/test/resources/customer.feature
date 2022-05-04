Feature: Customers module tests


  Scenario Outline: Create customers and check the records

    Given admin is in create customers page
    When he creates the customer with fields "<Customer name>","<Phone number>","<Email>","<Password>","<Blood Group>"
    Then the customer should be created
    Then he should logout

    Examples:
      | Customer name | Phone number | Email           | Password | Blood Group |
      | test User     | 0121321211212  | test122@test.com | Test123$ | B+          |


  Scenario: Admin cannot create customers with invalid data
