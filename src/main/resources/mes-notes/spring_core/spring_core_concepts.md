
Bean customisation :
    solution 1 :on peut implementer DisposableBean ou InitialisingBean
        interface DisposableBean{void destroy()} 
        interface InitialisingBean {void afterPropertiesSet()}
    solution 2 : dans @Component, annoter des methodes avec :
        @PreDestroy maDestroy()
         ou @PostConstruct  
    solution 3 : dans la @Configuration 
        @Bean(destroyMethod = "maDestroy")
***********************
bean naming, strategies :
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
