import game.Academy.Skills.SkillList;
import game.Academy.Skills.Skills.Blacksmithing;
import game.Test.OneTest;
import game.Test.TwoTest;

public class Main {
    public static void main(String[] args) {
        OneTest oneTest = new OneTest("Kitek",1,0);
        TwoTest twoTest = new TwoTest("Piesiek", 50, 500001);

        System.out.println(oneTest);
        System.out.println(twoTest);
        oneTest.addExperence(30);
        System.out.println(oneTest);
        System.out.println(twoTest);
        // dorób w Hero mechanizm odpowiadający za kondyję i energie (może klasa Taverd być dobra)
    //Choice choice = new Choice();
    //choice.run();
    }

}
