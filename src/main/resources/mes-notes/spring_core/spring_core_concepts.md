
Bean customisation :
    solution 1 :on peut implementer DisposableBean ou InitialisingBean
        interface DisposableBean{void destroy()} 
        interface InitialisingBean {void afterPropertiesSet()}
    solution 2 : dans @Component, annoter des methodes avec :
        @PreDestroy maDestroy()
         ou @PostConstruct  
    solution 3 : dans la @Configuration 
        @Bean(destroyMethod = "maDestroy")
