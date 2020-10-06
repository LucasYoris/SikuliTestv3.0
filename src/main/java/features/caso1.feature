Feature:Realizar apertura, escritura y guardado de archivo

  Scenario: Abrir documento y escribirlo 1
    Given El usuario abre el archivo de texto
    And El usuario escribe en el archivo de texto Escenario 1
    When El usuario cierra el documento
    Then Se deben guardar los cambios

  Scenario: Abrir documento y escribirlo 2
    Given El usuario abre el archivo de texto
    And El usuario escribe en el archivo de texto Escenario 2
    When El usuario cierra el documento
    Then Se deben guardar los cambios