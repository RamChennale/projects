@reg

  Feature: PartySearch_Test
    Scenario: test party search details
      Given  get request body for "TestCase_001" from service file "party/partySearch.json"
      And call partySearch API endpoint
      Then response code 200 should be received for "upstream"