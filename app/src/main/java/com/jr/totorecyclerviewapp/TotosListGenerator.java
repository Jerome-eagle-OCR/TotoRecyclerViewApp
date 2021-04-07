package com.jr.totorecyclerviewapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class TotosListGenerator {
    public static List<Person> totosList = Arrays.asList(
            new Person(R.drawable.toto1, "Toto1", "Totoprenom1"),
            new Person(R.drawable.toto2, "Toto2", "Totoprenom2"),
            new Person(R.drawable.toto3, "Toto3", "Totoprenom3"),
            new Person(R.drawable.toto4, "Toto4", "Totoprenom4"),
            new Person(R.drawable.toto5, "Toto5", "Totoprenom5"),
            new Person(R.drawable.toto6, "Toto6", "Totoprenom6"),
            new Person(R.drawable.toto7, "Toto7", "Totoprenom7"),
            new Person(R.drawable.toto8, "Toto8", "Totoprenom8"),
            new Person(R.drawable.toto9, "Toto9", "Totoprenom9"),
            new Person(R.drawable.toto1, "Toto10", "Totoprenom10"),
            new Person(R.drawable.toto2, "Toto11", "Totoprenom11"),
            new Person(R.drawable.toto3, "Toto12", "Totoprenom12"),
            new Person(R.drawable.toto4, "Toto13", "Totoprenom13"),
            new Person(R.drawable.toto5, "Toto14", "Totoprenom14"),
            new Person(R.drawable.toto6, "Toto15", "Totoprenom15"),
            new Person(R.drawable.toto7, "Toto16", "Totoprenom16"),
            new Person(R.drawable.toto8, "Toto17", "Totoprenom17"),
            new Person(R.drawable.toto9, "Toto18", "Totoprenom18"));

    static List<Person> generateTotosList() {
        return new ArrayList<>(totosList);
    }
}
