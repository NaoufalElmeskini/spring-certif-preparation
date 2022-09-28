# 5- Inside the Spring Container

Plan :
    The Spring Bean Lifecycle
    The BeanFactoryPostProcessor interception point
    The BeanPostProcessor interception point
    Spring Bean Proxies
    @Bean method return types

objectif :
- expliquer le lifecycle de beans
- utilisation de beanFactoryPostProcessor et beanPostProcessor
- comment les proxies Spring ajoute du comportement au Runtime
- comment spring determine l'ordre de creation de beans
- problemes d'injection de bean par type  


***

## 1. The Spring Bean Lifecycle

beans have 3 phases :
1. init
2. usage
3. destruction


Init :
    A. load & process
    B. create & initialise

A. load and process :
  - @configuration classes are processed + @components scanned
  - beans ajoutees à un BeanFactory
    - indexés par id+nom
  - les BeanFactoryPostProcessors invoqués
    - peut aussi modifier definition des beans (?)

- expliquer : BeanFactory, BeanFactoryPostProcessor, BeanPostProcessor ?
- ApplicationContext est une BeanFactory
- 
### BeanFactoryPostProcessor
- internal extension point
- spring dispose de plusieur post-processeurs :
  - 
  - un postProcesseurs doit : implements BeanFactoryPostProcessor
  - exemples : DeprecatedBeanWarner (alerte sur les composants deprecated), ConfigurationClassPostProcessor...
    - PropertySourcesPlaceholderConfigurer : initialise les @Value variables depuis les property sources 
  - 

    BeanPostProcessor 
- "A bean post-processor typically checks for callback interfaces, or it may wrap a bean with a proxy."
- "Some Spring AOP infrastructure classes are implemented as bean post-processors in order to provide proxy-wrapping logic."


***
## 2. The BeanFactoryPostProcessor interception point
## 3. The BeanPostProcessor interception point
## 4. Spring Bean Proxies
## 5. @Bean method return types
