# Revue de code de la Team Rocket

## Utilisation d'un objet Map inutile
Pourquoi ne pas simplement utiliser le metadata provider? Cela permettrait en plus d'éviter une redondance des données, de supprimer la dépendance apache.commons qui apporte des vulnérabilités.

## Création de pokémons inexistants
Si l'index n'est pas présent dans la map, pourquoi ne créer un missingNo en conservant l'index donné en argument? Là encore, pourquoi ne pas utiliser le metadata provider pour profiter des PokedexExceptions?

## Génération aléatoire de stats non fonctionnelle
En ajoutant toujours 0 ou 1 sur 1 million d'itérations, le résultat sera toujours aux alentours de 500000 et donc, un fois divisé par 10000, il sera toujours autour de 50. De plus, elle ne prend jamais compte du pokémon, difficile de croire qu'un Mewtwo aura les mêmes stats qu'un Ratata.

## Génération aléatoire de stats lourde
A chaque itération, un nouvel objet Random est créé, ce qui rend la génération très lourde à calculer

<p align="center" style="color: #ffcb05; font-size: 2rem;">
Félicitation vous avez gagné le badge suivant :
</p>
<p align="center">
    <img
        alt="Il faut vraiment retourner à l'école"
        src="TPs/images/Back-to-School-Meme.jpg"
        title="Back to school !"
    />
</p>
<p align="center" style="color: #ffcb05; font-size: 2rem;">
Back to school !
</p>