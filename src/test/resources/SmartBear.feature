Feature:  There will be SmartBear Website Scenarios


  @TC_1
  Scenario: Verify that delete all orders
    Given The user wants to login with username as Tester and password as test
    When The user wants to check all orders
    Then The user wants to delete all selected orders
    And The user wants to logout




    @TC_2
    Scenario: Verify that delete all orders
      Given The user wants to login with username as "Tester" and password as "test"
      When The user wants to check all orders
      Then The user wants to delete all selected orders
      And The user wants to logout


      @TC_3
      Scenario: Verify that we can edit first order
        Given The user wants to login with username as "Tester" and password as "test"
        When The user wants edit first order
        Then The user wants to update Card number as "325689453"
        And The user wants to update order
        And The user wants to logout
