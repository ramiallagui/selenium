@tag
Feature: Authenti

  @tag2
  Scenario Outline: authentification cas non  passant
    Given ovrir navigateuuur
    And ovrir urllll "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When saisir  usernaimmmm "<user>"
    And saisir mdpppp "<mot>"
    And cliquer sur bouton loguiiii
    Then virifier le message d erreur "<meesage>"

    Examples: 
      | user           | mot    | meesage             |
      | userrshif      | dfhes  | Invalid credentials |
      | administrateur | fdsfhu | Invalid credentials |
      |        1234568 | mariem | Invalid credentials |
