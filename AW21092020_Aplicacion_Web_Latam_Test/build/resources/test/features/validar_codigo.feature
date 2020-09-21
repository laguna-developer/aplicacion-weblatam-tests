#language: en
Feature: Validar codigo
  Yo como usuario del portal web latam
  Nacesito ingresar a dicho portal
  Para Validar como esta compuesto el codigo de Reserva

  Scenario: validar codigo reserva
    Given Nicolas Alvarino se encuentra en el home del sitio web
    When el busca el codigo
    Then el visualizara el codigo de ejemplo