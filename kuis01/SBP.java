package kuis01;

public class SBP {
    public static void main(String[] args) {
        
        boolean faktaA = true;
        boolean faktaE = true;

        
        boolean ruleB = false, ruleC = false, ruleF = false, ruleG = false, ruleH = false, ruleI = false, ruleJ = false, ruleK = false;

    
        System.out.println("Fakta:");
        System.out.println("fakta A bernilai " + faktaA);
        System.out.println("fakta E bernilai " + faktaE);

        System.out.println("Tujuan:");
        System.out.println("Menentukan apakah K bernilai benar?");

        System.out.println(" ");

        System.out.println("C= " + ruleC);
        System.out.println("F= " + ruleF);
        System.out.println("G= " + ruleG);
        System.out.println("H= " + ruleH);
        System.out.println("I= " + ruleI);
        System.out.println("J= " + ruleJ);
        System.out.println("K= " + ruleK);

        System.out.println(" ");
        
        ruleC = faktaA && ruleB;
        ruleF = faktaA && faktaE;
        ruleG = faktaA;
        ruleH = ruleG && faktaE;
        ruleI = ruleC && ruleH;
        ruleJ = ruleI && faktaA || ruleG;
        ruleK = ruleJ;

        
        System.out.println("Rule akhir:");
        System.out.println("nilai C=  " + ruleC);
        System.out.println("nilai F=  " + ruleF);
        System.out.println("nilai G=  " + ruleG);
        System.out.println("nilai H=  " + ruleH);
        System.out.println("nilai I=  " + ruleI);
        System.out.println("nilai J=  " + ruleJ);
        System.out.println("nilai K=  " + ruleK);

        System.out.println(" ");

        System.out.println("Jadi: ");
        System.out.println("apakah K bernilai benar?");
        System.out.println("K bernilai: " + ruleK);
    }
}
