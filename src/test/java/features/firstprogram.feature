Feature: Application Login

  Scenario: Admin page default login

    Given User is on Netbanking landing page
    #Passing credentials from Step
    When User login into application with "admin" and password "1234"
    Then Home page is displayed
    And Cards are displayed

    #ReUsable
  Scenario: User page default Login
    Given User is on Netbanking landing page
    When User login into application with "user" and password "0987"
    Then Home page is displayed
    And Cards are displayed