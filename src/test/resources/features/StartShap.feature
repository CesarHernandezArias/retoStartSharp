#Autor: Cesar

#language: es
@stories
  Característica: El usuario debe crear una reunion
    Para crear la reunión debe antes haber creado la unidad

    Antecedentes:
      Dado El usuario debe autenticarse en StartSharp
      |username|password|
      |admin   |serenity|
    Escenario: Creacion de la unidad
      Cuando se crea la unidad de negocios
        |nameUnit|
        |Unidad de Negocio CH|
      Entonces se verifica que la unidad se cree con exito
        |nameUnit|
        |Unidad de Negocio CH|
    Escenario: Creacion de la reunion de negocios
      Cuando se programa la reunion de negocios
        |nameMeet|nameUnit|
        |Reunion de Negocio|Unidad de Negocio CH|
      Entonces se verifica la creacion de la reunion
        |nameMeet|
        |Reunion de Negocio|