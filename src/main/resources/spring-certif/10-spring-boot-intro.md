# 10- Spring Boot intro

Plan :
    what is spring boot
    features
        dependancy management
        auto-config
        packaging and runtime
        integration testing


## 1. c'est quoi spring boot ?

Spring boot : prend une vue "opiniated" de spring et de librairies tierses
    => fait bcp de traitement sous-le capot pout
- offre un comportement par defaut
- offre aussi possibilité de changer ce comportement si necessaire

## 2. dependancy management

- probleme : dependances (ex:maven) de projet peut poser des problemes de divergence, jars incompatibles lors de passage de version etc 
- solution :
  - sprint boot parent / starters
  - ensemble de dependances versionnées comme package
  - si besoin de changer : 
    + exclude dependency
    + find correct version from starters (?) 
## 3. auto-config
## 4. packaging and runtime
## 5. integration testing
