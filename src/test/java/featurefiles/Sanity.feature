Feature: DummyAPICollection

  Scenario Outline: Hit API and Get the response
    When I perform a GET request with query parameters "<url>"
  #Then I get responsecode as 200


    Examples:
      | url                   |
      | https://reqres.in/api |








