#Senaryo:
#  Daha önceki Fee Functionality Senaryosunu
#  name, code, intCode ve priority için 5 farklı kombinasyon için çalıştırınız.

Feature: Fees multiple values functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Fee Functionality
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | integrationCode | <intCode>  |
      | priorityCode    | <priority> |

    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User delete the element from Dialog
      | <name> |

    Then Success message should be displayed

    Examples:
      | name    | code | intCode  | priority |
      | ism1Fee1 | 2222 | PayPal   | 1235     |
      | ism1Fee2 | 2223 | Cash     | 1236     |
      | ism1Fee3 | 2224 | Cheque   | 1237     |
      | ism1Fee4 | 2225 | ApplaPay | 1238     |
      | ism1Fee5 | 2226 | Crypto   | 1239     |