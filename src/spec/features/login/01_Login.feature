#language: fr
@subscription @smoketest @tnr
Fonctionnalité: Login
  ETQ utilisateur je souhaite me connecter sur l'application EasyGes

  @subscription
  Scénario: Je souhaite me connecter avec des données valides
    Etant donné que Je suis sur la page de connexion de l'application EasyGes
    Quand Je saisis un username 'Admin'
    Et Je saisis un mot de passe "admin123"
    Et Je clique sur le bouton Log in
    Alors Je suis redirigé vers la page d'accueil avec l'adresse

