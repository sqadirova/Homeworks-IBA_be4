package homework12.console;


import homework12.entity.human.Human;
import homework12.entity.family.Family;
import homework12.entity.pet.DomesticCat;

import java.util.Arrays;
import java.util.HashSet;

public class FillWithTestData implements  Command {
    @Override
    public int OptNumber() {
        return 1;
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execution() {

        //family-1
        Human mother1 = new Human("Sevda", "Qadirova", "01/02/1967");
        Human father1 = new Human("Seyran", "Qadirov", "15/02/1963");
        Human daughter1 = new Human("Sidiqa", "Qadirova", "01/03/1997");
        Human daughter1_2 = new Human("Irade", "Qadirova", "01/04/1998");
        Human son1 = new Human("Ali", "Qadirov", "01/02/1994");

        //family-2
        Human mother2 = new Human("Arzu", "Aliyeva", "05/02/1970");
        Human father2 = new Human("Hasan", "Aliyev", "01/04/1967");
        Human son2 = new Human("Farid", "Aliyev", "20/02/1994");

        DomesticCat cat = new DomesticCat("Leopold", 4, 60, new HashSet<String>(Arrays.asList("sleep", "drink", "eat")));

        console.printLn("Database is filled with test data...");

        Family family = new Family(mother1, father1);
        fc.createNewFamily(mother1, father1);
        fc.adoptChild(family, son1);
        fc.adoptChild(family, daughter1_2);
        fc.adoptChild(family, daughter1);
        family.addPet(cat);

        Family family2 = new Family(mother2, father2);
        fc.createNewFamily(mother2, father2);
        fc.adoptChild(family2, son2);
    }

}



