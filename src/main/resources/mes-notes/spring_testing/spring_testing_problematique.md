

## 1.problematique :
    spring boot testing repond à la problematique d'injection de dependance dans
     le contexte de test.
    
 
## 2. use cases :
    
UC1 : comment avoir un autowiring minimal avec Spring ? 
    existant : CalculService, avec une methode calculerAddition(a,b) 
    je veux:  tester cette class, sans l'instancier manuellement dans CalculServiceTest.
    
    ->    
      solution 1 :
            annoter @SpringJUnitConfig sur la class de test (sans specifier
            de classe de conf)
            declarer une inner class de configuration*
                ! ne doit pas etre private
                ! doit etre static
            + @autowire CalculService calculService;
      solution 2 :
            sur la classe de test :
                annoter @ExtendWith(SpringExtension
            .class) + @ContexteConfiguration(classes=MyTestConf.class)
