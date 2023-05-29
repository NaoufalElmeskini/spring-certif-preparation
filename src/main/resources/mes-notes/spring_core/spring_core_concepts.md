
***********************
## Bean processing, customisation strategies :
***
- strategie 1 :on peut implementer DisposableBean ou InitialisingBean
        interface DisposableBean{void destroy()} 
        interface InitialisingBean {void afterPropertiesSet()}
- solution 2 : dans @Component, annoter des methodes avec :
        @PreDestroy maDestroy()
         ou @PostConstruct  
- strategie 3 : dans la @Configuration 
        @Bean(destroyMethod = "maDestroy")
***********************
## bean naming, strategies :
***
default strategy : le bean a le nom de sa classe (camelCase)
@Service MonService --> bean avec nom "monService"

***
strategy 1 : nom de methode @Bean
:: @Bean MonService monServ() --> bean nom = monServ
***
strategy 2 : specifier nom dans la valeur de l'annotation
- @Service("monService")
- @Bean("monService")
- ...
***
strategy 3 : @Qualifier
- @Service @Qualifier("monAService")

(!) très interessant car plusieurs Bean du meme type peuvent être utilisées en meme temps
si declarées avec des noms differents.
***
? un bean a :
- id
- nom



************************************
## Autowired
***

a quoi sert @Autowired ?

> a marquer une variable comme étant disponible dans le contexte Spring.

> conditions :
> - la variable est déclaré comme Bean Spring (1. par @component annotation... 2. java @configuration)
*************************************
- pourquoi autowired marche dans une classe de test ?

> il ne marche que que si la test-class annoté a un ContexteConfiguration
(souvent avec @ExtendWith(SpringExtension.class)).
> ainsi, la test-class est aware du contexte spring, et donc des beans qui y sont déclarés.
