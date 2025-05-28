import java.util.Scanner;

class Greeting {
    public void g1(String name) {
        System.out.println(
                "\t\tHello " + name + "\n\n" + "This is Java Cardiologist       " + "How can I help you..? \n");
    }

    public void health(String gender) {
        int risk = 0;
        Scanner sc = new Scanner(System.in);

        // Blood Pressure
        System.out.println("\nIn Blood Pressure");
        System.out.print("\nSystolic count              : ");
        int systolic = sc.nextInt();
        System.out.print("\nDiasystolic count           : ");
        int diasystolic = sc.nextInt();

        if (systolic > 120) {
            if (diasystolic >= 80) {
                risk += 3;
            }
        }

        if (systolic < 90) {
            if (diasystolic < 60) {
                risk++;
            }
        }

        // LDL
        System.out.print("\n\nEnter your LDL(low- density lipoprotein or 'bad' cholestrol) : ");
        int LDL = sc.nextInt();
        if (LDL > 100) {
            risk += 3;
        }

        // Glucose Level
        float glucose;
        System.out.print("\nEnter your glucose level             :");
        glucose = sc.nextFloat();

        if (glucose > 11.1) {
            risk += 3;
        } else if (glucose > 7.8 && glucose <= 11.1) {
            risk += 2;
        } else if (glucose >= 6.1 && glucose <= 7.8) {
            risk++;
        }

        // Smoke
        System.out.println(
                "\nHow often do you smoke.?, Choose a number and enter it :\n 1. I smoke rarely \t 2. I am addicted to it \t 3. I Smoke moderately \t  4. I never smoke ");
        int smoke = sc.nextInt();
        if (smoke == 2) {
            risk += 3;
        } else if (smoke == 3) {
            risk += 2;
        } else if (smoke == 1) {
            risk++;
        } else if (smoke == 4) {
            System.out.println("Does anyone in your surrounding smoke:\n 1.yes \t 2.no");
            int secsmoke = sc.nextInt();
            if (secsmoke == 1) {
                risk++;
            }
        }

        // BMI
        System.out.print("\nEnter yor BMI(Body mass index)       :");
        int BMI = sc.nextInt();
        if (BMI >= 30) {
            risk += 3;
        }

        // Workout
        System.out.println(
                "\nHow often do you do workout: \n 1. Once a week or less \t 2. 2 or 3 or 4 times a week \t 3. 7 times a week\t 4. never ");
        int WO = sc.nextInt();
        if (WO == 4) {
            risk += 3;
        }
        if (WO == 1) {
            risk += 2;
        }

        // Diet
        System.out
                .println("How do you catagorize your diet:\n 1. Healthy diet \t 2. Unhealthy diet \t 3. Moderate diet");
        int diet = sc.nextInt();
        if (diet == 2) {
            risk += 3;
        }
        if (diet == 3) {
            risk++;
        }
        if (gender.equals("male")) {
            risk++;
        }
        if (gender.equals("female")) {
            System.out.println("Did you had menopause\n 1.yes \t 2.no");
            int meno = sc.nextInt();
            if (meno == 1) {
                risk++;
            }
        }
        // Output

        // Medicalreceipt
        System.out.println("\n\t\tMedical Receipt of the Patient ");
        System.out.println("\n");
        System.out.println("Gender                         : " + gender);
        System.out.println("Systolic Count                 : " + systolic);
        System.out.println("Diasystolic Count              : " + diasystolic);
        System.out.println("LDL                            : " + LDL);
        System.out.println("Glucose Level                  : " + glucose);
        System.out.println("BodyMassIndex                  : " + BMI);

        if (risk >= 10) {
            System.out.println("\nBetter to consult a Doctor. Your Heart is in Risky condition about " + risk);
            System.out.println("\n");
        } else {
            System.out.println("Your Heart is in Safe condition...");
            System.out.println("\n");
        }

        sc.close();
    }
}

// HeartDisease
class HeartDisease {
    public void heart() {
        Scanner v = new Scanner(System.in);

        // Patient Details
        System.out.print("Please Enter your name  : ");
        String Name = v.nextLine();
        System.out.print("\nEnter gender          : ");
        String Gender = v.nextLine();
        System.out.print("\nEnter your Age        : ");
        int age = v.nextInt();

        // Symptoms
        System.out.println("\n Enter the symptoms from the following : ");
        System.out.println(
                "\t \t \n chest pain, \n shortness of breath , \n fatigue(feeling exhausted) , \n dizziness(feeling faint), \n swelling in ankles \n \n");

        Scanner k = new Scanner(System.in);
        String symptoms = k.nextLine().toLowerCase();

        // heartbeat rate
        System.out.print("\n \n Enter Heartbeat rate           : ");
        int heartRate = v.nextInt();

        // spo2
        System.out.print("\n Enter spo2(Oxygen Satuaration) level : ");
        int oxygenSaturation = v.nextInt();

        // type of disease
        String diseaseType;
        if (heartRate < 60) {
            diseaseType = "Bradycardia";
        } else if (heartRate > 100) {
            diseaseType = "Tachycardia";

        } else {
            diseaseType = "Normal";
        }

        // Medicalreceipt
        System.out.println("\nMedical Receipt of " + Name);
        System.out.println("\n");
        System.out.println("Age                         : " + age);
        System.out.println("Gender                      : " + Gender);
        System.out.println("Symptoms                    : " + symptoms);
        System.out.println("HeartBeat Rate              : " + heartRate);
        System.out.println("spo2 Level                  : " + oxygenSaturation);
        System.out.println("HeartDisease                : " + diseaseType);

        // medicines

        System.out.println("\n \n Medicines to be prescribed : ");
        if (symptoms.contains("chest pain")) {
            System.out.println("                              Nitroglycerine, ");
        }

        if (symptoms.contains("shortness of breath")) {
            System.out.println("                              Diuretics, ");
        }
        if (symptoms.contains("dizziness")) {
            System.out.println("                              Calcium channel blockers, ");
        }

        if (symptoms.contains("swelling in ankles")) {
            System.out.println("                              ACE inhibitors, ");
        }
        System.out.println("                              Aspirin");

        // precautions

        System.out.println("\n \n Precautions to follow      : ");
        if (heartRate < 60) {
            System.out.println("                              Avoid strenuos activities , ");
        }

        if (symptoms.contains("chest pain")) {
            System.out.println("                              Avoid heavy meals, ");
        }
        if (symptoms.contains("shortness of breath")) {
            System.out.println("                              Maintain healthy meals,  ");
        }

        if (symptoms.contains("fatigue")) {
            System.out.println("                              Manage stress levels, ");
        }
        if (symptoms.contains("dizziness")) {
            System.out.println("                              Get plenty of rest, ");
        }
        if (symptoms.contains("swelling in ankles")) {
            System.out.println("                              Reduce salt intake, \n ");
        }
        System.out.println(
                "                              Quit smokking , \n                              Maintain a healthy diet");

        System.out.println("\n \nThankYou...Have a HealthyLife...");

        v.close();
        k.close();

    }

}

// MainClass
class JavaProjectFinal {
    public static void main(String args[]) {
        Greeting gr = new Greeting();
        HeartDisease d = new HeartDisease();
        Scanner sc = new Scanner(System.in);

        // Name
        System.out.println("Hi! Enter your name:");
        String name = sc.nextLine();

        gr.g1(name);

        System.out.println(
                "I can help you with following thing. Choose one of them:\n\n"
                        + "\tPress 1 to Know about your Heart Health\n"
                        + "\tPress 2  Want to know if you have any heart diseases\n");
        int cho1 = sc.nextInt();
        sc.nextLine();

        // Details

        if (cho1 == 1) {
            System.out.print("Please Enter your gender    : ");
            String gender = sc.nextLine().toLowerCase();
            gr.health(gender);
        } else if (cho1 == 2) {
            // System.out.println("Invalid option");

            d.heart();

        } else {
            System.out.println("choose valid option..!");
        }
        sc.close();
    }
}
