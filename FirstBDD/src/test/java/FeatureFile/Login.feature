Feature: Application Login

#For web browser only
  #Background:
    #Given validate the browser
    #When Browser is triggered
    #Then Check if browser is started

  #@RegTest @SmockTest
  @WebTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "jin" and password "1234"
    Then Home page is populated
    And Cards displayed "true"
    #And Cards are displayed

  @RegTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "john" and password "1234"
    Then Home page is populated
    And Cards displayed "false"
    #And Cards are not displayed

  #@SanityTest
  @WebTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User signUp with following details
    | harish | ha123 | harish@gmail.com | Indian | 1234567 |
    Then Home page is populated
    And Cards displayed "false"
#It called datatable for multiple values
#| harish | ha123 | harish@gmail.com | Indian | 1234567 |

  @MobileTest
  Scenario Outline: Home page default login
    Given User is on NetBanking landing page
    When User login into application with username <Username> and password <password>
    Then Home page is populated
    And Cards displayed "false"

    #Parameterization outline
    Examples:
      |Username | password|
      |user1    |pass1    |
      |user2    |pass2    |
      |user3    |pass3    |
