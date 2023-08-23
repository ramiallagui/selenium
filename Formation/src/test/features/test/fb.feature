
@tag
Feature: authentificaton valide fb
  @tag1
  Scenario: authentificaton valide fb
    Given ovrir navigateurr
    And vrir urll
    When cliqure sur creer nvo compte
    And prenom "rami"
    And nom "allagi"
    And e-mail "rami.allagui@gmail.fr"
    And comf e-mail
    And md "rami1234"
    And jj "18"
    And mm "12"
    And aa "1994"
    And genre
    And clique sur s'inscrire  
    Then affche test ok 
  

