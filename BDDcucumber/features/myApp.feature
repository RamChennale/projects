Feature: Test cucumber

  Scenario: Test cucumber
    Given open chrome and start appl
    When I click on link
    Then The clicked link should be open

  Scenario: Verify all the links
    Given open chrome browser and launch application
    When click on all links over homepage
    Then all clicks verified

  Scenario: Enter data and clear the data
    Given open chrome browser and launch application
    When enter field data
    Then rest/clear all data fields data

  Scenario Outline: Login test with multiple set of data
    Given user name <username>
    And password as <password>
    When user enter valid user creadential
    And username is not case sensative
    But password is case sensative
    Then user should be able to log successfully

    Examples: get the following user credentials
      | username | password |
      | ram      | ram@123  |
      | mahesh   | mah@123  |
