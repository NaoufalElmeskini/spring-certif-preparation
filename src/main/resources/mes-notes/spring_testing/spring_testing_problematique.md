

## 1.problematique :

- JUnit, test unitaire :
    le test unitarie a pour but de tester un composant sans regarder ses
    interactions avec le reste du systeme.

- pourquoi utiliser spring dans nos tests unitaires ?
>spring testing repond à la problematique d'injection de dependance dans le
contexte de test.

-Comment je peux injecter automatiquement mon composant a tester ?
>voir use cases

- les extensions JUnit / spring permettent-elles de rajouter un traitement 
  sur la classe de test, ou la classe testée ?
> classe de test uniquement (set un logger, resolve parametres, )
 
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
