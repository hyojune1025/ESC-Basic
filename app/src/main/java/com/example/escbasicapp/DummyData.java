package com.example.escbasicapp;

import java.util.ArrayList;

public class DummyData {

    public static ArrayList<Contact> contacts = new ArrayList<>();

    static {
        contacts.add(new Contact("곽용우", "010-3744-0844", "kkolbuyw@gmail.com"));
        contacts.add(new Contact("윤무원", "010-5510-3499", "sample@gmail.com"));
        contacts.add(new Contact("김효준", "010-9937-8130", "hj1025480@naver.com"));
    }
}
