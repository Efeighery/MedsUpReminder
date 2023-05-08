package com.example.medsupapp;

import static org.junit.Assert.*;

import org.checkerframework.checker.units.qual.C;
import org.junit.Test;

public class ContactDetailsTest {

    @Test
    public void saveContactNote() throws Exception{
        String conNoteTitle = "Contact note #636";
        String output;
        String conNoteContent = "Name: BlankSlate, Number: 0467462424, Email: blankityslate@email.co.uk";

        ContactDetails contactDet = new ContactDetails();
        output = contactDet.toString(conNoteTitle, conNoteContent);

        System.out.println(output);
    }

    @Test
    public void saveContactNote1() throws Exception{
        String conNoteTitle = "Contact note #08";
        String output;
        String conNoteContent = "Name: Con2, Number: 0299837434, Email: con2@email.com";

        ContactDetails contactDet = new ContactDetails();
        output = contactDet.toString(conNoteTitle, conNoteContent);

        System.out.println(output);
    }
}