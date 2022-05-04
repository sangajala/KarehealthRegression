Feature: User accounts

  Scenario: Admin can login to the application

    Given Admin is in landing page
    When he logins as valid admin to the application
    Then he should see the dashboard
    Then he should logout

