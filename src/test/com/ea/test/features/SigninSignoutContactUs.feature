Feature: Shopping cart Login  and contactUs Features


  Scenario: Positive Login Functionality
    Given I open Website
    Then I see Lo go on HomePage
    And I click on SignIn Link for Login
    Then I See Authentication Text On Login page
    And I Enter Username and password
      | UserName                 | Password |
      | rohit.saini.uk@gmail.com | sainix   |
    Then I click SignIn Button
    And I see UserName on HomePage

  Scenario: Negative SignIn Functionality
    Given I open Website
    Then I see Lo go on HomePage
    And I click on SignIn Link for Login
    Then I See Authentication Text On Login page
    And I Enter Username and password
      | UserName                 | Password |
      | rohit.saini.uk@gmail.com | sainixx  |
    Then I click SignIn Button




