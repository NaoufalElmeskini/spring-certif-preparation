


**************
@REstController VS @Controller ?

traditionnellement, en archi MVC, un controller java prepare le model et 
view correspondant à une requete.
cela se fait à travers un objet ModelAndView qui reference un Model et un View.
ce resultat est ensuite passé par le #DispatcherServlet à un #ViewResolver.
Un @RestController, moderne, ne passe pas à #ViewResolver et renvoit une 
reponse http directement. 
=>
une methode de @Controller : renvoit un ModelAndView
une methode de @RestController : renvoit une #ressource (Json, xml... basé sur ResponseBody)

***
Model :

un objet representant une map de type key:value
:: model(name: "adrien", age: "15"...)
***
View :

le nom d'un fichier representant la vue (typiquement .jsp).
les fichiers de Vue se base sur un template, contenant du texte statique 
mais aussi des valeurs dynamiques.
les valeurs dynamique sont initilisé par un moteur de template (::TymeLeaf ...).
ce moteur remplace ces valeurs par leur correpondance dans le #Model


**************
front controller pattern :
https://www.baeldung.com/spring-controllers#Overview
***
Dispatcher servlet #DispatcherServlet :

**************
Request Mapping (@RequestMapping):
**************
Model attribute (@ModelAttribute) :


**************
**************
**************
**************
