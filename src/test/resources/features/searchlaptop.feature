
Feature: Buscar en lineo una laptop
  Como usuario de linio
  quiero buscar una laptops en venta
  para encontrar una laptop que pueda comprar

  @Search_Laptop
  Scenario: Buscar las laptops y validad el resultado
    Given  que me encuentro en la aplicacion de linio
    When busco una laptop "<objeto>"
    Then deberia obtener mas de un resultado

    Example:
    |  objeto |
    |  laptop  |

