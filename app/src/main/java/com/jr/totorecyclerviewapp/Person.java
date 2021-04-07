package com.jr.totorecyclerviewapp;

/**
 * Model object représentant une personne
 */
public class Person {

    /**
     * Avatar
     */
    public int mAvatar;

    /**
     * Nom de famille
     */
    public String mNom;

    /**
     * Prénom
     */
    public String mPrenom;

    /**
     * Contructor
     *
     * @param avatar de la personne
     * @param nom    de la personne
     * @param prenom de la personne
     */
    public Person(int avatar, String nom, String prenom) {
        mAvatar = avatar;
        mNom = nom;
        mPrenom = prenom;
    }

    public int getAvatar() {
        return mAvatar;
    }

    public String getNom() {
        return mNom;
    }

    public String getPrenom() {
        return mPrenom;
    }
}