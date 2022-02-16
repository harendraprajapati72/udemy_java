public class LogicalOperators {
public static void main(String[] args) {
    int chemistryGrade=80;
    int englishGrade=70;
    String language="java";

    if(chemistryGrade >70 || englishGrade >75 || language.equals("java")){ // OR operatorsany one comparrision should be true
        System.out.println("You got scholorship");
    }else{
        System.out.println("We 're you did not get the scholorship");
    }
    int creadits=56;
    double GPA=3.6;
    if(creadits >=40 && GPA >=4.0){ // & operators both comparrision should be true
        System.out.println("You earned your Diploma");
    }else{
        System.out.println("Sorry You need atleast 40 creadits and minimum 2.0 GPA");
    }
}
}
