package com.example.medsupapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class MedicDetailsTest {

    @Test
    public void saveMedicalNote() throws Exception{
        String medicNoteTitle = "Contact note #28";
        String output;
        String medicNoteContent = "Name: Diagnosis";

        MedicDetails medicDet = new MedicDetails();
        output = medicDet.toString(medicNoteTitle, medicNoteContent);

        System.out.println(output);
    }

    @Test
    public void saveMedicNote1() throws Exception{
        String medicNoteTitle = "Contact note #28";
        String output;
        String medicNoteContent = "Name: Diagnosis";

        MedicDetails medicDet = new MedicDetails();
        output = medicDet.toString(medicNoteTitle, medicNoteContent);

        System.out.println(output);
    }

    @Test
    public void saveMedicNote2() throws Exception{
        String medicNoteTitle = "Contact note #28";
        String output;
        String medicNoteContent = "Name: Diagnosis";

        MedicDetails medicDet = new MedicDetails();
        output = medicDet.toString(medicNoteTitle, medicNoteContent);

        System.out.println(output);
    }
}