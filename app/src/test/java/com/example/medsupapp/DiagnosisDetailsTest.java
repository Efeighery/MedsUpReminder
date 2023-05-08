package com.example.medsupapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiagnosisDetailsTest {

    @Test
    public void saveDiagnosisNote() {
        String diagNoteTitle = "Contact note #28";
        String output;
        String diagNoteContent = "Name: Diagnosis";

        DiagnosisDetails diagDet = new DiagnosisDetails();
        output = diagDet.toString(diagNoteTitle, diagNoteContent);

        System.out.println(output);
    }
}