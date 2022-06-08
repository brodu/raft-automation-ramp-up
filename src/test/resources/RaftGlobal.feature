@withdrawal
  Feature: raftds.com landing automation

    Scenario: Clicking on header links navigates to corresponding page block
      Given User opens "http://raftds.com/" page in browser
      When User clicks "Expertise" element
      Then "Expertise" block is visible on the page