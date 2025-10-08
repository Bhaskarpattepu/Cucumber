Feature: Application Login

  Background:
  When launch the browser from config variables
    And hit the home page url of banking site

@NetBanking
  Scenario: Admin page default login
    Given User is on Netbanking landing page
    #Given Setup the entires in database
    #And launch the browser from config variables
    #And hit the home page url of banking site
    #Passing credentials from Step
    When User login into application with "admin" and password "1234"
    Then Home page is displayed
    And Cards are displayed

    #ReUsable
  @Mortgage
  Scenario: User page default Login
    Given User is on Mortgage landing page
    When User login into application with "user" and password "0987"
    Then Home page is displayed
    And Cards are displayed

    @Regression
  Scenario Outline: User page default login
    Given User is on Netbanking landing page
    When User login into application with "<Username>" and passwords "<Password>" combination
    Then Home page is displayed
    And Cards are displayed

    Examples:
    | Username       | Password |
    | debituser      | hello12  |
    | credituser     | lpo123   |



      Scenario: User Page default Sign up
        Given User is on Practice landing page
        When User Signup into application
        | rahul  |
        | shetty |
        |contact@email.com|
        |1234567890       |
        Then Home page is displayed
        And Cards are displayed



        



