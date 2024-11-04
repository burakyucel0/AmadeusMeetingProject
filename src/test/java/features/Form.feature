Feature: Form page
  Background:
    Given I go to homepage Url

    Scenario: Fill the Form
      When I clicked form button
      And I clicked practice form button
      And I enter name and password
      And I enter email
      And I select male gender
      And I enter mobile phone
      And I clicked date of birth
      And I select year
      And I select month
      And I select day
      And I enter subject

