Feature: Create Booking

  Scenario: Create booking with valid data
    Given Create request using payload
    When Add resource and hit Post method
    Then Verify booking id is created
