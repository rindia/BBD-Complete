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

  @Negative-Login-Feature
  Scenario: Negative SignIn Functionality
    When I Open Website
    Then I click on SignIn Link for LoginPage
    And I Check Authentication Text is Display
    Then I Enter Blank UserName and Password
      | UserName | Password |
      |          |          |
    Then I click SignIn Button
    And I See An Email Address is Required Validation Error
    Then I Enter Right Username and Wrong Password
      | UserName                 | Password |
      | rohit.saini.uk@gmail.com | sainixxx |
    Then I click SignIn Button
    And I See Authentication failed Error Mesage
    Then I Enter Wrong Username and Right Password
      | UserName               | Password |
      | rohit.sainik@gmail.com | sainix   |
    Then I click SignIn Button





