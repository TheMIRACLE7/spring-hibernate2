package ru.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class TextEditor {
    @Resource
    private SpellChecker spellChecker;
    @Autowired(required=false)
    private String name;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void spellCheck() {
        System.out.println(name);
        spellChecker.checkSpelling();
    }
}