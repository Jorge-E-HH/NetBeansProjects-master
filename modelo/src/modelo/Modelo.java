package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Agenda {

    private ArrayList<Contacto> contactos;
    private ContactoLaboral contLaboral;
    private ContactoPersonal contPersonal;

    public Agenda() {
        contactos = new ArrayList<Contacto>();


    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }