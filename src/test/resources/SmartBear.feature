Feature:  There will be SmartBear Website Scenarios
#
#  ┌────────────┐                 ┌──────────────┐
#  │   Steps    │                 │     Step     │                 │           │
#  │ in Gherkin ├──matched with──>│ Definitions  ├
#  │            │                 │              │                 │           │
#  └────────────┘                 └──────────────┘                 └───────────┘
#
#

  Background:
#    Given The user wants to login with username as "Tester" and password as "test"



  @Regression @TC_1  @Smoke
  Scenario: Verify that delete all orders
    Given The user wants to login with username as Tester and password as test
    When The user wants to check all orders
    Then The user wants to delete all selected orders
    And The user wants to logout




  @Regression @TC_2  @Smoke
  Scenario: Verify that delete all orders
    Given The user wants to login with username as "Tester" and password as "test"
    When The user wants to check all orders
    Then The user wants to delete all selected orders
    And The user wants to logout


  @Regression   @TC_3
  Scenario: Verify that we can edit first order
#    Given The user wants to login with username as "Tester" and password as "test"
    When The user wants edit first order
    Then The user wants to update Card number as "325689453"
    And The user wants to update order
    And The user wants to logout

    @TC_4
    Scenario: Verify that the total is correct for FamilyAlbum
      When The user wants to order
      Then The user wants to product as "FamilyAlbum"
      Then The user wants to buy "10"
      And The user wants to calculate total
      And The user wants to verify total 10 and "FamilyAlbum"

      @TC_5
      Scenario: Verify that the total is correct for FamilyAlbum
        When The user wants to order
        Then The user wants to enter
         |product |FamilyAlbum|
         |quantity| 30        |
         |Price   | 50        |
         |Name    | Erkan     |
        And The user wants to calculate total


        @TC_6
        Scenario: Verify that the total is correct for FamilyAlbum
          When The user wants to order
          Then The user wants to enter
            |product |FamilyAlbum|
            |quantity| 30        |
            |Price   | 50        |
            |Name    | Erkan     |
          Then The user wants to enter address information as
            |CustomerName| Erez       |
            |Street      |1234 Fake St|
            |City        | Baltimore  |
            |State       | Virginia   |
            |ZipCode     | 123456     |







           # Write the last step fpr Payment option in a data table
           # add the last scenario

  @TC_7
  Scenario: Verify that the total is correct for FamilyAlbum
    When The user wants to order
    Then The user wants to enter
      |product |FamilyAlbum|
      |quantity| 30        |
      |Price   | 50        |
      |Name    | Erkan     |
    Then The user wants to enter address information as
      |CustomerName| Erez       |
      |Street      |1234 Fake St|
      |City        | Baltimore  |
      |State       | Virginia   |
      |ZipCode     | 123456     |
    Then The user wants to enter payment information
      |Card      | visa          |
      |CardNumber| 12345678965466|
      |ExpireDate| 12/27         |
    And The user wants finish the process
    And The user wants to logout



  @TC_8
  Scenario: Verify that the total is correct for FamilyAlbum
     Given The user wants to login with username as "Tester" and password as "test"
     When The user wants to order
     Then The user wants to enter list
     |product    |quantity   |Price     |Name    |   #0
     |FamilyAlbum| 30        |50        |Erkan   |   #1
     |FamilyAlbum| 30        |50        |Erkan   |   #2
     |FamilyAlbum| 30        |50        |Erkan   |   #3
     |FamilyAlbum| 30        |50        |Erkan   |   #4
     And The user wants to calculate total


       #Username erk@gmail.com
       #Password erk@gmail.com
    Scenario: Create new address
      Given The user wants to login
      Then The user wants to see addresses
      And The user wants to enter new address

      # try for 10 min















