
ACID :
    une transaction met en jeu plusieurs operation elementaire de lecture et ecriture
    atomique :
        tout ou rien
    ...
    isolation :
        les transactions doit controler la visibilite des resources qu'elle contient en cours de son execution.
        (voir concept : dirty reads)

    durable :
        persitance, meme en cas de panne

*********************************************


connection (DataSource) :
        par defaut, chaque operation de JdbcTemplate utilise une Connection separe
            jdbcTemplate.findByUserID().................nouvelle connexion
            jdbcTemplate.findAccount()................nouvelle connexion

***
readOnly :
    @Transactional(readOnly=...) très important pour la performance...
    par defaut, les operation de jdbcTemplate necessite chacune une Nouvelle Connection ...
    => si plusieurs lectures dans ma methode :: alors plusieurs connections oouvertes
    => si readOnly :: 1 seule connection ouverte

*********************************************
Transaction local/globale :
    local = 1 seule source de donnée (::> DAtabase)
    global (distribue) = plusieurs seule source de données (::> 1 DB oracle + 1 DB SQL + 1 MessageQueue...)

***
problematique transaction global :

    en cas de transaction global et de * sources de données,
     => necessaire d'ouvrir/fermer/gerer/traiter la connexion et transaction pour chacun des sources
        messagequeue : connection.getSession
        jdbc : connection.getConnection()
        jpa : entityManager.getTransaction()

    -> solution possible : JTA (Java Transaction API)
        probleme : pas très bien car necessite Serveur d'application Lourd
            et surtout : c'est different de Spring qui est genial (lol)

********************************************

Propagation :
    la methode m1 appelle m2
    m1 : @Transactional AccountService.updateAccount()
    m2 : @Transactional BankClientService.getClientDetails()

    question :
        m2 doit-elle creer une nouvelle transaction ? (en suspendant la transaction en cours de m1)
        ou la transaction mère devrait-elle etre etendu (propagée) à m2 ?


    @Transactional(propagation=propagaton.Required) : l'operation doit etre faite dans une transaction
        - si existe : rejoindre la transaction
        - sinon : creer une nouvelle transaction
    @Transactional(propagation=propagaton.Requires_new) : cree necessairement une nouvelle transaction

***
- possible values :
        MANDATORY       Support a current transaction, throw an exception if none exists.
        NESTED          Execute within a nested transaction if a current transaction exists, behave like REQUIRED otherwise.
        NEVER           Execute non-transactionally, throw an exception if a transaction exists.
        NOT_SUPPORTED   Execute non-transactionally, suspend the current transaction if one exists.
(default) REQUIRED      Support a current transaction, create a new one if none exists.
        REQUIRES_NEW    Create a new transaction, and suspend the current transaction if one exists.
        SUPPORTS        Support a current transaction, execute non-transactionally if none exists.
- default : PROPAGATION_REQUIRED

(?? PROPAGATION_REQUIRED vs required )
******************

transaction anomalies, read phenomena :
    - dirty read
    - non repeatable read
    - phantom read

***
(personal note)
read phenomena dirtiness (high..low):
- dirty
- non_repeatable
- phantom

***
spring, levels of isolation (high..low):

- serializable  (phantom: no, non_repeatable: no, dirty: no)
- repeatable    (phantom: yes, non_repeatable:no , dirty: no)
- commited      (phantom: yes, non_repeatable: yes, dirty: no)
- uncommited    (phantom: yes, non_repeatable: yes, dirty: yes)
- default       (inferré par le default du GDBC)
(par defaut, Spring  = DEFAULT)

**************************************
utilisation dans spring :
    3 etapes :
        - declarer un bean @PlateformTransactionManager
        - @EnableTransactionManagement (sur la class de @conf)
        - marquer les methode @Transactionnal

    interface @PlateformTransactionManager :
        implementations disponibles :
            JMSTransactionManager
            JpaTransactionManager
            JtaTransactionManager
            DataSourceTransactionManager
            ...


**************************************
rollback :
    @Transactional(rollbackFor=MyCheckedException, norollbackFor=OtherException)

    par defaut, triggered seulement en cas de RuntimeException

***
Transaction en Test :

    @Transaction @Test
    monTest()
    => les changement dans monTest() seront rollback apres execution de methode
****************************************
