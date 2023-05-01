# Architecture-logicielle-Atelier1
Version dynamique du site d'échange de carte, avec un projet Maven Springboost, inspiré de la step 0 et de la step 1.

## Liste des fonctionnalités
* L'accès à localhost:8080 envoie directement à la page principal, qui affiche toutes les cartes
* La barre de recherche permet d'accéder à une carte en tapant son nom, et dirige sur une page dédiée (vérification en tapant "SuperMan")
* Le modèle est mit en place : une classe Card simule une carte et ses attributs, une classe CardDTO permet de convertir des données (de formulaires) en objet Card, et une classe CardDAO agit comme une base de données d'objets Card (pour l'instant, elle ne dure que le temps de vie du server)
* La base de donnée de cartes ne contient que trois cartes de base
* Dans le header, on peut ajouter une carte (bouton Add Card) en remplissant un formulaire. Une fois ajoutée, elle apparaîtra dans le home, et on pourra la chercher avec la barre de recherche
* Dans le header, le bouton "Home" ramène a la page qui affiche toutes les cartes. De même pour "Friends".
* Utilisation de ThymeLeaf pour les templates
