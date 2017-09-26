Feature: Shopping cart Login

  @Positive-Login-Feature
  Scenario: Positive Login Functionality
    When I Open Website
    Then I  Check PageTitle as My Store
    And I See HomePage Logo
    And I See SignIn Link
    Then I click on SignIn Link for LoginPage
    And I Check LoginPage Title
    And I Check Authentication Text is Display
    Then I Enter Correct UserName and Password
      | UserName                 | Password |
      | rohit.saini.uk@gmail.com | sainix   |
    And  I click SignIn Button
    Then I see UserName on HomePage
    When I Click on SignOut Link
    And  I See SignIn Link





