a quoi sert Autowired ?

> complete moi...
> 
> 
application : MonService{concat()} qui depend de MonRepo

l'injection de MonRepo dans MonService se fait :
    1. en declarant dans la classe de configuration
```
@configuration MaConfig {
    @Bean MonService monService(MonRepo repo);
    @Bean MonRepo monRepo();
    
}
```
