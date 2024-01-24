package com.example.appquiz;

import java.util.ArrayList;
import java.util.List;

public class QuestionModel {

    private String question;
    private String reponse1;
    private String reponse2;
    private String reponse3;
    private String reponse4;
    private int reponseCorrecte;

    public QuestionModel(String question, String reponse1, String reponse2, String reponse3, String reponse4, int reponseCorrecte) {

        this.question = question;
        this.reponse1 = reponse1;
        this.reponse2 = reponse2;
        this.reponse3 = reponse3;
        this.reponse4 = reponse4;
        this.reponseCorrecte = reponseCorrecte;
    }

    public String getQuestion() {
        return question;
    }

    public String getReponse1() {
        return reponse1;
    }

    public String getReponse2() {
        return reponse2;
    }

    public String getReponse3() {
        return reponse3;
    }

    public String getReponse4() {
        return reponse4;
    }

    public int getReponseCorrecte() {
        return reponseCorrecte;
    }

    public static List<QuestionModel> showAllQuestion()
    {
        List<QuestionModel> QuestionsList = new ArrayList<>();

        QuestionsList.add(new QuestionModel("Quelle est la différence entre un langage interprété et un langage compilé ?", "La couleur des mots-clés", "Le coût de développement", "L'exécution du code", "Le nombre de lignes de code", 3));
        QuestionsList.add(new QuestionModel("Qu'est-ce qu'une boucle en programmation ?", "Un type de condition", "Une structure de contrôle répétitive", "Un moyen de déclarer des variables", "Un concept mathématique", 2));
        QuestionsList.add(new QuestionModel("Que signifie l'acronyme 'HTML' en informatique ?", "HyperText Markup Language", "High-Level Text Management Library", "Human-Tested Machine Learning", "Hyperlink and Text Management Language", 1));
        QuestionsList.add(new QuestionModel("Quelle est la fonction principale d'une clé primaire dans une base de données ?", "Autoriser l'accès aux données", "Assurer l'unicité des enregistrements", "Faciliter la navigation dans la base de données", "Contrôler l'accès des utilisateurs", 2));
        QuestionsList.add(new QuestionModel("Qu'est-ce qu'un algorithme ?", "Un bug dans le code", "Une série d'instructions pour résoudre un problème", "Un langage de programmation populaire", "Une erreur de compilation", 2));
        QuestionsList.add(new QuestionModel("Qu'est-ce qu'une variable en programmation ?", "Une constante immuable", "Une valeur fixe", "Un espace de stockage pour des données", "Un opérateur mathématique", 3));
        QuestionsList.add(new QuestionModel("Qu'est-ce que le 'version control' (contrôle de version) en développement logiciel ?", "La gestion des versions de produits physiques", "Le suivi des modifications apportées au code source", "La révision des manuels utilisateur", "La classification des erreurs de programmation", 2));
        QuestionsList.add(new QuestionModel("Quelle est la différence entre une classe et un objet en programmation orientée objet ?", "Une classe est une instance d'un objet", "Une classe est une collection d'objets", "Un objet est une instance d'une classe", "Un objet est une collection d'instances", 3));
        QuestionsList.add(new QuestionModel("Qu'est-ce qu'une API (Interface de Programmation d'Applications) ?", "Une Application Internet Publique", "Une Approche de Programmation Intégrée", "Un ensemble de règles grammaticales pour le code", "Un ensemble de fonctions pour interagir avec un logiciel ou service", 4));
        QuestionsList.add(new QuestionModel("Que signifie le terme 'bug' en programmation ?", "Un insecte nuisible", "Une erreur dans le code", "Un composant matériel défectueux", "Une nouvelle fonctionnalité", 2));
        QuestionsList.add(new QuestionModel("Que signifie le terme 'bug' en programmation ?", "Un insecte nuisible", "Une erreur dans le code", "Un composant matériel défectueux", "Une nouvelle fonctionnalité", 2));
        QuestionsList.add(new QuestionModel("Quelle est la différence entre '== 'et '===' en JavaScript ?", "Aucune différence", "Comparaison de valeurs avec conversion de type", "Comparaison de valeurs sans conversion de type", "Assignation de valeurs", 3));
        QuestionsList.add(new QuestionModel("Qu'est-ce que le 'pair programming' en développement logiciel ?", "La programmation de deux programmes en même temps", "La programmation en binôme avec deux développeurs", "La création de programmes en utilisant des paires de chiffres", "La duplication de code source", 2));
        QuestionsList.add(new QuestionModel("Que signifie l'acronyme 'SQL' en informatique ?", "Structured Query Language", "Simple Query Language", "Software Quality Level", "System Query Logic", 1));
        QuestionsList.add(new QuestionModel("Qu'est-ce qu'un algorithme de tri ?", "Une méthode pour organiser des fichiers sur un disque dur", "Un processus pour classer des données de manière ordonnée", "Un outil pour supprimer les bogues du code", "Une fonction de sécurité pour les données", 2));
        QuestionsList.add(new QuestionModel("Qu'est-ce qu'un 'framework' en développement logiciel ?", "Un ensemble d'outils pour construire des maisons", "Une structure en acier pour supporter le code", "Un ensemble de bibliothèques et de conventions pour faciliter le développement", "Un moyen de tester des logiciels", 3));
        QuestionsList.add(new QuestionModel("Qu'est-ce que le modèle MVC (Modèle-Vue-Contrôleur) ?", "Un modèle mathématique complexe", "Une architecture de conception pour les applications web", "Un langage de programmation moderne", "Un modèle de voiture très convoité", 2));
        QuestionsList.add(new QuestionModel("Qu'est-ce qu'un 'bug tracker' ?", "Un insecte géant dans le code", "Un outil pour enregistrer et suivre les bogues dans le développement logiciel", "Un logiciel pour suivre la migration des papillons", "Une méthode pour repérer les erreurs dans le code", 2));
        QuestionsList.add(new QuestionModel("Qu'est-ce qu'un 'bytecode' en Java ?", "Un type de café fort", "Un code source illisible", "Un code intermédiaire interprété par la machine virtuelle Java", "Un format de fichier compressé", 3));
        QuestionsList.add(new QuestionModel("Qu'est-ce que l'agilité ('Agile') en développement logiciel ?", "La capacité à courir rapidement", "Une approche itérative et collaborative du développement", "La rigidité dans la planification de projet", "Un langage de programmation spécialisé", 2));

        return  QuestionsList;
    }

}
