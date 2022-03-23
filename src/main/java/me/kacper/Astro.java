package me.kacper;

import me.kacper.menu.impl.MenuHandler;

public class Astro {

    private final static MenuHandler menuHandler = new MenuHandler("Astro", 500, 500);

    public static void main(String[] args) {

        menuHandler.init();
    }
}
