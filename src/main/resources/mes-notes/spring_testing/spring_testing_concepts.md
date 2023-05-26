

concept :
- (JUnit) Extension (@ExtendWith, SpringExtension...)
- (spring) TestContext
  annotations :
  junit :
  (JU) @ExtendWith
  (SP) @ContexteConfiguration
  (SP) @SpringJUnitConfig
  (= extendWith + contexteConfiguration)

/**********************************/
/**********************************/
Junit extension :
  Junit offre la possibilite d'ajouter des traitement dans la Test class.
  - execution conditionnelle de test : executer uniquement si une propriete 
    est set (env="QA")
  - initialiser le logger de la classe :  appeler un setter avec un default 
    logger (#post_processing ) 
  - ...

