

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by RdDvls on 8/24/16.
 */
public class Hospital {
    Scanner inputScanner = new Scanner(System.in);

    public Hospital() {
        System.out.println("********************************");
        System.out.println("Welcome to Patch Adams Memorial");
        System.out.println("********************************\n");
        System.out.println("\n");
//    }


//    public void createDoctors() {
//        try {
        System.out.println("How many doctors occupy the hospital?");

        int userChoice = Integer.valueOf(inputScanner.nextLine());
        ArrayList<HospitalDoctor> doctorsList = new ArrayList<>();
        for (int counter = 0; counter < userChoice; counter++) {
            System.out.println("What is the first name of doctor " + (counter + 1));
            String docFirstName = inputScanner.nextLine();

            System.out.println("What is the last name of doctor " + (counter + 1));
            String docLastName = inputScanner.nextLine();

            System.out.println("What college did the doctor attend " + (counter + 1));
            String docCollege = inputScanner.nextLine();

            System.out.println("What is the specialty of doctor");
            System.out.println("1. Surgical Oncologist\n");
            System.out.println("2. Common Cold Doctor\n");
            int docSpecialty = Integer.valueOf(inputScanner.nextLine());
            if (docSpecialty == 1) {
                HospitalDoctor userDoc = new SurgicalOncologist(docFirstName, docLastName, docCollege);
                doctorsList.add(userDoc);
                System.out.println("You've successfully created " + docFirstName + (" ") + docLastName);
            } else if (docSpecialty == 2) {
                HospitalDoctor userDoc = new CommonColdDoctor(docFirstName, docLastName, docCollege);
                doctorsList.add(userDoc);
            }
        }
        for (int i = 0; i < doctorsList.size(); i++) {
            System.out.println("Doctor's first name: " + doctorsList.get(i).getFirstName());
        } //Displays the Doctors occupying the array
//        } catch (Exception exception) {
//            exception.printStackTrace();


//    public Patient createPatients() {
//        try {
        System.out.println("How many patients occupy the hospital");
        int userInput = Integer.valueOf(inputScanner.nextLine());
        Patient usersPatient;
        ArrayList<Patient> patientsList = new ArrayList<>();
        for (int patientCounter = 0; patientCounter <= userInput; patientCounter++) {
//            patientsList = new ArrayList<>();
            System.out.println("What is the first name of patient:");
//            patientsList[patientCounter].setFirstName(inputScanner.nextLine());
            String patFirstName = inputScanner.nextLine();
            System.out.println("What is the last name of patient:");
//            patientsList[patientCounter].setLastName(inputScanner.nextLine());
            String patLastName = inputScanner.nextLine();
            Patient userPatient = new Patient(patFirstName, patLastName);
            patientsList.add(userPatient);
            patientCounter++;
        }

        System.out.println("What patient would you like to use:");
        System.out.println("Please enter patient number");
        System.out.println("Enter 0 to exit");
        int patientSelection;
        for (int patientTicker = 0; patientTicker < patientsList.size(); patientTicker++) {
            System.out.println((patientTicker + 1) + " " + patientsList.get(patientTicker).getFirstName());
            System.out.println((patientTicker + 2)+ " " + patientsList.get(patientTicker +1).getFirstName());
            patientTicker++;
        }
        patientSelection = Integer.valueOf(inputScanner.nextLine());
        if (patientSelection == 0) {
            return;
        }
        usersPatient = patientsList.get(patientSelection-1);

        System.out.println("What is the patient sickness?");
        System.out.println("1. Cancer");
        System.out.println("2. Cold");
        System.out.println("3. Torn Acl");
        int patientSickness = Integer.valueOf(inputScanner.nextLine());
        if (patientSickness == 3) {
            System.out.println("Can't help ya");
            System.out.println("Try another Hospital");
            return;
        } else if (patientSickness == 1 && doctorsList.get(userChoice-1) instanceof SurgicalOncologist) {
            System.out.println("Surgery successful!");

        } else if (patientSickness == 2 && doctorsList.get(userChoice-1) instanceof CommonColdDoctor){
            System.out.println("Treatment Successful!");
        }


//            int illnessChoice = Integer.valueOf(inputScanner.nextLine());
//            if (illnessChoice == 1) {
//               // userPatient.setAffliction(1);
//                patientsList.add(userPatient);
//                patientCounter++;
//            } else if (illnessChoice == 2) {
////                    Patient userPatient = new Patient(patientFirstName, patientLastName);
//                //userPatient.setAffliction(2);
//                patientsList.add(userPatient);
//                patientCounter++;
//            } else if (illnessChoice == 3) {
////                    Patient userPatient = new Patient(patientFirstName, patientLastName);
//                //userPatient.setAffliction(3);
//                patientsList.add(patientCounter, userPatient);
//                patientCounter++;
//            } else if (illnessChoice == 4) {
////                    Patient userPatient = new Patient(patientFirstName, patientLastName);
//                //userPatient.setAffliction(4);
//                patientsList.add(patientCounter, userPatient);
//                patientCounter++;
//            } else if (illnessChoice == 5) {
////                    Patient userPatient = new Patient(patientFirstName, patientLastName);
//                //userPatient.setAffliction(5);
//                patientsList.add(patientCounter, userPatient);
//                patientCounter++;
//
//            }

    }
    }



